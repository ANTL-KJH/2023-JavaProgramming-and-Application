package ch08_SkipList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
public class SkipList<E extends Comparable<E>> implements Iterable<E> {
    protected String _name;
    private QuadNode<E> _head;
    private double probability; // probability to increase the level of tower
    protected static final Random randomGenerator = new Random();
    private int size;

    public SkipList() {
        this("", 0.5); // default priority = 0.5
    }

    public SkipList(String name, double probability) {
        this._name = name;
        this._head = new QuadNode<E>(null, 0); // (entry=null, level=0)
        this.probability = probability;
        this.size = 0;
    }

    public String getName() {
        return this._name;
    }
    public E get(E key) {
        checkValidity(key);
        QuadNode<E> node = findNode(key);
        if (node.getEntity().compareTo(key) == 0)
            return node.getEntity();
        else
            return null;
    }
    public boolean contains(E key) {
        return this.get(key) != null;
    }
    public int size() {
        return size;
    }
    public boolean empty() {
        return size == 0;
    }

    public void add(E key) {
        checkValidity(key);
        QuadNode<E> node = findNode(key);
        if (node.getEntity() != null && node.getEntity().compareTo(key) == 0) {
            node.setEntity(key);
            return;
        }
        QuadNode<E> newNode = new QuadNode<E>(key, node.getLevel());
        horizontalInsert(node, newNode);
// Decide level according to the probability function
        int currentLevel = node.getLevel();
        int headLevel = this._head.getLevel();
        while (isBuildLevel()) {
// buiding a new level
            if (currentLevel >= headLevel) {
                QuadNode<E> newHead = new QuadNode<E>(null, headLevel + 1);
                verticalLink(newHead, this._head);
                this._head = newHead;
                headLevel = this._head.getLevel();
            }
// copy node and newNode to the upper level
            while (node.getUp() == null) {
                node = node.getPrev();
            }
            node = node.getUp();
            QuadNode<E> tmp = new QuadNode<E>(key, node.getLevel());
            horizontalInsert(node, tmp);
            verticalLink(tmp, newNode);
            newNode = tmp;
            currentLevel++;
        } // end outer-while
        size++;
    }

    public void remove(E key) {
        checkValidity(key);
        QuadNode<E> node = findNode(key);
        if (node == null || node.getEntity().compareTo(key) != 0)
            throw new NoSuchElementException("The key is not exist!");
// Move to the bottom
        while (node.getDown() != null)
            node = node.getDown();
// Because node is on the lowest level so we need remove by down-top
        QuadNode<E> prev = null, next = null;
        for (; node != null; node = node.getUp()) {
            prev = node.getPrev();
            next = node.getNext();
            if (prev != null)
                prev.setNext(next);
            if (next != null)
                next.setPrev(prev);
        }
// Adjust head
        while (this._head.getNext() == null && this._head.getDown() != null) {
            this._head = this._head.getDown();
            this._head.setUp(null);
        }
        size--;
    }

    protected QuadNode<E> findNode(E key) {
        QuadNode<E> node = _head;
        QuadNode<E> next = null;
        QuadNode<E> down = null;
        E nodeKey = null;
        while (true) {
// Searching nearest (less than or equal) node with special key
            next = node.getNext();
            while (next != null && lessThanOrEqual(next.getEntity(), key)) {
                node = next;
                next = node.getNext();
            }
            nodeKey = node.getEntity();
            if (nodeKey != null && nodeKey.compareTo(key) == 0)
                break;
// Descend to the bottom for continue search
            down = node.getDown();
            if (down != null) {
                node = down;
            } else {
                break;
            }
        } // end outer-while
        return node;
    }

    protected void checkValidity(E ent) {
        if (ent == null)
            throw new IllegalArgumentException("Key must not be null!");
    }

    protected boolean lessThanOrEqual(E a, E b) {
        return a.compareTo(b) <= 0;
    }

    protected boolean isBuildLevel() {
        return randomGenerator.nextDouble() < this.probability;
    }

    protected void horizontalInsert(QuadNode<E> x, QuadNode<E> y) {
        y.setPrev(x);
        y.setNext(x.getNext());
        if (x.getNext() != null)
            x.getNext().setPrev(y);
        x.setNext(y);
    }

    protected void verticalLink(QuadNode<E> x, QuadNode<E> y) {
        x.setDown(y);
        y.setUp(x);
    }

    @Override
    public Iterator<E> iterator() {
        return new SkipListIterator<E>(this._head);
    }


    @Override
    public String toString() {
        String str = this._name;
        str += String.format("(size = %3d) : ", this.size);
        if (this.size == 0) {
            str += "Empty";
            return str;
        } else {
            str += "[";
        }
        QuadNode<E> node = this._head;
// Move into the lower left bottom
        while (node.getDown() != null)
            node = node.getDown();
        while (node.getPrev() != null)
            node = node.getPrev();
// Head node with each level the key is null
// so need to move into the next node
        if (node.getNext() != null)
            node = node.getNext();
        while (node != null) {
            str += String.format("%3s", node);
            node = node.getNext();
        }
        str += " ]";
        return str;
    }
}


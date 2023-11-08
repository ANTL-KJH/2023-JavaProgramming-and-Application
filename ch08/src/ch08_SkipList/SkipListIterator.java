package ch08_SkipList;

import java.util.Iterator;

public class SkipListIterator<E extends Comparable<E>>
        implements Iterator<E> {
    private QuadNode<E> node;
    public SkipListIterator(QuadNode<E> node) {
        while (node.getDown() != null)
            node = node.getDown();
        while (node.getPrev() != null)
            node = node.getPrev();
        if (node.getNext() != null)
            node = node.getNext();
        this.node = node;
    }
    @Override
    public boolean hasNext() {
        return this.node != null;
    }
    @Override
    public E next() {
        E result = node.getEntity();
        node = node.getNext();
        return result;
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
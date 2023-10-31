package ch08_SkipList;

public class QuadNode <E extends Comparable<E>> {
    private E _entity;
    private int level;
    private QuadNode<E> up, down, next, prev;

    public QuadNode(E ent, int level) { // constructor
        this._entity = ent;
        this.level = level;
    }

    public String toString() {
        String str;

        str = "";
        if (this._entity == null)
            str += "None";
        else
            str += this._entity.toString();
        return str;
    }

    public E getEntity() {
        return _entity;
    }

    public void setEntity(E ent) {
        this._entity = ent;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public QuadNode<E> getUp() {
        return up;
    }
    public void setUp(QuadNode<E> up) {
        this.up = up;
    }
    public QuadNode<E> getDown() {
        return down;
    }
    public void setDown(QuadNode<E> down) {
        this.down = down;
    }
    public QuadNode<E> getNext() {
        return next;
    }
    public void setNext(QuadNode<E> next) {
        this.next = next;
    }
    public QuadNode<E> getPrev() {
        return prev;
    }
    public void setPrev(QuadNode<E> prev) {
        this.prev = prev;
    }
}
package ch07_GenericArray;

public class GenericArray<E> {
    private Object[] genArray;
    private int capacity;
    private int size;
    public GenericArray(int capa) {
        this.genArray = new Object[capa];
        this.capacity = capa;
        this.size = 0;
    }
    boolean add(E ent) {
        this.add(this.size, ent);
        return true;
    }
    boolean add(int i, E ent) {
        if ((this.size + 1) > this.capacity) {
            Object[] newArray = new Object[this.capacity * 2];
            for (int j = 0; j < this.size; j++) {
                newArray[j] = this.genArray[j];
            }
            this.genArray = newArray;
            this.capacity = this.capacity * 2;
        }
        for (int j=i; i<this.size; j++) {
            this.genArray[j+1] = this.genArray[j];
        }
        this.genArray[i] = ent;
        this.size++;
        return true;
    }
    void setElement(int i, E ent) {
        this.genArray[i] = ent;
    }
    E get(int i) {
        return (E)this.genArray[i];
    }
    E remove(int i) {
        E ent = (E) this.genArray[i];
        for (int j=i+1; j<this.size; j++) {
            this.genArray[j-1] = this.genArray[j];
        }
        this.size--;
        return ent;
    }
    void reverse() {
        Object temp;
        for (int i=0; i<(this.capacity)/2; i++) {
            int j = this.capacity - 1 - i;
            temp = this.genArray[j];
            this.genArray[j] = this.genArray[i];
            this.genArray[i] = temp;
        }
    }
    int getSize() {
        return this.size;
    }
    int getCapacity() {
        return this.capacity;
    }
    void print() {
        if (this.size <= 0) {
            System.out.println("Empty !!");
            return;
        } else {
            System.out.print("[");
        }
        for (int i=0; i<this.size-1; i++) {
            System.out.print(this.genArray[i] + ", ");
        }
        System.out.print(this.genArray[this.size-1] + "]");
    }
}

package ch07_HeapPriQ_Entry;

public class GenericArray <E>{
    protected Object[] genArray;
    protected int capacity;
    protected int size;
    public GenericArray(int capa) {
        this.genArray = new Object[capa];
        this.capacity = capa;
        this.size = 0;
    }
}

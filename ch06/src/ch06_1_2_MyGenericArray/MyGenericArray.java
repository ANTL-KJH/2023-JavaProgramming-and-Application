package ch06_1_2_MyGenericArray;

public class MyGenericArray<T> {
    private Object[] genArray;
    private int capacity;
    public MyGenericArray(int size) {
        this.genArray = new Object[size];
        this.capacity = size;
    }
    void setElement(int i, T ent) {
        this.genArray[i] = ent;
    }
    T getElement(int i) {
        return (T)this.genArray[i];
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
}

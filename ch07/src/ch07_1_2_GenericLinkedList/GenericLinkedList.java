package ch07_1_2_GenericLinkedList;

public class GenericLinkedList<T> {
    private DLLN<T> head;
    private DLLN<T> tail;
    private int count;
    private class DLLN<T> {
        private T data;
        private DLLN<T> next;
        private DLLN<T> prev;
        public DLLN() {
            this.data = null;
            this.next = null;
        }
        public DLLN(T obj) {
            this.data = obj;
            this.next = null;
            this.prev = null;
        }
        public T getData() {
            return data;
        }
        public void setData(T data) {
            this.data = data;
        }
        public DLLN<T> getNext() {
            return next;
        }
        public DLLN<T> getPrev() {
            return prev;
        }
        public void setNext(DLLN<T> next) {
            this.next = next;
        }
        public void setPrev(DLLN<T> prev) {
            this.prev = prev;
        }
    }
    public GenericLinkedList() {
        DLLN<T> dummyHead = new DLLN<T>();
        DLLN<T> dummyTail = new DLLN<T>();
        this.head = dummyHead;
        this.tail = dummyTail;
        this.head.next = this.tail;
        this.tail.prev = this.head;
        this.count = 0;
    } /** Add new DLLN with value to the list */
    public void insertBack(T data) {
        DLLN<T> newDLLN = new DLLN<T>(data);
        DLLN<T> prevDLLN = this.tail.getPrev();
        prevDLLN.setNext(newDLLN);
        newDLLN.setPrev(prevDLLN);
        this.tail.setPrev(newDLLN);
        newDLLN.setNext(this.tail);
        count++;
    }
    public void insertFront(T data) {
        DLLN<T> newDLLN = new DLLN<T>(data);
        DLLN<T> nextDLLN = this.head.getNext();
        newDLLN.setNext(nextDLLN);
        this.head.setNext(newDLLN);
        nextDLLN.setPrev(newDLLN);
        count++;
    }
    public T removeFront() {
        DLLN<T> tobeRemovedDLLN = this.head.getNext();
        DLLN<T> nextDLLN = tobeRemovedDLLN.getNext();
        this.head.setNext(nextDLLN);
        this.count--;
        return tobeRemovedDLLN.getData();
    }
    public void remove(T data) {
        DLLN<T> current = head;
        if (this.head.getData().equals(data)) {
            if (this.head.getNext() == null) {
                DLLN<T> newNode = new DLLN<T>();
                this.head.setData(null);
                this.head = newNode;
                this.tail = this.head;
            } else {
                this.head.setData(null);
                this.head = this.head.getNext();
            }
        } else {
            boolean wasDeleted = false;
            while (!wasDeleted) {
                DLLN<T> currentNext = current.getNext();
                if (currentNext.getData().equals(data)) {
                    currentNext.setData(null);
                    current.setNext(currentNext.getNext());
                    currentNext = null;
                    wasDeleted = true;
                    count--;
                } else {
                    current = current.getNext();
                }
            }
        }
    }
    public void print() {
        if (this.count <= 0) {
            System.out.print("DLL is empty !!");
            return;
        }
        DLLN<T> crrDLLN = this.head.getNext();
        System.out.print("[");
        while (crrDLLN != this.tail) {
            if (crrDLLN.getData() != null) {
                if (crrDLLN.getNext() != this.tail) {
                    System.out.print(crrDLLN.getData().toString() + ",");
                } else {
                    System.out.print(crrDLLN.getData().toString() + "]");
                }
                crrDLLN = crrDLLN.getNext();
            }
        }
        System.out.println();
    }
    public int getCount() {
        return count;
    }
}

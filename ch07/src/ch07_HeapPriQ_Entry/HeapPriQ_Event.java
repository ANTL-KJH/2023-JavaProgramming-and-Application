package ch07_HeapPriQ_Entry;

public class HeapPriQ_Event extends CompleteBinaryTree<Event>{
    final int CBT_ROOT = 1;
    public HeapPriQ_Event(String name, int capacity) {
        super(name, capacity);
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public boolean isFull() {
        return this.size >= this.capacity;
    }
    public int size() {
        return this.size;
    }
    public int insert(Event ev) {
        int index, prIndex;
        if (isFull()) {
            System.out.printf("%s is full !!\n", this.name);
            return size();
        }
        index = addAtEnd(ev);
        while (index != CBT_ROOT) {
            prIndex = parentIndex(index);
            Event curEv, prEv;
            curEv = (Event) this.genArray[index];
            prEv = (Event) this.genArray[prIndex];
            int curKey, prKey;
            curKey = (int)curEv.getPriority();
            prKey = (int)prEv.getPriority();
            if (curKey >= prKey) {
                break;
            } else {
                this.genArray[prIndex] = curEv;
                this.genArray[index] = prEv;
                index = prIndex;
            }
        } // end while
        this.size++;
        return size();
    }
    public Event removeHeapMin() {
        if (this.endIndex == 0) {
            return null;
        }
        Event minEv = (Event)getCBTRoot();
        if (this.size == 1) {
            removeCBTEnd();
        } else {
            Event curEv, chEv, rchEv;
            int curIndex, chIndex, rchIndex;
            int curPri, chPri, rchPri;
            Event temp_ev;
            this.genArray[CBT_ROOT] = this.genArray[this.endIndex];
            curIndex = CBT_ROOT;
            this.endIndex--;
            while(hasLeftChild(curIndex)) {
                curEv = (Event)this.genArray[curIndex];
                curPri = curEv.getPriority();
                chIndex = leftChildIndex(curIndex);
                rchIndex = rightChildIndex(curIndex);
                chEv = (Event)this.genArray[chIndex];
                chPri = chEv.getPriority();
                if (hasRightChild(curIndex)) {
                    rchEv = (Event)this.genArray[rchIndex];
                    rchPri = rchEv.getPriority();
                    if (chPri > rchPri) {
// if right child has higher priority that left child
                        chEv = (Event)this.genArray[rchIndex];
                        chIndex = rchIndex;
                        chPri = rchPri;
                    }
                } if (
                        curPri >
                                chPri) {
// if child Ev's priority is higher than current Ev
                    /* swap curEv and chEv */
                    this.genArray[chIndex] = curEv;
                    this.genArray[curIndex] = chEv;
                }
                curIndex = chIndex;
            } // end while
        } // end if - else
        this.size--;
        return minEv;
    } // removeHeapMin()

}

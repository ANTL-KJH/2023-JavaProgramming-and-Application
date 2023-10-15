
public class HeapPriQ_Task extends CompleteBinaryTree<Task>{
    final int CBT_ROOT = 1;
    public HeapPriQ_Task(String name, int capacity) {
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
    public int insert(Task Task) {
        int index, prIndex;
        if (isFull()) {
            System.out.printf("%s is full !!\n", this.name);
            return size();
        }
        index = addAtEnd(Task);
        while (index != CBT_ROOT) {
            prIndex = parentIndex(index);
            Task curTask, prTask;
            curTask = (Task) this.genArray[index];
            prTask = (Task) this.genArray[prIndex];
            int curKey, prKey;
            curKey = (int)curTask.getPriority();
            prKey = (int)prTask.getPriority();
            if (curKey >= prKey) {
                break;
            } else {
                this.genArray[prIndex] = curTask;
                this.genArray[index] = prTask;
                index = prIndex;
            }
        } // end while
        this.size++;
        return size();
    }
    public Task removeHeapMin() {
        if (this.endIndex == 0) {
            return null;
        }
        Task minTask = (Task)getCBTRoot();
        if (this.size == 1) {
            removeCBTEnd();
        } else {
            Task curTask, chTask, rchTask;
            int curIndex, chIndex, rchIndex;
            int curPri, chPri, rchPri;
            Task temp_Task;
            this.genArray[CBT_ROOT] = this.genArray[this.endIndex];
            curIndex = CBT_ROOT;
            this.endIndex--;
            while(hasLeftChild(curIndex)) {
                curTask = (Task)this.genArray[curIndex];
                curPri = curTask.getPriority();
                chIndex = leftChildIndex(curIndex);
                rchIndex = rightChildIndex(curIndex);
                chTask = (Task)this.genArray[chIndex];
                chPri = chTask.getPriority();
                if (hasRightChild(curIndex)) {
                    rchTask = (Task)this.genArray[rchIndex];
                    rchPri = rchTask.getPriority();
                    if (chPri > rchPri) {
// if right child has higher priority that left child
                        chTask = (Task)this.genArray[rchIndex];
                        chIndex = rchIndex;
                        chPri = rchPri;
                    }
                } if (
                        curPri >
                                chPri) {
// if child Task's priority is higher than current Task
                    /* swap curTask and chTask */
                    this.genArray[chIndex] = curTask;
                    this.genArray[curIndex] = chTask;
                }
                curIndex = chIndex;
            } // end while
        } // end if - else
        this.size--;
        return minTask;
    } // removeHeapMin()

}

/**
 * Project Name : JavaProgramming and Application HW07.3
 * Program's purpose and basic function :
 * - class HeapPriQ_Task
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.15
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.15			v1.00			First Write
 */
public class HeapPriQ_Task extends CompleteBinaryTree<Task> {
    // data member
    final int CBT_ROOT = 1;

    // constructor
    public HeapPriQ_Task(String name, int capacity) {
        super(name, capacity);
    }

    // accessor
    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size >= this.capacity;
    }

    public int size() {
        return this.size;
    }

    // insert
    public int insert(Task Task) {
        int index, prIndex;
        if (isFull()) // Queue full
        {
            System.out.printf("%s is full !!\n", this.name);
            return size();
        }
        index = addAtEnd(Task); // insert at end
        while (index != CBT_ROOT) {
            prIndex = parentIndex(index);
            Task curTask, prTask;
            curTask = (Task) this.genArray[index];
            prTask = (Task) this.genArray[prIndex];
            int curKey, prKey;
            curKey = (int) curTask.getPriority();
            prKey = (int) prTask.getPriority();
            if (curKey >= prKey) {
                break;
            } else {
                this.genArray[prIndex] = curTask;
                this.genArray[index] = prTask;
                index = prIndex;
            }
        }
        this.size++;
        return size();
    }

    public Task removeHeapMin() // remove
    {
        if (this.endIndex == 0) {
            return null;
        }
        Task minTask = (Task) getCBTRoot();
        if (this.size == 1) {
            removeCBTEnd();
        } else {
            Task curTask, chTask, rchTask;
            int curIndex, chIndex, rchIndex;
            int curPri, chPri, rchPri;
            Task temp_Task;
            this.genArray[CBT_ROOT] = this.genArray[this.endIndex]; // end task를 root로 change
            curIndex = CBT_ROOT;
            this.endIndex--;
            while (hasLeftChild(curIndex)) // down heap bubbling
            {
                curTask = (Task) this.genArray[curIndex];
                curPri = curTask.getPriority();
                chIndex = leftChildIndex(curIndex);
                rchIndex = rightChildIndex(curIndex);
                chTask = (Task) this.genArray[chIndex];
                chPri = chTask.getPriority();
                if (hasRightChild(curIndex)) // 오른쪽 자식이 존재하는 경우
                {
                    rchTask = (Task) this.genArray[rchIndex];
                    rchPri = rchTask.getPriority();
                    if (chPri > rchPri)
                    {
                        chTask = (Task) this.genArray[rchIndex];
                        chIndex = rchIndex;
                        chPri = rchPri;
                    }
                }
                if (curPri > chPri) // 자식 task의 우선순위가 현재 task 우선순위보다 높은 경우
                {
                    // swap
                    this.genArray[chIndex] = curTask;
                    this.genArray[curIndex] = chTask;
                }
                curIndex = chIndex;
            }
        }
        this.size--;    // reduce size
        return minTask; // return removed Task
    }
}

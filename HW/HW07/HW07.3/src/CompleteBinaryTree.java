
/**
 * Project Name : JavaProgramming and Application HW07.3
 * Program's purpose and basic function :
 * - class CompleteBinaryTree
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.15
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.15			v1.00			First Write
 * JH KIM               2023.10.16          v1.01           Add comment
 */
public class CompleteBinaryTree <E> extends GenericArray<E>{
    // data member
    String name;
    int CBT_capacity;
    int endIndex;

    // constructor
    public CompleteBinaryTree(int capa) {
        super(capa+1);
    }
    public CompleteBinaryTree(String name, int capacity) {
        super(capacity+1);
        this.name = name;
        this.CBT_capacity = capacity;
        this.endIndex = 0;
    }
    // accessor
    public int getEndIndex() {
        return this.endIndex;
    }
    public E getCBTRoot() {
        E entry = (E)this.genArray[1];
        return entry;
    }

    public int addAtEnd(E entry) {
        if (this.endIndex >= this.CBT_capacity) {
            System.out.printf("%s is full now !!", this.name);
            return -1;
        } this.endIndex++;
        this.genArray[this.endIndex] = entry;
        return this.endIndex;
    }

    public void removeCBTEnd() {
        this.endIndex--;
        this.size--; // size is defined in GenericArray<E>
    }
    protected int parentIndex(int index) {
        return index/2;
    }
    protected int leftChildIndex(int index) {
        return index * 2;
    }
    protected int rightChildIndex(int index) {
        return index * 2 + 1;
    }
    protected boolean hasLeftChild(int index) {
        return (index * 2) <= endIndex;
    }
    protected boolean hasRightChild(int index) {
        return (index * 2 + 1) <= endIndex;
    }
}

/**
 * Project Name : JavaProgramming and Application HW07.2
 * Program's purpose and basic function :
 * - class BalancedBinarySearchTree
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.15
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.15			v1.00			First Write
 */

public class BalancedBinarySearchTreeNode<E> {
    private E _entry;
    private BalancedBinarySearchTreeNode<E> _parent;
    private BalancedBinarySearchTreeNode<E> _leftChild;
    private BalancedBinarySearchTreeNode<E> _rightChild;
    public BalancedBinarySearchTreeNode() {
        this._parent = null;
        this._leftChild = null;
        this._rightChild = null;
    }
    public BalancedBinarySearchTreeNode(E entry) {
        this._entry = entry;
        this._parent = null;
        this._leftChild = null;
        this._rightChild = null;
    }
    public E getEntry() {
        return this._entry;
    }
    public void setEntry(E newEntry) {
        this._entry = newEntry;
    }public BalancedBinarySearchTreeNode<E> getParent() {
        return this._parent;
    }
    public BalancedBinarySearchTreeNode<E> getLeftChild() {
        return this._leftChild;
    }
    public BalancedBinarySearchTreeNode<E> getRightChild() {
        return this._rightChild;
    }
    public void setParent(BalancedBinarySearchTreeNode<E> prBSTN) {
        this._parent = prBSTN;
    }
    public void setLeftChild(BalancedBinarySearchTreeNode<E> leftChildBSTN) {
        this._leftChild = leftChildBSTN;
    }
    public void setRightChild(BalancedBinarySearchTreeNode<E> rightChildBSTN) {
        this._rightChild = rightChildBSTN;
    }
    public int compareKey(E otherEntry) {
        int cmpResult = 0;
        if (this._entry instanceof Integer) {
            cmpResult = (int) (this._entry) - (int) otherEntry;
        } else if (this._entry instanceof Double) {
            if ((double) (this._entry) > (double)otherEntry)
                cmpResult = 1;
            else if ((double) (this._entry) < (double)otherEntry)
                cmpResult = -1;
            else
                cmpResult = 0;
        } else if (this._entry instanceof String) {
            cmpResult = ((String)(this._entry)).compareTo((String)(otherEntry));
        } else {
            System.out.println("compareKey() is not defined for entry_type E !!");
        }
        return cmpResult;
    }
}

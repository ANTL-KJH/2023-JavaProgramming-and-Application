package ch07_BinarySearchTree;

public class BinarySearchTree<E> {
    private String _name;
    private BinarySearchTreeNode<E> _root;
    private int _numEntry;
    public BinarySearchTree (String bst_nm) {
        this._name = bst_nm;
        this._root = null;
        this._numEntry = 0;
    }
    public int size() {
        return this._numEntry;
    }
    public boolean isEmpty() {
        return (this._numEntry == 0);
    }
    public BinarySearchTreeNode<E> getRoot() {
        return this._root;
    }
    private BinarySearchTreeNode<E> _insertInOrder(
            BinarySearchTreeNode<E> subRoot_bstn,
            BinarySearchTreeNode<E> pr_bstn, E newEntry)
    {
        BinarySearchTreeNode<E> new_bstn, bstn = null, leftChild, rightChild;
        if (subRoot_bstn == null) {
            new_bstn = new BinarySearchTreeNode<E>(newEntry);
            if (this._numEntry == 0)
                this._root = new_bstn; // this BSTN becomes the _root
            new_bstn.setParent(null);
            new_bstn.setLeftChild(null);
            new_bstn.setRightChild(null);
            this._numEntry++;
            return new_bstn;
        } else {
            if (subRoot_bstn.compareKey(newEntry) > 0) {
                leftChild = subRoot_bstn.getLeftChild();
                bstn = _insertInOrder(leftChild, subRoot_bstn, newEntry);
                if (bstn != null) {
                    subRoot_bstn.setLeftChild(bstn);
                    bstn.setParent(subRoot_bstn);
                }return null;
            }
            else if (subRoot_bstn.compareKey(newEntry) < 0) {
                rightChild = subRoot_bstn.getRightChild();
                bstn =_insertInOrder(rightChild,
                        subRoot_bstn, newEntry);
                if (bstn != null) {
                    subRoot_bstn.setRightChild(bstn);
                    bstn.setParent(subRoot_bstn);
                }
                return null;
            } else {
                subRoot_bstn.setEntry(newEntry);
                bstn = subRoot_bstn;
                return null;
            }
        }
    }
    public BinarySearchTreeNode<E> insert(E newEntry) {
        BinarySearchTreeNode<E> bstn;
        bstn = _insertInOrder(this._root, null, newEntry);
        return bstn;
    }
    public BinarySearchTreeNode<E> _search(BinarySearchTreeNode<E> subRoot, E searchKey) {
        BinarySearchTreeNode<E> bstn_result = null;
        if (subRoot == null)
            return null;
        if (subRoot.compareKey(searchKey) == 0)
            return subRoot;
        else if (subRoot.compareKey(searchKey) > 0) { // search key is less/smaller than the key of subRoot
            bstn_result = _search(subRoot.getLeftChild(), searchKey);
            return bstn_result;
        } else {// search key is greater/bigger than the key of subRoot
            bstn_result = _search(subRoot.getRightChild(), searchKey);
            return bstn_result;
        }
    }
    public BinarySearchTreeNode<E> search(E searchKey) {
        BinarySearchTreeNode<E> bstn_result = null;
        bstn_result = _search(this._root, searchKey);
        return bstn_result;
    }
    public BinarySearchTreeNode<E>
    _findMin(BinarySearchTreeNode<E> bstn) {
        if (bstn.getLeftChild() != null) {
            bstn = bstn.getLeftChild();
            while (bstn.getLeftChild() != null) {
                bstn = bstn.getLeftChild();
            }
        }
        return bstn;
    }
    public BinarySearchTreeNode<E>
    _findMax(BinarySearchTreeNode<E> bstn) {
        if (bstn.getRightChild() != null) {
            bstn = bstn.getRightChild();
            while (bstn.getRightChild() != null) {
                bstn = bstn.getRightChild();
            }
        }
        return bstn;
    }
}

/**
 * Project Name : JavaProgramming and Application HW07.2
 * Program's purpose and basic function :
 * - class BinarySearhTreeNode
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.15
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.15			v1.00			First Write
 */

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class BalancedBinarySearchTree<E> {
    private String _name;
    private BalancedBinarySearchTreeNode<E> _root;
    private int _numEntry;
    public BalancedBinarySearchTree(String bst_nm) {
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
    public BalancedBinarySearchTreeNode<E> getRoot() {
        return this._root;
    }

    public void setRoot(BalancedBinarySearchTreeNode<E> bstn)
    {
        this._root = bstn;
    }
    private BalancedBinarySearchTreeNode<E> _insertInOrder(BalancedBinarySearchTreeNode<E> subRoot_bstn, BalancedBinarySearchTreeNode<E> pr_bstn, E newEntry)
    {
        BalancedBinarySearchTreeNode<E> new_bstn, bstn = null, leftChild, rightChild;
        if (subRoot_bstn == null) {
            new_bstn = new BalancedBinarySearchTreeNode<E>(newEntry);
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
                bstn =_insertInOrder(rightChild, subRoot_bstn, newEntry);
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
    public BalancedBinarySearchTreeNode<E> insert(E newEntry) {
        BalancedBinarySearchTreeNode<E> bstn;
        bstn = _insertInOrder(this._root, null, newEntry);
        return bstn;
    }
    public BalancedBinarySearchTreeNode<E> _search(BalancedBinarySearchTreeNode<E> subRoot, E searchKey) {
        BalancedBinarySearchTreeNode<E> bstn_result = null;
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
    public BalancedBinarySearchTreeNode<E> search(E searchKey) {
        BalancedBinarySearchTreeNode<E> bstn_result = null;
        bstn_result = _search(this._root, searchKey);
        return bstn_result;
    }
    public BalancedBinarySearchTreeNode<E>
    _findMin(BalancedBinarySearchTreeNode<E> bstn) {
        if (bstn.getLeftChild() != null) {
            bstn = bstn.getLeftChild();
            while (bstn.getLeftChild() != null) {
                bstn = bstn.getLeftChild();
            }
        }
        return bstn;
    }
    public BalancedBinarySearchTreeNode<E>
    _findMax(BalancedBinarySearchTreeNode<E> bstn) {
        if (bstn.getRightChild() != null) {
            bstn = bstn.getRightChild();
            while (bstn.getRightChild() != null) {
                bstn = bstn.getRightChild();
            }
        }
        return bstn;
    }
    public void _inOrderTraversal(BalancedBinarySearchTreeNode<E>
                                          curBSTN, ArrayList<E> array_values) {
        if (curBSTN.getLeftChild() != null) {
            _inOrderTraversal(curBSTN.getLeftChild(), array_values);
        }
        array_values.add(curBSTN.getEntry());
        if (curBSTN.getRightChild() != null) {
            _inOrderTraversal(curBSTN.getRightChild(), array_values);
        }
    }
    public String toString() {
        ArrayList<E> array_values = new ArrayList<E>();
        String str = String.format("%s : ", this._name);
        _inOrderTraversal(this._root, array_values);
        for (E entry : array_values) {
            str += entry + " ";
        }
        return str;
    }
    public void _printBST_withDepth(BalancedBinarySearchTreeNode<E>curBSTN, int level) {
        if (curBSTN == null)
            return;
        if (curBSTN.getRightChild() != null) {
            _printBST_withDepth(curBSTN.getRightChild(), level + 1);
        }
        String str = "";
        for (int i=0; i<level; i++) {
            str += " ";
        }
        str += curBSTN.getEntry();
        System.out.println(str);
        if (curBSTN.getLeftChild() != null) {
            _printBST_withDepth(curBSTN.getLeftChild(), level + 1);
        }
    }
    public void printBST_withDepth() {
        BalancedBinarySearchTreeNode<E> bstn;
        if (this._numEntry == 0) {
            String str = "BinarySearchTree(%s) is Empty !!\n".formatted(this._name);
            System.out.println(str);
            return;
        }
        String str = String.format("BinarySearchTree(%s, num_entry= %d) :\n", this._name, this._numEntry);
        System.out.println(str);
        _printBST_withDepth(this._root, 0);
    }
    public int _getHeight(BalancedBinarySearchTreeNode<E> bstn) {
        int height = 0;
        int height_Lc, height_Rc;
        if (bstn != null) {
            height_Lc = _getHeight(bstn.getLeftChild());
            height_Rc = _getHeight(bstn.getRightChild());
            if (height_Lc > height_Rc)
                height = 1 + height_Lc;
            else
                height = 1 + height_Rc;
        }
        return height;
    }
    public int _getHeightDiff(BalancedBinarySearchTreeNode<E> bstn) {
        int heightDiff = 0;
        if (bstn != null) {
            heightDiff = _getHeight(bstn.getLeftChild()) -
                    _getHeight(bstn.getRightChild());
        }
        return heightDiff;
    }
    public BalancedBinarySearchTreeNode<E> _deleteBSTN(BalancedBinarySearchTreeNode<E> toBeDeleted) {
        BalancedBinarySearchTreeNode<E> newSubRoot = null, temp, w, wLc;
        if (toBeDeleted == null)
            return null;
        if (toBeDeleted.getLeftChild() == null && toBeDeleted.getRightChild() == null) {
            newSubRoot = null;
        } else if (toBeDeleted.getLeftChild() != null && toBeDeleted.getRightChild() == null) {
            newSubRoot = toBeDeleted.getLeftChild();
            newSubRoot.setParent(toBeDeleted.getParent());
        } else if (toBeDeleted.getLeftChild() == null && toBeDeleted.getRightChild() != null) {
            newSubRoot = toBeDeleted.getRightChild();
            newSubRoot.setParent(toBeDeleted.getParent());
        } else {
            int heightDiff = _getHeightDiff(toBeDeleted);
            BalancedBinarySearchTreeNode<E> lChild = toBeDeleted.getLeftChild();
            BalancedBinarySearchTreeNode<E> rChild = toBeDeleted.getRightChild();
            BalancedBinarySearchTreeNode<E> parToBeDeleted = toBeDeleted.getParent();
            BalancedBinarySearchTreeNode<E> ioPd = null, lcIoPd, parIoPd;
            BalancedBinarySearchTreeNode<E> ioSs = null, rcIoSs, parIoSs;
            if (heightDiff > 0) { // left subtree is higher, so put the in-order predecessor
// in the place of the toBeDeleted BSTN
                ioPd = _findMax(toBeDeleted.getLeftChild());
                lcIoPd = ioPd.getLeftChild();
                parIoPd = ioPd.getParent();
                if (ioPd.getParent() != toBeDeleted) {
                    ioPd.setLeftChild(lChild);
                    parIoPd.setRightChild(lcIoPd);
                    if (lcIoPd != null)
                        lcIoPd.setParent(parIoPd);
                }
                ioPd.setRightChild(rChild);
                ioPd.setParent(parToBeDeleted);
                newSubRoot = ioPd;
            }
            else { // right subtree is higher, so put the in-order successor
// in the place of the toBeDeleted BSTN
                ioSs = _findMin(toBeDeleted.getRightChild());
                rcIoSs = ioSs.getRightChild();
                parIoSs = ioSs.getParent();
                if (parIoSs != toBeDeleted) {
                    ioSs.setRightChild(rChild);
                    parIoSs.setLeftChild(rcIoSs);
                    if (rcIoSs != null)
                        rcIoSs.setParent(parIoSs);
                }
                ioSs.setLeftChild(lChild);
                ioSs.setParent(parIoSs);
                newSubRoot = ioSs;
            } if (
                    lChild != ioPd)
                lChild.setParent(newSubRoot);
            if (rChild != ioSs)
                rChild.setParent(newSubRoot);
        } // end if - else
        if (toBeDeleted == this._root)
            this._root = newSubRoot;
        this._numEntry--;
        return newSubRoot;
    }
    public BalancedBinarySearchTreeNode<E> _rotateLL(BalancedBinarySearchTreeNode<E> curSubRoot) {
        BalancedBinarySearchTreeNode<E> newSubRoot, BRC, curParent;
        curParent = curSubRoot.getParent();
        newSubRoot = curSubRoot.getLeftChild();
        BRC = newSubRoot.getRightChild();
        curSubRoot.setLeftChild(BRC);
        if (BRC != null)
            BRC.setParent(curSubRoot);
        newSubRoot.setRightChild(curSubRoot);
        newSubRoot.setParent(curParent);
        curSubRoot.setParent(newSubRoot);
        return newSubRoot;
    }
    public BalancedBinarySearchTreeNode<E> _rotateRR(BalancedBinarySearchTreeNode<E> curSubRoot) {
        BalancedBinarySearchTreeNode<E> newSubRoot, BLC, curParent;
        curParent = curSubRoot.getParent();
        newSubRoot = curSubRoot.getRightChild();
        BLC = newSubRoot.getLeftChild();
        curSubRoot.setRightChild(BLC);
        if (BLC != null)
            BLC.setParent(curSubRoot);
        newSubRoot.setLeftChild(curSubRoot);
        newSubRoot.setParent(curParent);
        curSubRoot.setParent(newSubRoot);
        return newSubRoot;
    }
    public BalancedBinarySearchTreeNode<E> _rotateLR(BalancedBinarySearchTreeNode<E> curSubRoot) {
        BalancedBinarySearchTreeNode<E> subRoot, newSubRoot, A, B, C, BL, BR, curParent;
        C = curSubRoot;
        curParent = curSubRoot.getParent();
        A = C.getLeftChild();
        B = A.getRightChild();
        BL = B.getLeftChild();
        BR = B.getRightChild();
        subRoot = _rotateRR(A);
        newSubRoot = _rotateLL(C);
        newSubRoot.setParent(curParent);
        A.setParent(newSubRoot);
        C.setParent(newSubRoot);
        if (BL != null)
            BL.setParent(A);
        if (BR != null)
            BR.setParent(C);
        return newSubRoot;
    }
    public BalancedBinarySearchTreeNode<E> _rotateRL(BalancedBinarySearchTreeNode<E> curSubRoot) {
        BalancedBinarySearchTreeNode<E> subRoot, newSubRoot, A, B, C, BL, BR, curParent;
        A = curSubRoot;
        curParent = curSubRoot.getParent();
        C = A.getRightChild();
        B = A.getLeftChild();
        BL = B.getLeftChild();
        BR = B.getRightChild();
        subRoot = _rotateLL(C);
        newSubRoot = _rotateRR(A);
        newSubRoot.setParent(curParent);
        A.setParent(newSubRoot);
        C.setParent(newSubRoot);
        if (BL != null)
            BL.setParent(A);
        if (BR != null)
            BR.setParent(C);
        return newSubRoot;
    }
    public BalancedBinarySearchTreeNode<E> _reBalance(BalancedBinarySearchTreeNode<E> curSubRoot) {
        BalancedBinarySearchTreeNode<E> newSubRoot = null;
        int heightDiff = 0;
        heightDiff = _getHeightDiff(curSubRoot);
        if (heightDiff > 1) { // left subtree is higher
            if (_getHeightDiff(curSubRoot.getLeftChild()) > 0) {
                newSubRoot = _rotateLL(curSubRoot);
            } else {
                newSubRoot = _rotateLR(curSubRoot);
            }
        } else if (heightDiff < -1) {
            if (_getHeightDiff(curSubRoot.getRightChild()) < 0) {
                newSubRoot = _rotateRR(curSubRoot);
            } else {
                newSubRoot = _rotateRL(curSubRoot);
            }
        }
        return newSubRoot;
    }
    public BalancedBinarySearchTreeNode<E> _insert_withRebalancing(BalancedBinarySearchTreeNode<E> curSubRoot,
                                                                   BalancedBinarySearchTreeNode<E> curParent, E newEntry) {
        BalancedBinarySearchTreeNode<E> newBSTN, bstn, LC, RC;
        if (curSubRoot == null) {
            newBSTN = new BalancedBinarySearchTreeNode<E>(newEntry);
            curSubRoot = newBSTN;
            if (curParent != null)
                newBSTN.setParent(curParent);
            newBSTN.setLeftChild(null);
            newBSTN.setRightChild(null);
            this._numEntry++;
            return curSubRoot;
        }
        E bstn_entry = curSubRoot.getEntry();
        if (curSubRoot.compareKey(newEntry) > 0) {
            LC = curSubRoot.getLeftChild();
            bstn = _insert_withRebalancing(LC, curSubRoot, newEntry);
            if (bstn != null) {
                curSubRoot.setLeftChild(bstn);
                curSubRoot = _reBalance(curSubRoot);
            }
        } else {
            RC = curSubRoot.getRightChild();
            bstn = _insert_withRebalancing(RC, curSubRoot, newEntry);
            if (bstn != null) {
                curSubRoot.setRightChild(bstn);
                curSubRoot = _reBalance(curSubRoot);
            }
        }
        return curSubRoot;
    }
    public void insert_withRebalancing(E newEntry) {
        BalancedBinarySearchTreeNode<E> newSubRoot;
        newSubRoot = _insert_withRebalancing(this._root, null, newEntry);
        if (newSubRoot != null)
            this._root = newSubRoot;
    }
    public void _fprintBST_withDepth(BalancedBinarySearchTreeNode<E>curBSTN, int level, Writer fout) throws IOException {
        if (curBSTN == null)
            return;
        if (curBSTN.getRightChild() != null) {
            _fprintBST_withDepth(curBSTN.getRightChild(), level + 1, fout);
        }
        String str = "";
        for (int i=0; i<level; i++) {
            str += " ";
        }
        str += curBSTN.getEntry();
        str += "\n";
        fout.write(str);
        if (curBSTN.getLeftChild() != null) {
            _fprintBST_withDepth(curBSTN.getLeftChild(), level + 1, fout);
        }
    }

    public void fprintBST_withDepth(Writer fout) throws IOException {
        if (this._numEntry == 0) {
            String str = "BinarySearchTree(%s) is Empty !!\n".formatted(this._name);
            fout.write(str);
            return;
        }
        String str = "BinarySearchTree (BST_%sEntry, num _entry=%d)".formatted(this._name, this._numEntry);
        fout.write(str);
        _fprintBST_withDepth(this._root, 0, fout);
    }

}


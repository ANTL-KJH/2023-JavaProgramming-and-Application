package ch07_BinarySearchTree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App_BalancedBinarySearchTree {
    public static void main(String[] args) throws IOException {
        final String fout_name = "C:\\Temp_JavaProg\\BST_test.txt";
        Scanner cin = new Scanner(System.in);
        //FileWriter fout = new FileWriter(fout_name);
        int[] intArray = {3, 5, 7, 9, 1, 2, 4, 6, 8, 0};
        String BST_name = "BST_IntegerEntry";
        BinarySearchTree<Integer> bstIntEntry = new BinarySearchTree<Integer>(BST_name);
        for (int int_entry : intArray) {
            bstIntEntry.insert_withRebalancing(int_entry);
            System.out.println(bstIntEntry);
        }
        //bstIntEntry.fprintBST_withDepth(fout);
        BinarySearchTreeNode<Integer> bstn_int;
        int int_searchKey = 1, searchResult;
        while(true) {
            System.out.printf("Input an int_searchKey (-1 to quit) : ");
            int_searchKey = cin.nextInt();
            if (int_searchKey == -1)
                break;
            bstn_int = bstIntEntry.search(int_searchKey);
            if ((bstn_int != null) && (int_searchKey == bstn_int.getEntry())){
                System.out.printf("int_searchKey(%d) is found in the %s\n",
                        int_searchKey, BST_name);
            } else {
                System.out.printf("int_searchKey(%d) is not found in the %s\n",
                        int_searchKey, BST_name);
            }
        }
        for (int i=0; i<intArray.length; i++) {
            BinarySearchTreeNode<Integer> bstn, BST_root = bstIntEntry.getRoot();
            bstn = bstIntEntry._deleteBSTN(BST_root);
            bstIntEntry.setRoot(bstn);
            //bstIntEntry.fprintBST_withDepth(fout);
        }
        String[] strArray = { "G", "H", "I", "C", "D", "A", "B", "E", "F", "J"};
        BST_name = "BST_StringEntry";
        BinarySearchTree<String> bstStringEntry = new BinarySearchTree<String>(BST_name);
        for (String str_entry : strArray) {
            bstStringEntry.insert_withRebalancing(str_entry);
            System.out.println(bstStringEntry);
        }
        //bstStringEntry.fprintBST_withDepth(fout);
        BinarySearchTreeNode<String> bstn_str;
        String str_searchKey, str_searchResult;
        while(true) {
            System.out.printf("Input a strt_searchKey (. to quit) : ");
            str_searchKey = cin.next();
            if (str_searchKey.equals("."))
                break;
            bstn_str = bstStringEntry.search(str_searchKey);
            if ((bstn_str != null) && str_searchKey.equals(bstn_str.getEntry())){
                System.out.printf("str_searchKey(%s) is found in the %s\n", str_searchKey,
                        BST_name);
            } else {
                System.out.printf("str_searchKey(%s) is not found in the %s\n",
                        str_searchKey, BST_name);
            }
        }
        BinarySearchTreeNode<String> bstn, BST_root;
        for (int i=0; i<strArray.length; i++) {
            BST_root = bstStringEntry.getRoot();
            bstn = bstStringEntry._deleteBSTN(BST_root);
            bstStringEntry.setRoot(bstn);
            //bstStringEntry.fprintBST_withDepth(fout);
        }
        cin.close();
        //fout.close();
    }
}

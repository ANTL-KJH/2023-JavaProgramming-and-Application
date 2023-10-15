/**
 * Project Name : JavaProgramming and Application HW07.2
 * Program's purpose and basic function :
 * - App BinarySearchTree with rebalancing
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.15
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.15			v1.00			First Write
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App_BalancedBinarySearchTree {
    public static void main(String[] args) throws IOException {
        // file path
        final String fout_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\HW\\HW07\\HW07.2\\BST_test.txt";

        // scanner and writer object
        Scanner cin = new Scanner(System.in);
        FileWriter fout = new FileWriter(fout_name);

        int[] intArray = {0, 1, 2, 3, 4, 5};
        String BST_name = "BST_IntegerEntry";   // bst name
        BalancedBinarySearchTree<Integer> bstIntEntry = new BalancedBinarySearchTree<Integer>(BST_name); // int bst
        for (int int_entry : intArray) {
            bstIntEntry.insert_withRebalancing(int_entry);  // insert
            System.out.println(bstIntEntry);
        }
        bstIntEntry.fprintBST_withDepth(fout);  // print out to file
        BalancedBinarySearchTreeNode<Integer> bstn_int;
        int int_searchKey = 1, searchResult;
        while(true) {
            System.out.printf("Input an int_searchKey (-1 to quit) : ");
            int_searchKey = cin.nextInt();  // search key input
            if (int_searchKey == -1)
                break;
            bstn_int = bstIntEntry.search(int_searchKey);   // search
            if ((bstn_int != null) && (int_searchKey == bstn_int.getEntry())){
                System.out.printf("int_searchKey(%d) is found in the %s\n", int_searchKey, BST_name);
            } else {
                System.out.printf("int_searchKey(%d) is not found in the %s\n", int_searchKey, BST_name);
            }
        }
        for (int i=0; i<intArray.length; i++) {
            BalancedBinarySearchTreeNode<Integer> bstn, BST_root = bstIntEntry.getRoot();
            bstn = bstIntEntry._deleteBSTN(BST_root);
            bstIntEntry.setRoot(bstn);
            bstIntEntry.fprintBST_withDepth(fout);
        }

        String[] strArray =
                { "A", "B", "C", "D", "E", "F", "G"};
        BST_name = "BST_StringEntry";   // bst name
        BalancedBinarySearchTree<String> bstStringEntry = new BalancedBinarySearchTree<String>(BST_name);   // string bst
        for (String str_entry : strArray) {
            bstStringEntry.insert_withRebalancing(str_entry);   // insert
            System.out.println(bstStringEntry);
        }
        bstStringEntry.fprintBST_withDepth(fout);
        BalancedBinarySearchTreeNode<String> bstn_str;
        String str_searchKey, str_searchResult;
        while(true) {
            System.out.printf("Input a strt_searchKey (. to quit) : ");
            str_searchKey = cin.next(); // search key
            if (str_searchKey.equals("."))
                break;
            bstn_str = bstStringEntry.search(str_searchKey);    // search
            if ((bstn_str != null) && str_searchKey.equals(bstn_str.getEntry())){
                System.out.printf("str_searchKey(%s) is found in the %s\n", str_searchKey, BST_name);
            } else {
                System.out.printf("str_searchKey(%s) is not found in the %s\n", str_searchKey, BST_name);
            }}
        BalancedBinarySearchTreeNode<String> bstn, BST_root;
        for (int i=0; i<strArray.length; i++) {
            BST_root = bstStringEntry.getRoot();
            bstn = bstStringEntry._deleteBSTN(BST_root); // delete
            bstStringEntry.setRoot(bstn);
            bstStringEntry.fprintBST_withDepth(fout);
        }
        cin.close();
        fout.close();
    }
}

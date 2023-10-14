package ch07_1_2_GenericLinkedList;

public class App_GenericLinkedList {
    public static void main(String[] args) {
        GenericLinkedList<String> DLL_str = new GenericLinkedList<String>();
        DLL_str.insertBack("A");
        DLL_str.insertBack("B");
        DLL_str.insertBack("C");
        DLL_str.insertBack("D");
        DLL_str.insertBack("E");
        DLL_str.print();
        System.out.printf("Total %d DLLN in DLL_str\n", DLL_str.getCount());
        while(DLL_str.getCount() > 0) {
            DLL_str.removeFront();
            System.out.printf("After removeFront() : ");
            DLL_str.print();
        } //DLL_str.remove("Me");
//DLL_str.print();
//System.out.println(DLL_str.getCount());
    }
}

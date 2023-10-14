package ch07_GenericArray;

public class App_GenericArray {
    public static void main(String[] args) {
        GenericArray<String> genericArray = new GenericArray<String>(1);
        char ch = 'A';
        for (int i=0; i<5; i++) {
            genericArray.add("" + ch);
            ch++;
        }
        System.out.printf("GenericArray(size=%d) : ", genericArray.getSize());
        genericArray.print(); System.out.println();
        for (int i=0; i<5; i++) {
            genericArray.remove(0);
            System.out.printf("After remove(0), GenericArray(size=%d) : ", genericArray.getSize());
            genericArray.print(); System.out.println();
        }
    }
}

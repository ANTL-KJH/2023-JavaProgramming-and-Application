package ch06_1_2_MyGenericArray;

public class App_MyGenericArray {
    public static void main(String[] args) {
        int genArr_size = 10;
        int entry;
        MyGenericArray<Integer> intGenArray = new MyGenericArray<Integer>(genArr_size);
        for (int i=0; i<genArr_size; i++) {
            intGenArray.setElement(i, i*i);
        }
        System.out.printf("Entries in intGenArray :\n");
        for (int i=0; i<genArr_size; i++) {
            entry = intGenArray.getElement(i);
            System.out.printf("%3d ", entry);
        }
        System.out.println();
        intGenArray.reverse();
        System.out.printf("Entries in dblGenArray after reverse() :\n");
        for (int i=0; i<genArr_size; i++) {
            entry = intGenArray.getElement(i);
            System.out.printf("%3d ", entry);
        }
        System.out.println();
        double dbl_entry;
        MyGenericArray<Double> dblGenArray = new MyGenericArray<Double>(genArr_size);
        for (double i=0, d = 1.23; i<genArr_size; i++, d += 1.11) {
            dblGenArray.setElement((int)i, d*d);
        }
        System.out.printf("Entries in dblGenArray :\n");
        for (int i=0; i<genArr_size; i++) {
            dbl_entry = dblGenArray.getElement(i);
            System.out.printf("%7.2f ", dbl_entry);
        }
        System.out.println();
        dblGenArray.reverse();
        System.out.printf("Entries in dblGenArray after reverse() :\n");
        for (int i=0; i<genArr_size; i++) {
            dbl_entry = dblGenArray.getElement(i);
            System.out.printf("%7.2f ", dbl_entry);
        }
        System.out.println();
        char char_entry;
        MyGenericArray<Character> charGenArray = new MyGenericArray<Character>(genArr_size);
        char ch = 'A';
        for (int i=0; i<genArr_size; i++) {
            charGenArray.setElement(i, ch);
            ch += 1;
        }
        System.out.printf("Entries in charGenArray :\n");
        for (int i=0; i<genArr_size; i++) {
            char_entry = charGenArray.getElement(i);
            System.out.printf("%3c", char_entry);
        }
        System.out.println();
        charGenArray.reverse();
        System.out.printf("Entries in charGenArray after reverse() :\n");
        for (int i=0; i<genArr_size; i++) {
            char_entry = charGenArray.getElement(i);
            System.out.printf("%3c", char_entry);
        }
        System.out.println();
    }
}

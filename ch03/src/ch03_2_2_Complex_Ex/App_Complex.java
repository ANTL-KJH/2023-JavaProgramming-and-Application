package ch03_2_2_Complex_Ex;

public class App_Complex {
    public static void main(String[] args) {
//Complex c1 = new Complex(1.23, 5.67);
//Complex c2 = new Complex(3.45, 7.89);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.inputComplex();
        c2.inputComplex();
        System.out.printf("c1 = "); c1.print(); System.out.printf("\n");
        System.out.printf("c2 = "); c2.print(); System.out.printf("\n");
        Complex c3 = c1.add(c2);
        System.out.printf("c3 = c1 + c2 = "); c3.print(); System.out.printf("\n");
        Complex c4 = c1.sub(c2);
        System.out.printf("c4 = c1 - c2 = "); c4.print(); System.out.printf("\n");
        Complex c5 = c1.mul(c2);
        System.out.printf("c5 = c1 * c2 = "); c5.print(); System.out.printf("\n");
        Complex c6 = c1.div(c2);
        System.out.printf("c6 = c1 / c2 = "); c6.print(); System.out.printf("\n");
    }
}

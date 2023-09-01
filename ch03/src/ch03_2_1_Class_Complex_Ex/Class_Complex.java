package ch03_2_1_Class_Complex_Ex;

import java.util.Scanner;

public class Class_Complex {
    public static class Complex {
        private double real;
        private double imag;

        public Complex() {
        } // default constructor

        public Complex(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        public void inputComplex() {
            Scanner cin = new Scanner(System.in);
            System.out.print("Input two double type data for complex real and imag : ");
            this.real = cin.nextDouble();
            this.imag = cin.nextDouble();
        }

        public void setReal(double r) {
            this.real = r;
        }

        public void setImag(double im) {
            this.imag = im;
        }

        public void print() {
            System.out.printf("%5.2f %+5.2fj", this.real, this.imag);
        }

        public Complex add(Complex other) {
            Complex result = new Complex();
            result.real = this.real + other.real;
            result.imag = this.imag + other.imag;
            return result;
        }

        public Complex sub(Complex other) {
            Complex result = new Complex();
            result.real = this.real - other.real;
            result.imag = this.imag - other.imag;
            return result;
        }

        public Complex mul(Complex other) {
            Complex result = new Complex();
            result.real = this.real * other.real - this.imag * other.imag;
            result.imag = this.real * other.imag + this.imag * other.real;
            return result;
        }

        public Complex div(Complex other) {
            Complex result = new Complex();
            ;
            double denom;
            denom = other.real * other.real + other.imag * other.imag;
            result.real = (this.real * other.real + this.imag * other.imag) / denom;
            result.imag = (this.imag * other.real - this.real * other.imag) / denom;
            return result;
        }
    }
    public static Complex inputComplex() {
        Scanner cin = new Scanner(System.in);
        Complex c = new Complex();
        System.out.print("Input two double data for complex (real, imag) : ");
        c.real = cin.nextDouble();
        c.imag = cin.nextDouble();
        return c;
    }
    public static void main(String[] args)
    {
        //Complex c1 = new Complex(1.23, 5.67);
        //Complex c2 = new Complex(3.45, 7.89);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1 = inputComplex();
        c2 = inputComplex();
        System.out.print("c1 = "); c1.print(); System.out.print("\n");
        System.out.print("c2 = "); c2.print(); System.out.print("\n");
        Complex c3 = c1.add(c2);
        System.out.print("c3 = c1 + c2 = "); c3.print(); System.out.print("\n");
        Complex c4 = c1.sub(c2);
        System.out.print("c4 = c1 - c2 = "); c4.print(); System.out.print("\n");
        Complex c5 = c1.mul(c2);
        System.out.print("c5 = c1 * c2 = "); c5.print(); System.out.print("\n");
        Complex c6 = c1.div(c2);
        System.out.print("c6 = c1 / c2 = "); c6.print(); System.out.print("\n");
    }
}

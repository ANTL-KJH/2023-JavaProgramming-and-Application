package ch03_2_3_Cmplx;

import java.util.Scanner;


public class Complex {
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



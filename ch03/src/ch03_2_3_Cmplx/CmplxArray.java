package ch03_2_3_Cmplx;

import ch03_2_1_Class_Complex_Ex.Class_Complex;

public class CmplxArray {
    private Complex[] cmplxArray;
    private int size;
    public CmplxArray(int size) { // constructor
        this.size = size;
        this.cmplxArray = new Complex[size];
        for (int i=0; i<size; i++) {
            this.cmplxArray[i] = new Complex(0.0, 0.0);
        }
    }
    public void print() {
        for (int i = 0; i < this.size; i++) {
            cmplxArray[i].print();
            System.out.print("\n");
        }
    }
    public Complex getEntry(int index) {
        if ((index >= 0) && (index < this.size)) {
            return cmplxArray[index];
        } else {
            System.out.printf("CmplxArray::getEntry() - index (%d) Error - out of scope\n", index);
            return null;
        }
    }
    public void setEntry(int index, Complex c) {
        if ((index >= 0) && (index < this.size)) {
            this.cmplxArray[index] = c;
        } else {
            System.out.printf("CmplxArray::setEntry() - index (%d) Error - out of scope\n", index);
        }
    }
}

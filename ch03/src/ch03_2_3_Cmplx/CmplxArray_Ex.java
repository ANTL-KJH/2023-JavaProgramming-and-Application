package ch03_2_3_Cmplx;

import ch03_2_1_Class_Complex_Ex.Class_Complex;

public class CmplxArray_Ex {
    public static void main(String[] args) {
        Complex c0 = new Complex();
        Complex c1 = new Complex();
        CmplxArray cmplxs = new CmplxArray(6);
        c0.inputComplex();
        cmplxs.setEntry(0, c0);
        c1.inputComplex();
        cmplxs.setEntry(1, c1);
        cmplxs.setEntry(2, cmplxs.getEntry(0).add(cmplxs.getEntry(1)));
        cmplxs.setEntry(3, cmplxs.getEntry(0).sub(cmplxs.getEntry(1)));
        cmplxs.setEntry(4, cmplxs.getEntry(0).mul(cmplxs.getEntry(1)));
        cmplxs.setEntry(5, cmplxs.getEntry(0).div(cmplxs.getEntry(1)));
        cmplxs.print();
    }
}

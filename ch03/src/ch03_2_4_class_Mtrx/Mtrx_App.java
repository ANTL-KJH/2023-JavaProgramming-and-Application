package ch03_2_4_class_Mtrx;

public class Mtrx_App {
    public static void main(String[] args) {
        double[] dA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        double[] dB = {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0};
        double[] dC = {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
        Mtrx mA = new Mtrx("mA", 3, 5, dA);
        Mtrx mB = new Mtrx("mB", 3, 5, dB);
        Mtrx mC = new Mtrx("mC", 5, 3, dC);
        mA.print();
        mB.print();
        mC.print();
        Mtrx mD = mA.addMtrx(mB);
        mD.setName("mD = mA + mB");
        mD.print();
        Mtrx mE = mA.subMtrx(mB);
        mE.setName("mE = mA - mB");
        mE.print();
        Mtrx mF = mA.mulMtrx(mC);
        mF.setName("mF = mA * mB");
        mF.print();
    }
}

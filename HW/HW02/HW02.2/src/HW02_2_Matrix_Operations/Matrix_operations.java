package HW02_2_Matrix_Operations;

public class Matrix_operations {
    public static void printMtrx(String mtrx_name, int n_row, int n_col, double[][] mtrx_data)
    {
        System.out.printf("%s =\n", mtrx_name);
        for (int r=0; r<n_row; r++) {
            for (int c=0; c<n_col; c++) {
                System.out.printf("%5.1f ", mtrx_data[r][c]);
            }
            System.out.println();
        }
    }
    public static double[][] addMtrx(int n_row, int n_col, double[][] mA_data, double[][] mB_data)
    {
        double[][] R = new double[n_row][n_col];
        for (int r=0; r<n_row; r++) {
            for (int c=0; c<n_col; c++) {
                R[r][c] = mA_data[r][c] + mB_data[r][c];
            }
        }
        return R;
    }
    public static double[][] subMtrx(int n_row, int n_col, double[][] mA_data, double[][] mB_data)
    {
        double[][] R = new double[n_row][n_col];
        for (int r=0; r<n_row; r++) {
            for (int c=0; c<n_col; c++) {
                R[r][c] = mA_data[r][c] - mB_data[r][c];
            }
        }
        return R;
    }
    public static double[][] mulMtrx(int nA_row, int nA_col, int nB_row, int nB_col, double[][] mA_data, double[][] mB_data)
    {
        double[][] R = new double[nA_row][nB_col];
        for (int r=0; r<nA_row; r++) {
            for (int c=0; c<nB_col; c++) {
                R[r][c] = 0;
                for (int k=0; k<nA_col; k++) {
                    R[r][c] += mA_data[r][k] * mB_data[k][c];
                }
            }
        }
        return R;
    }
    public static void main(String[] args)
    {
        int nA_row = 3, nA_col = 5;
        int nB_row = 3, nB_col = 5;
        int nC_row = 5, nC_col = 3;
        double[][] mA = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        double[][] mB = {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}};
        double[][] mAddAB;
        double[][] mSubAB;
        printMtrx ("mA", nA_row, nA_col, mA);
        printMtrx ("mB", nB_row, nB_col, mB);
        mAddAB = addMtrx (nA_row, nA_col, mA, mB);
        printMtrx ("mAddAB", nA_row, nA_col, mAddAB);
        mSubAB = subMtrx (nA_row, nA_col, mA, mB);
        printMtrx ("mSubAB", nA_row, nA_col, mSubAB);
        double[][] mC = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {0, 0, 0}, {0, 0, 0}};
        double[][] mMulAC;
        printMtrx ("mA", nA_row, nA_col, mA);
        printMtrx ("mC", nC_row, nC_col, mC);
        mMulAC = mulMtrx (nA_row, nA_col, nC_row, nC_col, mA, mC);
        printMtrx ("mMulAC", nA_row, nC_col, mMulAC);
    }
}

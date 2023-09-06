/*
 * Project Name : JavaProgramming and Application HW02.2
 * Program's purpose and basic function :
 * - calculate matrix
 * Program First Author : JH KIM
 * Date of First Write : 2023.08.31
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.08.31			v1.00			First Write
 */
package HW02_2_Matrix_Operations;

public class Matrix_operations {

    public static void printMtrx(String mtrx_name, int n_row, int n_col, double[][] mtrx_data)    // print matrix
    {
        System.out.printf("%s =\n", mtrx_name);
        for (int r=0; r<n_row; r++) {
            for (int c=0; c<n_col; c++) {
                System.out.printf("%5.1f ", mtrx_data[r][c]);   // print on console
            }
            System.out.println();
        }
    }

    public static double[][] addMtrx(int n_row, int n_col, double[][] mA_data, double[][] mB_data)  // add matrix
    {
        double[][] R = new double[n_row][n_col];
        for (int r=0; r<n_row; r++) {
            for (int c=0; c<n_col; c++) {
                R[r][c] = mA_data[r][c] + mB_data[r][c];
            }
        }
        return R;
    }
    public static double[][] subMtrx(int n_row, int n_col, double[][] mA_data, double[][] mB_data)  // subtract matrix
    {
        double[][] R = new double[n_row][n_col];
        for (int r=0; r<n_row; r++) {
            for (int c=0; c<n_col; c++) {
                R[r][c] = mA_data[r][c] - mB_data[r][c];
            }
        }
        return R;
    }
    public static double[][] mulMtrx(int nA_row, int nA_col, int nB_row, int nB_col, double[][] mA_data, double[][] mB_data)    // multiply matrix
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
        // matrix size
        int nA_row = 3, nA_col = 5;
        int nB_row = 3, nB_col = 5;
        int nC_row = 5, nC_col = 3;

        // matrix init
        double[][] mA = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        double[][] mB = {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}};
        double[][] mC = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {0, 0, 0}, {0, 0, 0}};
        double[][] mMulAC;
        double[][] mAddAB;
        double[][] mSubAB;

        // print matrix A, B
        printMtrx ("mA", nA_row, nA_col, mA);
        printMtrx ("mB", nB_row, nB_col, mB);

        mAddAB = addMtrx (nA_row, nA_col, mA, mB);  // matrix A+B
        printMtrx ("mAddAB", nA_row, nA_col, mAddAB);

        mSubAB = subMtrx (nA_row, nA_col, mA, mB);  // matrix A-B
        printMtrx ("mSubAB", nA_row, nA_col, mSubAB);

        printMtrx ("mA", nA_row, nA_col, mA);
        printMtrx ("mC", nC_row, nC_col, mC);

        mMulAC = mulMtrx (nA_row, nA_col, nC_row, nC_col, mA, mC);  // matrix a*C
        printMtrx ("mMulAC", nA_row, nC_col, mMulAC);
    }
}
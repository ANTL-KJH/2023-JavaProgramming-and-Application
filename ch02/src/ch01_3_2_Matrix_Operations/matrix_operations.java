package ch01_3_2_Matrix_Operations;

public class matrix_operations {
    public static void print_mtrx(String mtrx_name, double[][] M, int n_rows, int n_cols)
    {
        System.out.printf("%s =\n", mtrx_name);
        for (int r=0; r<n_rows; r++) {
            for (int c=0; c<n_cols; c++) {
                System.out.printf("%5.1f ", M[r][c]);
            }
            System.out.println();
        }
    }
    public static double[][] add_mtrx(double[][] A, double[][] B, int n_rows, int n_cols) {
        double[][] R = new double[n_rows][n_cols];
        for (int r=0; r<n_rows; r++) {
            for (int c=0; c<n_cols; c++) {
                R[r][c] = A[r][c] + B[r][c];
            }
        }
        return R;
    }
    public static double[][] sub_mtrx(double[][] A, double[][] B, int n_rows, int n_cols) {
        double[][] R = new double[n_rows][n_cols];
        for (int r=0; r<n_rows; r++) {
            for (int c=0; c<n_cols; c++) {
                R[r][c] = A[r][c] - B[r][c];
            }
        }
        return R;
    }
    public static double[][] mul_mtrx(double[][] A, double[][] B, int n_rows, int n_k, int n_cols) {
        double[][] R = new double[n_rows][n_cols];
        for (int r=0; r<n_rows; r++) {
            for (int c=0; c<n_cols; c++) {
                R[r][c] = 0;
                for (int k=0; k<n_k; k++) {
                    R[r][c] += A[r][k] * B[k][c];
                }
            }
        }
        return R;
    }
    public static void main(String args[]) {
        double[][] mA = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        double[][] mB = {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}};
        double[][] mC = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {0, 0, 0}, {0, 0, 0}};
        print_mtrx("mA", mA, 3, 5);
        print_mtrx("mB", mB, 3, 5);
        double[][] mD = add_mtrx(mA, mB, 3, 5);
        print_mtrx("mD = mA + mB", mD, 3, 5);
        double[][] mE = sub_mtrx(mA, mB, 3, 5);
        print_mtrx("mE = mA - mB", mE, 3, 5);
        double[][] mF = mul_mtrx(mA, mC, 3, 5, 3);
        print_mtrx("mF = mA * mC", mF, 3, 3);
    }
}

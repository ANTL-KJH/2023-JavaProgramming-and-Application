package ch03_2_4_class_Mtrx;

public class Mtrx {
    String mtrx_name;
    private double[][] mtrx_data;
    private int n_row;
    private int n_col;
    public Mtrx(String nm, int n_row, int n_col) {
        this.mtrx_name = nm;
        this.mtrx_data = new double[n_row][n_col];
        this.n_row = n_row;
        this.n_col = n_col;
    }
    public Mtrx(String nm, int n_row, int n_col, double[] dM_data) {
        this.mtrx_name = nm;
        this.mtrx_data = new double[n_row][n_col];
        this.n_row = n_row;
        this.n_col = n_col;
        int count = 0;
        for (int r=0; r<n_row; r++) {
            for (int c=0; c<n_col; c++) {
                this.mtrx_data[r][c]= dM_data[count++];
            }
        }
    }
    public void print() {
        System.out.printf("%s = \n", this.mtrx_name);
        for (int r=0; r<this.n_row; r++) {
            for (int c=0; c<this.n_col; c++) {
                System.out.printf("%7.2f", this.mtrx_data[r][c]);
            }
            System.out.printf("\n");
        }
    }
    public void setName(String nm) {
        this.mtrx_name = nm;
    }
    public Mtrx addMtrx(Mtrx other) {
        Mtrx mR = new Mtrx("mR", this.n_row, this.n_col);
        for (int r=0; r<this.n_row; r++) {
            for (int c=0; c<this.n_col; c++) {
                mR.mtrx_data[r][c] = this.mtrx_data[r][c] + other.mtrx_data[r][c];
            }
        }
        return mR;
    }
    public Mtrx subMtrx(Mtrx other) {
        Mtrx mR = new Mtrx("mR", this.n_row, this.n_col);
        for (int r=0; r<this.n_row; r++) {
            for (int c=0; c<this.n_col; c++) {
                mR.mtrx_data[r][c] = this.mtrx_data[r][c] - other.mtrx_data[r][c];
            }
        }
        return mR;
    }
    public Mtrx mulMtrx(Mtrx other) {
        Mtrx mR = new Mtrx("mR", this.n_row, other.n_col);
        double temp_sum;
        for (int r=0; r<this.n_row; r++) {
            for (int c=0; c<other.n_col; c++) {
                temp_sum = 0.0;
                for (int k=0; k<this.n_col; k++) {
                    temp_sum += this.mtrx_data[r][k] * other.mtrx_data[k][c];
                }
                mR.mtrx_data[r][c] = temp_sum;
            }
        }
        return mR;
    }
}




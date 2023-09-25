package ch05_3_1_class_Mtrx_with_FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mtrx {
    private String m_name;
    private int n_row;
    private int n_col;
    private double[][] mtrx_data;

    public Mtrx() {
    }

    ; // default constructor

    public Mtrx(String nm) {
        this.m_name = nm;
        this.n_row = 0;
        this.n_col = 0;
    }

    public Mtrx(String nm, int n_row, int n_col) {
        this.m_name = nm;
        this.n_row = n_row;
        this.n_col = n_col;
        mtrx_data = new double[n_row][n_col];
    }

    public Mtrx(String nm, int n_row, int n_col, double[][] m_data) {
        this.m_name = nm;
        this.n_row = n_row;
        this.n_col = n_col;
        mtrx_data = new double[n_row][n_col];
        for (int r = 0; r < n_row; r++) {
            for (int c = 0; c < n_col; c++) {
                mtrx_data[r][c] = m_data[r][c];
            }
        }
    }

    public void fget_Mtrx(Scanner fin) {
        this.m_name = fin.next();
        this.n_row = fin.nextInt();
        this.n_col = fin.nextInt();
        this.mtrx_data = new double[this.n_row][this.n_col];
        for (int r = 0; r < this.n_row; r++) {
            for (int c = 0; c < this.n_col; c++) {
                this.mtrx_data[r][c] = fin.nextFloat();
            }
        }
    }

    public void setMtrxName(String nm) {
        m_name = nm;
    }

    public void printMtrx() {
        System.out.printf("%s (%d x %d) = \n", this.m_name, this.n_row, this.n_col);
        for (int r = 0; r < this.n_row; r++) {
            for (int c = 0; c < this.n_col; c++) {
                System.out.printf("%7.2f", this.mtrx_data[r][c]);
            }
            System.out.printf("\n");
        }
    }

    public void fprintMtrx(String fout_name) throws IOException {
        FileWriter fout = new FileWriter(fout_name);
        String str_data;
        fout.write(this.m_name);
        fout.write(" ");
        fout.write(String.format("%3d", this.n_row));
        fout.write(" ");
        fout.write(String.format("%3d", this.n_col));
        fout.write("\n");
        for (int r = 0; r < this.n_row; r++) {
            for (int c = 0; c < this.n_col; c++) {
                str_data = String.format("%7.2f", this.mtrx_data[r][c]);
                fout.write(str_data);
            }
            fout.write("\n");
        }
        fout.flush();
        fout.close();
    }

    public Mtrx addMtrx(Mtrx other) {
        Mtrx m_result = new Mtrx("R", this.n_row, this.n_col);
        for (int r = 0; r < n_row; r++) {
            for (int c = 0; c < n_col; c++) {
                m_result.mtrx_data[r][c] = this.mtrx_data[r][c] + other.mtrx_data[r][c];
            }
        }
        return m_result;
    }

    public Mtrx subMtrx(Mtrx other) {
        Mtrx m_result = new Mtrx("R", this.n_row, this.n_col);
        for (int r = 0; r < n_row; r++) {
            for (int c = 0; c < n_col; c++) {
                m_result.mtrx_data[r][c] = this.mtrx_data[r][c] - other.mtrx_data[r][c];
            }
        }
        return m_result;
    }

    public Mtrx mulMtrx(Mtrx other) {
        Mtrx m_result = new Mtrx("R", this.n_row, other.n_col);
        double temp_sum = 0.0;
        for (int r = 0; r < this.n_row; r++) {
            for (int c = 0; c < other.n_col; c++) {
                temp_sum = 0.0;
                for (int k = 0; k < this.n_col; k++) {
                    temp_sum += this.mtrx_data[r][k] * other.mtrx_data[k][c];
                }
                m_result.mtrx_data[r][c] = temp_sum;
            }
        }
        return m_result;
    }

    public static void main(String[] args) throws IOException {
        final String mtrx_file_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\mtrx_data.txt";
        Scanner fin = new Scanner(new File(mtrx_file_name));
        Mtrx mA = new Mtrx();
        mA.fget_Mtrx(fin);
        mA.printMtrx();
        Mtrx mB = new Mtrx();
        mB.fget_Mtrx(fin);
        mB.printMtrx();
        Mtrx mC = new Mtrx();
        mC.fget_Mtrx(fin);
        mC.printMtrx();
        Mtrx mAdd_AB = mA.addMtrx(mB);
        mAdd_AB.setMtrxName("mAdd_AB");
        mAdd_AB.printMtrx();
        Mtrx mSub_AB = mA.subMtrx(mB);
        mSub_AB.setMtrxName("mSub_AB");
        mSub_AB.printMtrx();
        Mtrx mMul_AC = mA.mulMtrx(mC);
        mMul_AC.setMtrxName("mMul_AC");
        mMul_AC.printMtrx();
        mMul_AC.fprintMtrx("C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\mMul_AC.txt");
    }

}

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mtrx {
    public String m_name;
    public int n_row;
    public int n_col;
    double[][] m_data;
    // Constructor
    Mtrx(){}
    Mtrx(String nm){
        this.setMtrxName(nm);;
    }
    public Mtrx(String nm, int n_row, int n_col) {
        this.setMtrxName(nm);
        this.n_row=n_row;
        this.n_col=n_col;
        this.m_data = new double[n_row][n_col];
    }
    public Mtrx(String nm, int n_row, int n_col, double[][] m_data) {
        this.setMtrxName(nm);
        this.n_row=n_row;
        this.n_col=n_col;
        this.m_data = m_data;
    }
    public static Mtrx fget_Mtrx(Scanner fin)
    {
        String nm = fin.next();
        int row = fin.nextInt();
        int col = fin.nextInt();
        double[][] data= new double[row][col];
        for(int r=0; r<row;r++)
        {
            for(int c=0;c<col;c++)
            {
                data[r][c] = fin.nextDouble();
            }
        }
        return new Mtrx(nm, row,col,data);
    }
    public void setMtrxName(String nm){
        this.m_name = nm;
    }
    public void printMtrx()
    {
        System.out.printf("%s (%d x %d) = \n", this.m_name, this.n_row, this.n_col);
        for (int r=0; r<this.n_row; r++)
        {
            for (int c=0; c<this.n_col; c++)
            {
                System.out.printf("%7.2f", this.m_data[r][c]);
            }
            System.out.printf("\n");
        }
    }
    public void fprintMtrx(FileWriter fout) throws IOException {
        String str_data;
        fout.write(String.format("%s (%d x %d) = \n", this.m_name, this.n_row, this.n_col));
        //fout.write(String.format("%3d", this.n_row)); fout.write(" ");
//        fout.write(String.format("%3d", this.n_col)); fout.write("\n");
        for (int r=0; r<this.n_row; r++)
        {
            for (int c=0; c<this.n_col; c++)
            {
                str_data = String.format("%7.2f", this.m_data[r][c]);
                fout.write(str_data);
            } fout.write("\n");
        } fout.flush();
    }
    public Mtrx addMtrx(Mtrx other)
    {
        Mtrx m_result = new Mtrx("R", this.n_row, this.n_col);
        for (int r=0; r<n_row; r++)
        {
            for (int c=0; c<n_col; c++)
            {
                m_result.m_data[r][c] = this.m_data[r][c] + other.m_data[r][c];
            }
        }
        return m_result;
    }
    public Mtrx subMtrx(Mtrx other)
    {
        Mtrx m_result = new Mtrx("R", this.n_row, this.n_col);
        for (int r=0; r<n_row; r++)
        {
            for (int c=0; c<n_col; c++)
            {
                m_result.m_data[r][c] = this.m_data[r][c] - other.m_data[r][c];
            }
        }
        return m_result;
    }
    public Mtrx mulMtrx(Mtrx other)
    {
        Mtrx m_result = new Mtrx("R", this.n_row, other.n_col);
        double temp_sum = 0.0;
        for (int r=0; r<this.n_row; r++)
        {
            for (int c=0; c<other.n_col; c++)
            {
                temp_sum = 0.0;
                for (int k=0; k<this.n_col; k++)
                {
                    temp_sum += this.m_data[r][k] * other.m_data[k][c];
                }
                m_result.m_data[r][c] = temp_sum;
            }
        }
        return m_result;
    }
}

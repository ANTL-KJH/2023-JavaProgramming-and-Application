/**
 * Project Name : JavaProgramming and Application HW05.2
 * Program's purpose and basic function :
 * - App_Mtrx_FileIO
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.22
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.22			v1.00			First Write
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App_Mtrx_MtrxArray_FileIO {
    public static void main(String[] args) throws IOException {
        // File PATH
        final String fin_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\HW\\HW05\\HW05.2\\mtrx_data.txt";
        final String fout_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\HW\\HW05\\HW05.2\\mtrx_operation_result.txt";

        Scanner fin = new Scanner(new File(fin_name));
        FileWriter fout = new FileWriter(new File(fout_name));

        // Mtrx Array
        Mtrx[] mtrxs = new Mtrx[6];
        mtrxs[0] = Mtrx.fget_Mtrx(fin);
        mtrxs[1] = Mtrx.fget_Mtrx(fin);
        mtrxs[2] = Mtrx.fget_Mtrx(fin);

        // print Matrix
        mtrxs[0].printMtrx(); mtrxs[0].fprintMtrx(fout);
        mtrxs[1].printMtrx(); mtrxs[1].fprintMtrx(fout);
        mtrxs[2].printMtrx(); mtrxs[2].fprintMtrx(fout);

        // Addition
        mtrxs[3] = mtrxs[0].addMtrx(mtrxs[1]);
        mtrxs[3].setMtrxName("mAdd_AB");
        mtrxs[3].printMtrx(); mtrxs[3].fprintMtrx(fout);

        // Subtract
        mtrxs[4] = mtrxs[0].subMtrx(mtrxs[1]);
        mtrxs[4].setMtrxName("mSub_AB");
        mtrxs[4].printMtrx(); mtrxs[4].fprintMtrx(fout);

        // Multiple
        mtrxs[5] = mtrxs[0].mulMtrx(mtrxs[2]);
        mtrxs[5].setMtrxName("mMul_AC");
        mtrxs[5].printMtrx(); mtrxs[5].fprintMtrx(fout);
        fout.close();
    }
}

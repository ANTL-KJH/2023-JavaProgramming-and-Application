package ch05_7_1_BinaryFileDump;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileDump {
    public static void DumpBinaryFile(String fin_name, int dump_size,
                                      int buffer_len) throws IOException {
        FileInputStream fin = new FileInputStream(fin_name);
        int nbytes;
        byte[] buffer = new byte[buffer_len];
        for (int addr = 0; addr < dump_size; addr += buffer_len) {
            nbytes = fin.read(buffer);
            if (nbytes <= 0)
                break;
            System.out.printf("%08X: ", addr);
            for (int i = 0; i < nbytes; i++)
            {
                if ((i + 1) % 8 == 0) // put space at every 8 bytes
                    System.out.printf(" ");
                System.out.printf("%02X ", buffer[i]);
            }
            System.out.printf(" ");
            for (int i = 0; i < nbytes; i++) {
                if (Character.isISOControl(buffer[i]))
                    System.out.printf(".");
                else
                    System.out.printf("%c", (char)buffer[i]);
            }
            System.out.printf("\n");
        } // end outer for
        fin.close();
    }
    public static void main(String[] args) throws IOException {
        final String inputExeFileName = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\GitHubDesktop.exe";
        System.out.printf("File contents of %s : \n", inputExeFileName);
        DumpBinaryFile(inputExeFileName, 256, 16);
        final String inputJpgFileName = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\설문조사.jpg";
        System.out.printf("\nFile contents of %s : \n", inputJpgFileName);
        DumpBinaryFile(inputJpgFileName, 256, 16);
    }
}

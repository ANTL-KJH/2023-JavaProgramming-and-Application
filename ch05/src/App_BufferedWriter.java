import java.io.*;

public class App_BufferedWriter {
    public static void main(String[] args) throws IOException {
        final String f_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\BufferedWriterTest.txt";
        String str_test = "A sample string for testing of BufferedWriter";
        FileWriter fout_byte = new FileWriter(f_name);
        BufferedWriter fout_buf = new BufferedWriter(fout_byte);
        fout_buf.write(str_test);
        fout_buf.flush(); // flush out the contents in buffer to output file
        System.out.printf("str_data (%s) is written\n and flushed to the output file.\n", str_test);
        fout_buf.close();
        FileReader fin_byte = new FileReader(f_name);
        int buf_size = 256;
        char[] input_buffer = new char[buf_size];
        BufferedReader fin_buf = new BufferedReader(fin_byte, buf_size);
        fin_buf.read(input_buffer);
        System.out.println("Data in the input_buffer: ");
        System.out.println(input_buffer);
        fin_buf.close();
    }
}

package ch05_5_7_PipedReader_Writer;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class App_PipedReader_PipedWriter {
    public static void main(String[] args) throws IOException {
        PipedReader pipeReaderEnd = new PipedReader();
        PipedWriter pipeWriterEnd = new PipedWriter();
        pipeReaderEnd.connect(pipeWriterEnd);
        for (int i = (int)('A'); i <= (int)('z'); i++) {
            pipeWriterEnd.write((char) i);
        }
        for (int i=(int)('A'); i <= (int)('z'); i++) {
            int ch = pipeReaderEnd.read();
            System.out.printf("%c ", (char) ch);
        }
        System.out.println();
    }
}

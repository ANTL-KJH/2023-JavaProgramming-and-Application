package ch10_Inter_Threads_Communication;
import java.io.PipedInputStream;
import java.io.IOException;
class Reader implements Runnable {
    private PipedInputStream pipedInputStream;
    public Reader(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }
    public void run() {
        try {
// Read data from the input stream
            byte[] buffer = new byte[1024];
            int bytesRead = pipedInputStream.read(buffer);
            String message = new String(buffer, 0, bytesRead);
            System.out.println("ReaderReceived: " + message);
            pipedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

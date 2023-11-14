package ch10_Inter_Threads_Communication;
import java.io.PipedOutputStream;
import java.io.IOException;
class Writer implements Runnable {
    private PipedOutputStream pipedOutputStream;
    public Writer(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }
    public void run() {
        try {
// Write data to the output stream
            String msg = "Hello, Reader!";
            pipedOutputStream.write(msg.getBytes());
            System.out.println("WriterSent: " + msg);
            pipedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
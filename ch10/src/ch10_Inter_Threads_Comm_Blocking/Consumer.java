package ch10_Inter_Threads_Comm_Blocking;
import java.util.concurrent.BlockingQueue;
class Consumer implements Runnable {
    private BlockingQueue<String> queue;
    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue; }
    public void run() {
        try {
// Consume items from the queue until the end signal is received
            String item;
            while (true) {
                item = queue.take();
                if (item.equals("Bye")) {
                    System.out.printf("Consumer received Bye. So exits !!!\n");
                    break; }
                System.out.println("Consumer received & consumed: " + item);
                Thread.sleep(2000); // Simulate some processing time
            } // end while
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); } } }

package ch10_Inter_Threads_Comm_Blocking;

import java.util.concurrent.BlockingQueue;
class Producer implements Runnable {
    private BlockingQueue<String> queue;
    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    public void run() {
        try {
// Produce items and put them in the queue
            for (int i = 1; i <= 5; i++) {
                String item = "Item " + i;
                queue.put(item);
                System.out.println("Producer produced & sent: " + item);
                Thread.sleep(1000); // Simulate some processing time
            }
// Signal the end of production
            queue.put("Bye");
            System.out.printf("Producer sent Bye\n");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


package blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by root on 10/30/15.
 * author: zd
 */
public class Producer implements Runnable {
    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String temp = "A Product : " + Thread.currentThread().getName();
            System.out.println("I hava made a Product : " + Thread.currentThread().getName());
            queue.put(temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

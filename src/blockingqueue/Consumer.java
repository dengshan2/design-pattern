package blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by root on 10/30/15.
 * author: zd
 */
public class Consumer implements Runnable {
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String temp = queue.take();
            System.out.println(Thread.currentThread().getName() + temp);
        } catch (InterruptedException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}

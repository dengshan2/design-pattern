package blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by root on 10/30/15.
 * author: zd
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.getProperty("os.name"));
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread t1 = new Thread(producer, "Producer");
        t1.start();
        Thread t2 = new Thread(consumer, "Consumer1");
        t2.start();
        Thread t3 = new Thread(consumer, "Consumer1");
        t3.start();
        Thread.sleep(5000l);
        t3.interrupt();
    }
}

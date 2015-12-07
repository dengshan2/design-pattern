package blockingqueue;

/**
 * Created by root on 11/3/15.
 * author: zd
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        long t1 = System.currentTimeMillis();
        Thread t = new Thread(new RunnableImpl());
        new ThreadTest(t).start();
        t.start();
        t.join();
        System.out.println("joinFinish");
        long t2 = System.currentTimeMillis();
        System.out.println("take " + (t2-t1) + " ms");
    }
}

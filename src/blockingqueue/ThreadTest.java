package blockingqueue;

/**
 * Created by root on 11/3/15.
 * author： zd
 */
public class ThreadTest extends Thread {
    private final Thread thread;

    public ThreadTest(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        synchronized (thread) {
            System.out.println("getObjectLock");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ReleaseObjectLock");
        }
    }
}

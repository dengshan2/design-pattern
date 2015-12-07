package ThreadTest2.deadlock;

/**
 * Created by root on 11/5/15.
 * author: zd
 */
public class DeadLockTest {
    private static class Resource {
        private int value = 0;
    }

    final private Resource A = new Resource();
    final private Resource B = new Resource();

    public void read() {
        synchronized (A) {
            try {
                Thread.sleep(20l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (B) {
                System.out.println(A.value);
                System.out.println(B.value);
            }
        }
    }

    public void write(int a, int b) {
        synchronized(B) {
            try {
                Thread.sleep(20l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(A) {
                A.value = a;
                B.value = b;
            }
        }
    }
}

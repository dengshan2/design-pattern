package ThreadTest2.catchOtherThreadLockData;

/**
 * Created by root on 11/11/15.
 * author: zd
 */
public class ThreadB extends Thread {
    int count;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 101; i++) {
                count += i;
            }
        }
    }
}

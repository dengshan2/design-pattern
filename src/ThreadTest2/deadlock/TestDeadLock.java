package ThreadTest2.deadlock;

/**
 * 《》 作者：王维
 *      君自故乡来，应知故乡事。
 *      来日绮窗前，寒梅著花未。
 * Created by root on 11/5/15.
 * author: zd
 */
public class TestDeadLock {
    public static void main(String[] args) {
        final DeadLockTest deadLock = new DeadLockTest();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.read();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.write(10, 20);
            }
        });
        t1.start();
        t2.start();
    }
}

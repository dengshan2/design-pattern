package ThreadTest;

/**
 * Created by root on 10/19/15.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread_writeFile();
        Thread t2 = new Thread_ReadFile();
        t1.start();
        t2.start();
    }
}

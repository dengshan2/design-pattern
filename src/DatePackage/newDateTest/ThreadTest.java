package DatePackage.newDateTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 11/26/15.
 *
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, RunnableTest> map = new HashMap<>();
        RunnableTest t = new RunnableTest();
        System.out.println(t.getCount() + ", " + t.getName());
        Thread thread = new Thread(t);
        thread.start();
        thread.join();
        System.out.println(map.get(1));
        System.out.println(t.getCount());
        System.out.println(t.getName());
    }
}

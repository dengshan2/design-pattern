package ThreadTest2.safeThread;

/**
 * Created by root on 11/5/15.
 * author: zd
 */
public class Test {
    public static void main(String[] args) {
        final NameList list = new NameList();
        list.add("zhao deng");

        class NameDropper extends Thread {
            @Override
            public void run() {
                String str = list.removeFirst();
                System.out.println(str);
            }
        }

        Thread t1 = new NameDropper();
        Thread t2 = new NameDropper();
        t1.start();
        t2.start();
    }
}

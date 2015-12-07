package transmitData;

/**
 * Created by root on 11/10/15.
 * author: zd
 */
public class MyRunnable implements Runnable {
    public String status = "running";



    @Override
    public void run() {
        System.out.println("start");
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        status = "stopped";
        System.out.println("end");
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable run = new MyRunnable();
        Thread t = new Thread(run);
        t.start();
        Thread.sleep(2000l);
        System.out.println(run.status);
    }
}

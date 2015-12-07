package transmitData;

/**
 * Created by root on 11/10/15.
 * author: zd
 */
public class TransmitData {
    private Boolean running;

    public TransmitData(Boolean running) {
        this.running = running;
    }

    public void thread1(final String t) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t + " : "+ running);
                running = !running;
                System.out.println(t + " : " + running);
            }
        });
        t1.start();
    }

    public static void main(String[] args) {
        TransmitData data = new TransmitData(false);
        data.thread1("t1");
        data.thread1("t2");
    }
}

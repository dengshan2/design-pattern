package ThreadTest2.synchro;

/**
 * 《鹿柴》 作者： 王维
 *      空山不见人，但闻人语响。
 *      返景入深林，复照青苔上。
 * Created by root on 11/5/15.
 * author: zd
 */
public class MyRunnable implements Runnable {
    private Foo foo = new Foo();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized(this) {
                fix(30);
                try {
                    Thread.sleep(20l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " ： 当前Foo中x的值为： " + foo.getX());
            }
        }
    }

    public int  fix(int y) {
        return foo.fix(y);
    }

    public static void main(String[] args) {
        Runnable run = new MyRunnable();
        Thread a = new Thread(run, "ThreadA");
        Thread b = new Thread(run, "ThreadB");
        a.start();
        b.start();
    }
}

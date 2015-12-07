package com.yosemei.Thread2;

/**
 * Created by root on 9/24/15.
 */
public class Test2 {
    public static void main(String[] args) {
        Thread t1 = new MyThread2();
        Thread t2 = new Thread(new MyRunnable2());
        t1.setPriority(10);
        t2.setPriority(1);

        t2.start();
        t1.start();
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1第" + i + "次执行！");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程2第" + i + "次执行！");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
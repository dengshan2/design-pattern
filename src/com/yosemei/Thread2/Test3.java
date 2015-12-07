package com.yosemei.Thread2;

/**
 * Created by root on 9/24/15.
 */
public class Test3 {
    public static void main(String[] args) {
        Thread t1 = new MyThread3();
        Thread t2 = new Thread(new MyRunnable3());

        t2.start();
        t1.start();
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1第" + i + "次执行！");
        }
    }
}

class MyRunnable3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程2第" + i + "次执行！");
            Thread.yield();
        }
    }
}

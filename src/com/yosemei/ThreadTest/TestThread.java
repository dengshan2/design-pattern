package com.yosemei.ThreadTest;

/**
 * Created by root on 9/17/15.
 */
public class TestThread extends Thread {
    public TestThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(this.getName() + " : " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new TestThread("阿三");
        Thread t2 = new TestThread("李四");

        t1.start();
        t2.start();
    }
}

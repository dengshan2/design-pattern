package com.yosemei.Thread2;

/**
 * Created by root on 9/24/15.
 */
public class Test4 {
    public static void main(String[] args) {
        Thread t = new MyThread4();
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("主线程第" + i + "次执行！");
            if (i > 2) try {
                // t线程合并到主线程中，主线程停止执行过程，转而执行t线程，直到t执行完毕后继续。
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1第" + i + "次执行！");
        }
    }
}

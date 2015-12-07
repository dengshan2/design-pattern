package com.yosemei.ThreadTest;

/**
 * Created by root on 9/17/15.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println("--------------" + i);
            }
            try {
                Thread.sleep(1);
                System.out.println(i + "  线程睡眠1毫秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
    }
}

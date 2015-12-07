package com.yosemei.Thread2;

/**
 * Created by root on 9/24/15.
 */
public class ThreadA {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b) {
            try {
                System.out.println("wait for b finished!");
                b.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("b total = " + b.total);
        }
    }
}

package com.yosemei.Thread2;

/**
 * Created by root on 9/24/15.
 */
public class ThreadB extends Thread {
    int total;

    public void run() {
        synchronized (this) {
            System.out.println("begin B");
            for (int i = 0; i < 101; i++) {
                total += i;
            }
            notify();
        }
    }
}

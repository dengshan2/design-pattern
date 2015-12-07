package com.yosemei.Thread3;

/**
 * Created by root on 9/29/15.
 */
public class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("~Thread2~");
            i++;
        }
    }
}

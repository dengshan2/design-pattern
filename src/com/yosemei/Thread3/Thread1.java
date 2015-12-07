package com.yosemei.Thread3;

/**
 * Created by root on 9/29/15.
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("~Thread1~");
            i++;
        }
    }
}

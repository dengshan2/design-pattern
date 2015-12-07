package com.yosemei.Thread3;

/**
 * Created by root on 9/29/15.
 */
public class AddShutdownHookTest {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread3());
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.start();
    }
}

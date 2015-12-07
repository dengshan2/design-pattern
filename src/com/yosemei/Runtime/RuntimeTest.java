package com.yosemei.Runtime;

/**
 * Created by root on 9/25/15.
 */
public class RuntimeTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                System.out.println("thread1...");
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("thread2...");
            }
        };

        Thread shutdownThread = new Thread() {
            @Override
            public void run() {
                System.out.println("shutdownThread...");
            }
        };

        Runtime.getRuntime().addShutdownHook(shutdownThread);

        thread1.start();
        thread2.start();
    }
}

package com.yosemei.ThreadTest;

/**
 * Created by root on 9/17/15.
 */
class CustomThread1 extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        try {
          for (int i = 0; i < 5; i++) {
              System.out.println(threadName + " loop at " + i);
              Thread.sleep(1000);
          }
            System.out.println(threadName + " end.");
        } catch (Exception e) {
            System.out.println("Exception from " + threadName + ".run");
        }
    }
}

class CustomThread extends Thread {
    CustomThread1 thread1;

    public CustomThread(CustomThread1 thread1) {
        this.thread1 = thread1;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        try {
            this.thread1.join();
            System.out.println(threadName + " end.");
        } catch (Exception e) {
            System.out.println("Exception from " + threadName +".run");
        }
    }
}


public class JoinTestDemo {

    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        CustomThread1 t1 = new CustomThread1();
        CustomThread t2 = new CustomThread(t1);
        try {
            t1.start();
            Thread.sleep(2000);
            t2.start();
//            t2.join();
        } catch (Exception e) {
            System.out.println("Exception from main");
        }
        System.out.println(threadName + " end!");
    }
}

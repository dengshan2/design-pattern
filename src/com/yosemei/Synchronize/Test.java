package com.yosemei.Synchronize;

/**
 * Created by root on 9/28/15.
 */
public class Test {
    public static void main(String[] args) {
        User u = new User("李四", 100);

        Thread t1 = new MyThread("线程A", u, 20);
        Thread t2 = new MyThread("线程B", u, -60);
        Thread t3 = new MyThread("线程C", u, -80);
        Thread t4 = new MyThread("线程D", u, -30);
        Thread t5 = new MyThread("线程E", u, 32);
        Thread t6 = new MyThread("线程F", u, 21);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}

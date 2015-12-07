package com.yosemei.ThreadTest;

/**
 * Created by root on 9/17/15.
 */
public class TestRunnable {

    public static void main(String[] args) {
        DoSomething ds1 = new DoSomething("阿宽");
        DoSomething ds2 = new DoSomething("等等");

        Thread t1 = new Thread(ds1);
        Thread t2 = new Thread(ds2);

        t1.start();
        t2.start();
    }
}

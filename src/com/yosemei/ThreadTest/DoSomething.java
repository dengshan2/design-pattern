package com.yosemei.ThreadTest;

/**
 * Created by root on 9/17/15.
 */
public class DoSomething implements Runnable {

    private String name;

    public DoSomething(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name + ":" + i);
        }
    }

}

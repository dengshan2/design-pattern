package com.yosemei.Synchronize;

/**
 * Created by root on 9/28/15.
 */
public class MyThread extends Thread {
    private User user;
    private int y;

    public MyThread(String name, User user, int y) {
        super(name);
        this.user = user;
        this.y = y;
    }

    @Override
    public void run() {
        user.oper(y);
    }
}

package com.yosemei.Observer;

/**
 * Created by root on 9/24/15.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}

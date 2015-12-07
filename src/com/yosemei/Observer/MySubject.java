package com.yosemei.Observer;

/**
 * Created by root on 9/24/15.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}

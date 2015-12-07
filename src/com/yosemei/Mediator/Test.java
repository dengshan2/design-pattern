package com.yosemei.Mediator;

/**
 * Created by root on 9/28/15.
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}

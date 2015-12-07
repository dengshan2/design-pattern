package com.yosemei.Command;

/**
 * Created by root on 9/25/15.
 */
public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}

package com.yosemei.Command;

/**
 * Created by root on 9/25/15.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}

package designPattern.Command;

/**
 * Created by root on 10/22/15.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exec();
    }
}

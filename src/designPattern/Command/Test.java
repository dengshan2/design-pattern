package designPattern.Command;

/**
 * Created by root on 10/22/15.
 * author: zd
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}

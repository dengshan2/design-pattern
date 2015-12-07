package designPattern.Mediator;

/**
 * Created by root on 10/29/15.
 */
public class Test {
    public static void main(String[] args) {
        Mediator m = new MyMediator();
        m.createUser();
        m.workAll();
    }
}

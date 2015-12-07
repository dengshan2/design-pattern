package designPattern.Mediator;

/**
 * Created by root on 10/29/15.
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 execute!");
    }

}

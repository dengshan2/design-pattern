package designPattern.Observer;

/**
 * Created by root on 10/20/15.
 */
public class Observer1 implements Observer{

    @Override
    public void update() {
        System.out.println("Observer1 has received!");
    }
}

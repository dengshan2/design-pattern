package designPattern.Observer;

/**
 * Created by root on 10/21/15.
 */
public class MySubject extends AbstructSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}

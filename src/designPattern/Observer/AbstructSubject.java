package designPattern.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by root on 10/21/15.
 */
public class AbstructSubject implements Subject {
    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> num = vector.elements();
        while (num.hasMoreElements()) {
            num.nextElement().update();
        }
    }

    @Override
    public void operation() {

    }
}

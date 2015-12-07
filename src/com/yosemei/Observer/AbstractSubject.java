package com.yosemei.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by root on 9/24/15.
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> observerEnumeration = vector.elements();
        while (observerEnumeration.hasMoreElements()) {
            observerEnumeration.nextElement().update();
        }
    }
}

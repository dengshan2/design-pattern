package designPattern.Singleton;

import java.util.Vector;

/**
 * Created by root on 10/9/15.
 */
public class SingletonTest {
    private static SingletonTest instance = null;
    private Vector properties = null;

    private SingletonTest() {

    }

    public Vector getProperties() {
        return properties;
    }

    private static synchronized void synclnit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            synclnit();
        }
        return instance;
    }

    public void updateProperties() {
        SingletonTest shadow = new SingletonTest();
        properties = shadow.getProperties();
    }

    public Object readResolve() {
        return instance;
    }
}

package com.yosemei.Singleton;

import java.util.Vector;

/**
 * Created by root on 9/17/15.
 */
public class SingletonTest {

    private static SingletonTest instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return this.properties;
    }

    private SingletonTest() {

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













}

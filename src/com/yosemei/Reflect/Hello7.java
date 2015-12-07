package com.yosemei.Reflect;

import java.lang.reflect.Constructor;

/**
 * Created by root on 9/28/15.
 */
public class Hello7 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("com.yosemei.Reflect.Person5");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Constructor<?> cons[] = demo.getConstructors();
        for (int i = 0; i < cons.length; i++) {
            System.out.println("构造方法： " + cons[i]);
        }
    }
}

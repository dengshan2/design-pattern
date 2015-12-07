package com.yosemei.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by root on 9/28/15.
 */
public class Hello4 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("com.yosemei.Reflect.Person4");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person4 per1 = null;
        Person4 per2 = null;
        Person4 per3 = null;
        Person4 per4 = null;
        // 取得全部的构造函数
        Constructor<?> cons[] = demo.getConstructors();
        try {
            per1 = (Person4)cons[3].newInstance();
            per2 = (Person4)cons[2].newInstance("ZD");
            per3 = (Person4)cons[1].newInstance(25);
            per4 = (Person4)cons[0].newInstance("ZD", 25);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
    }
}

class Person4 {
    private String name;
    private int age;

    public Person4() {

    }

    public Person4(String name) {
        this.name = name;
    }

    public Person4(int age) {
        this.age = age;
    }

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "[" + name + " " + age + "]";
    }
}

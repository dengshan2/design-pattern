package com.yosemei.Reflect;

/**
 * Created by root on 9/30/15.
 */

interface Fruit1 {
    public void eat();
}

class Apple1 implements Fruit1 {

    @Override
    public void eat() {
        System.out.println("Apple1");
    }
}

class Orange1 implements Fruit1 {

    @Override
    public void eat() {
        System.out.println("Orange1");
    }
}

class Factory1 {
    public static Fruit1 getInstance(String className) {
        Fruit1 f = null;
        try {
            f = (Fruit1)Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return f;
    }
}

public class Hello19 {
    public static void main(String[] args) {
        Fruit1 f = Factory1.getInstance("com.yosemei.Reflect.Orange1");
        f.eat();
    }
}

package com.yosemei.Reflect;

/**
 * Created by root on 9/30/15.
 * @author zd 设计模式之 工厂模式
 */

interface fruit {
    public void eat();
}

class Apple implements fruit {

    @Override
    public void eat() {
        System.out.println("Apple");
    }
}

class Orange implements fruit {

    @Override
    public void eat() {
        System.out.println("Orange");
    }
}

class Factory {

    public static fruit getInstance(String fruitName) {
        fruit f = null;
        if ("Orange".equals(fruitName)) {
            f = new Orange();
        }
        if ("Apple".equals(fruitName)) {
            f = new Apple();
        }
        return f;
    }
}

public class Hello18 {
    public static void main(String[] args) {
        fruit f = Factory.getInstance("Apple");
        f.eat();
    }
}

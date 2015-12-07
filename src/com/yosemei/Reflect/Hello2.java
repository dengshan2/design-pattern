package com.yosemei.Reflect;

/**
 * Created by root on 9/28/15.
 */
public class Hello2 {
    public static void main(String[] args) {
        Class<?> demo1 = null;
        Class<?> demo2 = null;
        Class<?> demo3 = null;
        try {
            // 一般尽量采用这种形式
            demo1 = Class.forName("com.yosemei.Reflect.Demo2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        demo2 = new Demo2().getClass();
        demo3 = Demo2.class;

        System.out.println("类名称 " + demo1.getName());
        System.out.println("类名称 " + demo2.getName());
        System.out.println("类名称 " + demo3.getName());
    }
}

class Demo2 {
    //other codes...
}

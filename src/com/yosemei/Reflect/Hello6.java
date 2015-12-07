package com.yosemei.Reflect;

/**
 * Created by root on 9/28/15.
 */
public class Hello6 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("com.yosemei.Reflect.Person5");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 取得父类
        Class<?> temp = demo.getSuperclass();
        System.out.println("继承的父类为：  " + temp.getName());
    }
}

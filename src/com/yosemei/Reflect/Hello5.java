package com.yosemei.Reflect;

/**
 * Created by root on 9/28/15.
 */
public class Hello5 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("com.yosemei.Reflect.Person5");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 保存所有的接口
        Class<?> inters[] = demo.getInterfaces();
        for (int i = 0; i < inters.length; i++) {
            System.out.println("实现的接口  " + inters[i].getName());
        }
    }
}

interface China {
    public static final String name = "ZD";
    public static int age = 20;
    public void sayChina();
    public void sayHello(String name, int age);
}

class Person5 implements China {
    private String sex;

    public Person5() {

    }

    public Person5(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void sayChina() {
        System.out.println("hello, china");
    }

    @Override
    public void sayHello(String name, int age) {
        System.out.println(name + " " + age);
    }
}

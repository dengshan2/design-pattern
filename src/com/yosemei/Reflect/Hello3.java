package com.yosemei.Reflect;

/**
 * Created by root on 9/28/15.
 */
public class Hello3 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("com.yosemei.Reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person person = null;
        try {
            person = (Person)demo.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        person.setName("ZD");
        person.setAge(25);
        System.out.println(person);
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + name + " " + age +"]";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

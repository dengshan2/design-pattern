package com.yosemei.Reflect;

import java.lang.reflect.Field;

/**
 * Created by root on 9/28/15.
 */
public class Hello13 {
    public static void main(String[] args) {
        Class<?> demo = null;
        Object obj = null;
        try {
            demo = Class.forName("com.yosemei.Reflect.Person5");
            obj = demo.newInstance();
            Field field = demo.getDeclaredField("sex");
            field.setAccessible(true);
            field.set(obj, "男");
            System.out.println(field.get(obj));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

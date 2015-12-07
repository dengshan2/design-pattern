package com.yosemei.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by root on 9/28/15.
 */
public class Hello11 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("com.yosemei.Reflect.Person5");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            // 调用Person类中的sayChina方法
            Method method = demo.getMethod("sayChina");
            method.invoke(demo.newInstance());
            // 调用Person类中的sayHello方法
            method = demo.getMethod("sayHello", String.class, int.class);
            method.invoke(demo.newInstance(), "ZD", 25);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}

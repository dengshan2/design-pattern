package com.yosemei.Reflect;

/**
 * Created by root on 9/29/15.
 */
public class Hello16 {
    public static void main(String[] args) {
        test t = new test();
        System.out.println("类加载器 ：" + t.getClass().getClassLoader().getClass().getName());
    }
}

class test {

}

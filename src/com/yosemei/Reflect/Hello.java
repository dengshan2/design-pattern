package com.yosemei.Reflect;

/**
 * Created by root on 9/28/15.
 */
public class Hello {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.getClass().getName());
    }
}

class Demo {
    //other codes...
}

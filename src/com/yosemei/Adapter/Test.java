package com.yosemei.Adapter;

/**
 * Created by root on 9/18/15.
 */
public class Test {
    public static void main(String[] args) {

        Targetable targetable = new Adapter();

        targetable.method1();

        targetable.method2();
    }
}

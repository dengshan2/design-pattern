package com.yosemei.Adapter;

/**
 * Created by root on 9/18/15.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is targetable method!");
    }
}

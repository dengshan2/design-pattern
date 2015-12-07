package com.yosemei.Proxy;

/**
 * Created by root on 9/18/15.
 */
public class Source implements SourceAble {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}

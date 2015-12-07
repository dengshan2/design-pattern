package com.yosemei.Decorator;

/**
 * Created by root on 9/18/15.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        SourceAble source = new Source();

        SourceAble obj = new Decorator(source);

        obj.method();
    }
}

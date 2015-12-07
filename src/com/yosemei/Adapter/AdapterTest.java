package com.yosemei.Adapter;

/**
 * Created by root on 9/18/15.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();

        Targetable targetable = new Wrapper(source);

        targetable.method1();

        targetable.method2();
    }
}

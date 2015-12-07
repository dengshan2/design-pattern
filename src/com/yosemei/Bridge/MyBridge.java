package com.yosemei.Bridge;

/**
 * Created by root on 9/23/15.
 */
public class MyBridge extends Bridge {

    public void method() {
        getSource().method();
    }
}

package com.yosemei.Bridge;

/**
 * Created by root on 9/23/15.
 */
public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        /* 调用第一个对象 */
        Sourceable source = new SourceSub1();
        bridge.setSource(source);
        bridge.method();

        /* 调用第二个对象 */
        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}

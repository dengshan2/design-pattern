package com.yosemei.Factory_Method;

/**
 * Created by root on 9/16/15.
 */
public class FactoryTest {
    public static void main(String[] args) {
//        Sender sender = SendFactory.produce("mail");

        Sender sender = SendFactory.produceSms();
        sender.send();
    }
}

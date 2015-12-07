package com.yosemei.Abstract_Factory;

/**
 * Created by root on 9/16/15.
 */
public class Test {
    public static void main(String[] args) {

        Provider provider = new SmsSenderFactory();

        Sender sender = provider.produce();

        sender.send();
    }
}

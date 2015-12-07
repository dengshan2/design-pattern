package com.yosemei.Abstract_Factory;

/**
 * Created by root on 9/16/15.
 */
public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

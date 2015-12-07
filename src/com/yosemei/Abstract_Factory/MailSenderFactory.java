package com.yosemei.Abstract_Factory;

/**
 * Created by root on 9/16/15.
 */
public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}

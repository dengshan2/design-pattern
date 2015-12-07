package com.yosemei.Factory_Method;

/**
 * Created by root on 9/16/15.
 */
public class MailSender implements Sender{

    @Override
    public void send() {
        System.out.println("This is mailSender");
    }
}

package com.yosemei.Builder;

import java.util.List;

/**
 * Created by root on 9/18/15.
 */
public class Test {

    public static void main(String[] args) {
        Builder builder = new Builder();

        builder.produceMailSender(10);

        List<Sender> list = builder.getList();

        for (Sender sender : list) {
            sender.send();
        }
    }
}

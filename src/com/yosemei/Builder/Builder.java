package com.yosemei.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 9/18/15.
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public List<Sender> getList() {
        return list;
    }

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}

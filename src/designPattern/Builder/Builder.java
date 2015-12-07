package designPattern.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 10/9/15.
 */
public class Builder {
    private List<Sender> senderList = new ArrayList<Sender>();

    public void produceMail(int count) {
        for (int i = 0; i < count; i++) {
            senderList.add(new MailSender());
            senderList.get(senderList.size()-1).send();
        }
    }

    public void produceSms(int count) {
        for (int i = 0; i < count; i++) {
            senderList.add(new SmsSender());
            senderList.get(senderList.size()-1).send();
        }
    }
}

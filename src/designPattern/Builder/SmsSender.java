package designPattern.Builder;

/**
 * Created by root on 10/9/15.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is sms sender!!!");
    }
}

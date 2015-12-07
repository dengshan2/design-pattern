package designPattern.Builder;

/**
 * Created by root on 10/9/15.
 */
public class MailSender implements Sender{

    @Override
    public void send() {
        System.out.println("This is mail sender!!!");
    }
}

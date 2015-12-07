package designPattern.Factory_Method.First3;

/**
 * Created by root on 10/9/15.
 */
public class SenderFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}

package designPattern.Factory_Method.First;

/**
 * Created by root on 10/9/15.
 * 普通工厂模式
 */
public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produce("sms");
        sender.send();
    }
}

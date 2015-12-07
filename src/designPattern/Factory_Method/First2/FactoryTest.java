package designPattern.Factory_Method.First2;


/**
 * Created by root on 10/9/15.
 * 多个工厂方法模式
 */
public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.producerMail();
        sender.send();
    }
}

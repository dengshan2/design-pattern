package designPattern.Factory_Method.First3;

/**
 * Created by root on 10/9/15.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SenderFactory.produceMail();
        sender.send();
    }
}

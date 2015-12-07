package designPattern.Abstract_Factory;

/**
 * Created by root on 10/9/15.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Provider p = new SendSmsFactory();
        Sender s = p.produce();
        s.send();
    }
}

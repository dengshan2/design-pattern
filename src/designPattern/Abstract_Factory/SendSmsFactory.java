package designPattern.Abstract_Factory;

/**
 * Created by root on 10/9/15.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

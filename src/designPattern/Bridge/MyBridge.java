package designPattern.Bridge;

/**
 * Created by root on 10/12/15.
 */
public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSource().method();
    }
}

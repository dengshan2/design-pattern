package designPattern.Bridge;

/**
 * Created by root on 10/12/15.
 */
public class SourceSub1 implements SourceAble {
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}

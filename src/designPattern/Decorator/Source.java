package designPattern.Decorator;

/**
 * Created by root on 10/10/15.
 */
public class Source implements SourceAble {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}

package designPattern.Decorator;

/**
 * Created by root on 10/10/15.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        SourceAble source = new Source();
        SourceAble decorator = new Decorator(source);
        decorator.method();
    }
}

package designPattern.Decorator;

/**
 * Created by root on 10/10/15.
 */
public class Decorator implements SourceAble {
    private SourceAble source;

    public Decorator(SourceAble source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator !");
        source.method();
        System.out.println("after decorator !");
    }
}

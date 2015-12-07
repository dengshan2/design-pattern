package designPattern.Proxy;

/**
 * Created by root on 10/10/15.
 */
public class Proxy implements SourceAble {
    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    public void before() {
        System.out.println("before proxy!");
    }

    public void after() {
        System.out.println("after proxy!");
    }
}

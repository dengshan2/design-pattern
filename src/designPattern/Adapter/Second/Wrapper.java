package designPattern.Adapter.Second;

/**
 * Created by root on 10/10/15.
 */
public class Wrapper implements TargetAble {
    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is the targetAble method!");
    }
}

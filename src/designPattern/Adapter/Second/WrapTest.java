package designPattern.Adapter.Second;

/**
 * Created by root on 10/10/15.
 */
public class WrapTest {
    public static void main(String[] args) {
        Source source = new Source();
        TargetAble t = new Wrapper(source);
        t.method1();
        t.method2();
    }
}

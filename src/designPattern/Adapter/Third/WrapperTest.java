package designPattern.Adapter.Third;

/**
 * Created by root on 10/10/15.
 */
public class WrapperTest {
    public static void main(String[] args) {
        SourceAble source1 = new SourceSub1();
        SourceAble source2 = new SourceSub2();

        source1.method1();
        source1.method2();

        source2.method1();
        source2.method2();
    }
}

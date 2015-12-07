package designPattern.Adapter.First;

/**
 * Created by root on 10/10/15.
 */
public class TargetTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}

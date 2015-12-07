package designPattern.Adapter.First;

/**
 * Created by root on 10/10/15.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("This is the targetable method!");
    }
}

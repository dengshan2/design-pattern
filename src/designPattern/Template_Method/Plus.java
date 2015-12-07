package designPattern.Template_Method;

/**
 * Created by root on 10/20/15.
 */
public class Plus extends AbstractCalculator{

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

package designPattern.StrategyTest;

/**
 * Created by root on 10/16/15.
 */
public class Multiply extends AbstrctCalculate implements ICalculate {
    @Override
    public int calculate(String exp) {
        int[] ints = split(exp, "\\*");
        return ints[0] * ints[1];
    }
}

package designPattern.StrategyTest;

/**
 * Created by root on 10/16/15.
 */
public class StratepyTest {
    public static void main(String[] args) {
        String exp = "8+8";
        ICalculate cal = new Multiply();
        int result = cal.calculate("8*4");
        System.out.println(result);
    }
}

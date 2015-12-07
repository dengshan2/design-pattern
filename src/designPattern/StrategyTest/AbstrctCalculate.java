package designPattern.StrategyTest;

/**
 * Created by root on 10/16/15.
 */
public abstract class AbstrctCalculate {
    public int[] split(String exp, String opt) {
        String[] arr = exp.split(opt);
        int[] intArray = new int[2];
        intArray[0] = Integer.parseInt(arr[0]);
        intArray[1] = Integer.parseInt(arr[1]);
        return intArray;
    }
}

package designPattern.Template_Method;

/**
 * Created by root on 10/20/15.
 */
public abstract class AbstractCalculator {
    /* 主方法，实现对本类其它方法的调用 */
    public final int calculate(String exp, String opt) {
        int[] intArray = spile(exp, opt);
        return calculate(intArray[0], intArray[1]);
    }

    public int[] spile(String exp, String opt) {
        int[] intArray = new int[2];
        String[] strArray = exp.split(opt);
        intArray[0] = Integer.parseInt(strArray[0]);
        intArray[1] = Integer.parseInt(strArray[1]);
        return intArray;
    }

    /* 被子类重写的方法 */
    public abstract int calculate(int a, int b);
}

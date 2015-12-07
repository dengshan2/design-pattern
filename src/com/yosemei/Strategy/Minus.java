package com.yosemei.Strategy;

/**
 * Created by root on 9/24/15.
 */
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] arrayInt = split(exp, "-");
        return arrayInt[0] - arrayInt[1];
    }
}

package com.yosemei.Strategy;

/**
 * Created by root on 9/24/15.
 */
public abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {

        String[] array = exp.split(opt);
        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(array[0].trim());
        arrayInt[1] = Integer.parseInt(array[1].trim());
        return arrayInt;
    }
}

package com.yosemei.Strategy;

/**
 * Created by root on 9/24/15.
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "2 * 8";
        ICalculator cal = new Multiply();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}

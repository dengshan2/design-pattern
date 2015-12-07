package com.yosemei.TemplateMethod;

/**
 * Created by root on 9/24/15.
 */
public class TemplateTest {

    public static void main(String[] args) {
        String exp = "8 + 2   ";
        AbstractCalculator cal = new Puls();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}

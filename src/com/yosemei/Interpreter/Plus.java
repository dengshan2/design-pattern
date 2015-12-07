package com.yosemei.Interpreter;

/**
 * Created by root on 9/28/15.
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}

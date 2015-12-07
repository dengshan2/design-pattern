package com.yosemei.Interpreter;

/**
 * Created by root on 9/28/15.
 */
public class Test {
    public static void main(String[] args) {
        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));

        System.out.println(result);
    }
}

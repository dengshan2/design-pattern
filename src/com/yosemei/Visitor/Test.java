package com.yosemei.Visitor;

/**
 * Created by root on 9/28/15.
 */
public class Test {
    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);
    }
}

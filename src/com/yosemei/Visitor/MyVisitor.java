package com.yosemei.Visitor;

/**
 * Created by root on 9/28/15.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject : " + subject.getSubject());
    }
}

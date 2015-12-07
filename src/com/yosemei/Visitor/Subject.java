package com.yosemei.Visitor;

/**
 * Created by root on 9/28/15.
 */
public interface Subject {
    public void accept(Visitor visitor);

    public String getSubject();
}

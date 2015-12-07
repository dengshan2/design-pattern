package com.yosemei.State;

/**
 * Created by root on 9/28/15.
 */
public class State {

    private String value;

    public State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1() {
        System.out.println("execute the first opt!");
    }

    public void method2() {
        System.out.println("execute the second opt");
    }
}

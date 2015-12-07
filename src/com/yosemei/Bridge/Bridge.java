package com.yosemei.Bridge;

/**
 * Created by root on 9/23/15.
 */
public abstract class Bridge {

    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}

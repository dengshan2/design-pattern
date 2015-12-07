package com.yosemei.ChainOfResponsibility;

/**
 * Created by root on 9/25/15.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}

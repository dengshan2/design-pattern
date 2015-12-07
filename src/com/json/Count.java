package com.json;

/**
 * Created by root on 11/24/15.
 * author: zd
 */
public class Count {
    private int count;

    public Count(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return count + "";
    }
}

package com.yosemei.Iterator;

/**
 * Created by root on 9/25/15.
 */
public class MyCollection implements Collection {

    private String[] string = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}

package com.yosemei.Iterator;

import java.util.Iterator;

/**
 * Created by root on 9/25/15.
 */
public interface Collection {

    public com.yosemei.Iterator.Iterator iterator();

    public Object get(int i);

    public int size();
}

package com.yosemei.ThreadTest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by root on 9/18/15.
 */
public class NameList {
    private List nameList = Collections.synchronizedList(new LinkedList<Object>());

    public synchronized void add(String name) {
        nameList.add(name);
    }

    public synchronized String removeFirst() {
        if (nameList.size() > 0) {
            return (String)nameList.remove(0);
        } else {
            return null;
        }
    }
}

package Enumeration1;

import java.util.Enumeration;

/**
 * Created by root on 10/19/15.
 */
public class MyEnumeration implements Enumeration {
    private int count;
    private int length;
    private Object[] dataArray;

    public MyEnumeration(int count, int length, Object[] dataArray) {
        this.count = count;
        this.length = length;
        this.dataArray = dataArray;
    }

    @Override
    public boolean hasMoreElements() {
        return (count < length);
    }

    @Override
    public Object nextElement() {
        return dataArray[count++];
    }
}

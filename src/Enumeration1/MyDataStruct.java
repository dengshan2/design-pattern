package Enumeration1;

import java.util.Enumeration;

/**
 * Created by root on 10/19/15.
 */
public class MyDataStruct {
    private Object[] dataArray;

    public MyDataStruct() {
        dataArray = new Object[4];
        dataArray[0] = "one";
        dataArray[1] = "two";
        dataArray[2] = "three";
        dataArray[3] = "four";
    }

    public Enumeration getEnum() {
        return new MyEnumeration(0, dataArray.length, dataArray);
    }
}

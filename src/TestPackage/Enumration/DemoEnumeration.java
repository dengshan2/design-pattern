package TestPackage.Enumration;

import java.util.Enumeration;

/**
 * Created by root on 10/14/15.
 */
public class DemoEnumeration {
    public static void main(String[] args) {
        MyDataStruct dataStruct = new MyDataStruct();

        Enumeration e = dataStruct.getEnum();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

class MyEnumeration implements Enumeration {
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
        return count < length;
    }

    @Override
    public Object nextElement() {
        return dataArray[count++];
    }
}

class MyDataStruct {
    String[] data;

    public MyDataStruct() {
        data = new String[4];
        data[0] = "zero";
        data[1] = "one";
        data[2] = "two";
        data[3] = "three";
    }

    public Enumeration getEnum() {
        return new MyEnumeration(0, data.length, data);
    }
}

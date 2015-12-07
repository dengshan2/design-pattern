package Enumeration1;

import java.util.Enumeration;

/**
 * Created by root on 10/19/15.
 */
public class DemoEnumeration {
    public static void main(String[] args) {
        MyDataStruct dataStruct = new MyDataStruct();
        Enumeration enumeration = dataStruct.getEnum();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}

package com.yosemei.Reflect;

import java.awt.*;

/**
 * Created by root on 9/29/15.
 */
public class SampleComponentReflection {
    public static void main(String[] args) {
        int[] ints = new int[2];
        Button[] buttons = new Button[6];
        String[][] twoDim = new String[4][5];
        String[] two = new String[4];

        printComponentType(ints);
        printComponentType(buttons);
        printComponentType(twoDim);
        printComponentType(two);
    }

    static void printComponentType(Object array) {
        Class<?> arrayClass = array.getClass();
        String arrayName = arrayClass.getName();
        Class<?> componentClass = arrayClass.getComponentType();
        String componentName = componentClass.getName();
        System.out.println("ArrayClass: " + arrayClass + ", ----------ArrayName: " +
        arrayName + ", ----------Component: " + componentName);
    }
}

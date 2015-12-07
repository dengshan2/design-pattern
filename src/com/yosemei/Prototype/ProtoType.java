package com.yosemei.Prototype;

/**
 * Created by root on 9/18/15.
 */
public class ProtoType implements Cloneable {

    public Object clone() throws CloneNotSupportedException {
        ProtoType proto = (ProtoType)super.clone();

        return proto;
    }
}

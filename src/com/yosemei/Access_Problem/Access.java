package com.yosemei.Access_Problem;

/**
 * Created by root on 9/17/15.
 */
public class Access {

    public static void main(String[] args) {

        BaseAccess baseAccess = new DerivedAccess();

        baseAccess.f();

        baseAccess.g();

        baseAccess = new BaseAccess();

        baseAccess.f();

        baseAccess.g();
    }
}

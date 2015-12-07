package com.yosemei.Access_Problem;

/**
 * Created by root on 9/17/15.
 */
class DerivedAccess extends BaseAccess {

    protected void f() {
        System.out.println("from protected to public in derived class");
    }

    public void g() {
        System.out.println("from public to protected");
    }

}
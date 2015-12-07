package com.yosemei.Synchronize;

/**
 * Created by root on 9/28/15.
 */
public class User {
    private String code;
    private int cash;

    public User(String code, int cash) {
        this.cash = cash;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 业务方法
     * @param x 添加x万元
     */
    public void oper(int x) {
        try {
            Thread.sleep(10L);
            synchronized(this) {
                this.cash += x;
                System.out.println(Thread.currentThread().getName() + "运行结束， 增加“" + x + "”， 当前用户账户余额为：" + cash);
                Thread.sleep(10L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "User{" + "code='" + code + "', cash='" + cash + "'}";
    }
}
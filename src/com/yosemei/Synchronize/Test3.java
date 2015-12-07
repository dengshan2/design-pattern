package com.yosemei.Synchronize;

/**
 * Created by root on 9/28/15.
 */
public class Test3 {
    public static void main(String[] args) {
        DeadlockRisk dead = new DeadlockRisk();
        MyThread1 t1 = new MyThread1(dead, 1, 2);
        MyThread1 t2 = new MyThread1(dead, 3, 4);
        MyThread1 t3 = new MyThread1(dead, 5, 6);
        MyThread1 t4 = new MyThread1(dead, 7, 8);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class MyThread1 extends Thread {
    private DeadlockRisk dead;
    private int a, b;

    public MyThread1(DeadlockRisk dead, int a, int b) {
        this.dead = dead;
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        dead.read();
        dead.write(a, b);
    }
}

class DeadlockRisk {
    private static class Resource {
        public int value;
    }

    private Resource resourceA = new Resource();
    private Resource resourceB = new Resource();

    public int read() {
        synchronized (resourceA) {
            System.out.println("read():" + Thread.currentThread().getName() + "获取了resourceA的锁！");
            synchronized (resourceB) {
                System.out.println("read():" + Thread.currentThread().getName() + "获取了resourceB的锁！");
                return resourceA.value + resourceB.value;
            }
        }
    }

    public void write(int a, int b) {
        synchronized (resourceB) {
            System.out.println("write():" + Thread.currentThread().getName() + "获取了resourceB的锁！");
            synchronized (resourceA) {
                System.out.println("write():" + Thread.currentThread().getName() + "获取了resourceA的锁");
                resourceA.value = a;
                resourceB.value = b;
            }
        }
    }
}
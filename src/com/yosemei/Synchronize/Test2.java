package com.yosemei.Synchronize;

/**
 * java线程：并发协作-生产者消费者模型
 *
 * Created by root on 9/28/15.
 */
public class Test2 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(30);
        Consumer c1 = new Consumer(50, warehouse);
        Consumer c2 = new Consumer(20, warehouse);
        Consumer c3 = new Consumer(100, warehouse);
        Producer p1 = new Producer(10, warehouse);
        Producer p2 = new Producer(10, warehouse);
        Producer p3 = new Producer(10, warehouse);
        Producer p4 = new Producer(10, warehouse);
        Producer p5 = new Producer(10, warehouse);
        Producer p6 = new Producer(10, warehouse);
        Producer p7 = new Producer(80, warehouse);

        c1.start();
        c2.start();
        c3.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
    }
}

class Warehouse {
    public static final int MAXSIZE = 100; // 最大库存量
    public int curnum; // 当前库存量

    public Warehouse(int curnum) {
        this.curnum = curnum;
    }

    public Warehouse() {

    }

    /**
     * 生产指定数量的产品
     *
     * @param neednum
     */
    public synchronized void produce(int neednum) {
        while (neednum + curnum > MAXSIZE) {
            System.out.println("要生产的产品数量" + neednum + "超过剩余库存量" + (MAXSIZE - curnum) + "， 暂时不能执行生产任务！");
            try {
                // 当前生产的线程等待
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 满足生产条件， 则进行生产， 这里简单的更改当前库存量
        curnum += neednum;
        System.out.println("已经生产了" + neednum + "个产品， 现仓储量为" + curnum);
        // 唤醒在此对象监视器上等待的所有线程
        notifyAll();

    }

    /**
     * 消费指定数量的产品
     *
     * @param neednum
     */
    public synchronized void consume(int neednum) {
        // 测试是否可消费
        while (curnum < neednum) {
            try {
                // 当前的消费线程等待
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 满足消费条件，则进行消费，这里简单的更改当前库存量
        curnum -= neednum;
        System.out.println("已经消费了" + neednum + "个产品，现仓储量为" + curnum);
        // 唤醒在此对象监视器上等待的所有线程
        notifyAll();
    }
}

/**
 * 生产者
 */
class Producer extends Thread {
    private int neednum;
    private Warehouse warehouse;

    public Producer(int neednum, Warehouse warehouse) {
        this.neednum = neednum;
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        // 生产指定数量的产品
        warehouse.produce(neednum);
    }
}


/**
 * 消费者
 */
class Consumer extends Thread {
    private int neednum;
    private Warehouse warehouse;

    public Consumer(int neednum, Warehouse warehouse) {
        this.neednum = neednum;
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.consume(neednum);
    }
}

package com.json;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by root on 11/24/15.
 * author: zd
 */
public class MapTest {
    public static void main(String[] args) throws InterruptedException {
        final Map<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 0);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = map.get(1);
                System.out.println(count);
                for (int i = 0; i < 5000; i++) {
                    map.put(1, i+1);
                }
                System.out.println("thread: " + map.get(1));
            }
        });
        t.start();
        t.join();
        System.out.println("main: " + map.get(1));
    }
}

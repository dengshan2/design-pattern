package blockingqueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by root on 11/3/15.
 * author: zd
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        long t1, t2;
        for (int i = 0; i < 10000000; i++) {
            list.add("aaaaaa" + i);
        }
        System.out.println("List first visit method:");
        t1 = System.currentTimeMillis();
        for (String line : list) {

        }
        t2 = System.currentTimeMillis();
        System.out.println("Run time : " + (t2-t1) + " ms");
        System.out.println("List second visit method:");
        t1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Run time : " + (t2-t1) + " ms");
        System.out.println("List third visit method:");
        t1 = System.currentTimeMillis();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        t2 = System.currentTimeMillis();
        System.out.println("Run time : " + (t2-t1) + " ms");
    }
}

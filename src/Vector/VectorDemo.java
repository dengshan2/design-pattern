package Vector;

import java.util.Vector;

/**
 * Created by root on 10/13/15.
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(4);

        v.add("Test0");
        v.add("Test1");
        v.add("Test0");
        v.add("Test2");
        v.add("Test2");

        v.remove("Test0");
        v.remove(0);

        int size = v.size();
        System.out.println("向量的大小为：" + size);

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }
}

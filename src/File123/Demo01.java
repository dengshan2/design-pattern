package File123;

import java.io.File;

/**
 * Created by root on 10/8/15.
 */
public class Demo01 {
    public static void main(String[] args) {
        File f = new File(".");
        fun(f);
    }

    public static void fun(File f) {
        if (f.isDirectory()) {
            System.out.println(f);
            File[] list = f.listFiles();
            for (int i = 0; i < list.length; i++) {
                fun(list[i]);
            }
        } else {
            System.out.println(f);
        }
    }
}

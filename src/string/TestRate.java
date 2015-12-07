package string;

import java.util.StringTokenizer;

/**
 * Created by root on 11/17/15.
 * author: zd
 */
public class TestRate {
    public static void main(String[] args) {
//        String s = "0";
//        int n = 10000;
//        long begin = System.currentTimeMillis();
//        for (int i = 1; i < n; i++) {
//            s = s + i;
//        }
//        long end = System.currentTimeMillis();
//        long between = end - begin;
//        System.out.println("String 消耗的时间 ： " + between + " ms");
//
//        StringBuffer buffer = new StringBuffer("0");
//        int n2 = 10000;
//        begin = System.currentTimeMillis();
//        for (int i = 1; i < n2; i++) {
//            buffer.append(i);
//        }
//        end = System.currentTimeMillis();
//        between = end - begin;
//        System.out.println("StringBuffer 消耗时间 : " + between + " ms");
//
//        StringBuilder builder = new StringBuilder("0");
//        int n3 = 10000;
//        begin = System.currentTimeMillis();
//        for (int i = 1; i < n3; i++) {
//            builder.append(i);
//        }
//        end = System.currentTimeMillis();
//        between = end - begin;
//        System.out.println("StringBuild 消耗时间 ： " + between + " ms");

        String s1 = "Tonight is the answer !";
        String[] arr = s1.split("\\s+");
        for (String str : arr) {
            System.out.println(str);
        }
        StringTokenizer st = new StringTokenizer(s1," ");
        int count = st.countTokens();
        System.out.println("个数为:"+count);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }

    }
}

package designPattern.Chain_Of_Responsibility;

/**
 * Created by root on 10/22/15.
 * author: zd
 */
public class Test {
    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("H1");
        MyHandler h2 = new MyHandler("H2");
        MyHandler h3 = new MyHandler("H3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
    }
}

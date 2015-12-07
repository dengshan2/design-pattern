package designPattern.Observer;

/**
 * Created by root on 10/21/15.
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject s = new MySubject();
        Observer o1 = new Observer1();
        Observer o2 = new Observer2();

        s.add(o1);
        s.add(o2);
        s.operation();

        System.out.println("==========================================");
        s.del(o1);
        s.operation();

        System.out.println("------------------------------------------");
        s.del(o2);
        s.operation();
    }
}

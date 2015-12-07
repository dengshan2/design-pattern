package designPattern.Iterator1;

/**
 * Created by root on 10/21/15.
 * author: zd
 */
public class Test {
    public static void main(String[] args) {
        Collection c = new MyCollection();
        Iterator i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

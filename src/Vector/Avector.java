package Vector;

import java.util.Vector;

/**
 * Created by root on 10/13/15.
 * zd
 */
public class Avector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        vector.addElement("one");
        System.out.println(vector);

        vector.addElement("two");
        System.out.println(vector);

        vector.addElement("three");
        System.out.println(vector);

        vector.insertElementAt("zero", 0);
        System.out.println(vector);

        vector.insertElementAt("oop", 3);
        System.out.println(vector);

        vector.setElementAt("three", 3);
        System.out.println(vector);

        vector.setElementAt("four", 4);
        System.out.println(vector);
    }
}

package Calendar;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Calendar;

/**
 * Created by root on 10/20/15.
 * author: zd
 */
public class WhatIsCalendarRead {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("calendar.out"));
        Calendar c1 = Calendar.getInstance();
        c1.set(2000, Calendar.JULY, 1, 0, 0, 0);
        System.out.println("c1 : " + c1.getTime().getTime());
        Calendar c2 = (Calendar)ois.readObject();
        System.out.println("c2 : " + c2.getTime().getTime());
        if (c1.equals(c2)) {
            System.out.println("Equal");
        } else {
            System.out.println("NotEqual");
        }
        System.out.println("New calendar " + c1.getTime().getTime());
        System.out.println("Old calendar " + c2.getTime().getTime());

        c1.set(Calendar.MILLISECOND, 0);
        c2 = (Calendar)ois.readObject();
        if (c1.equals(c2)) {
            System.out.println("Equal");
        } else {
            System.out.println("NotEqual");
        }
        System.out.println("Processed New calendar " + c1.getTime().getTime() + ", " + c1.getTime());
        System.out.println("Processed Old calendar " + c2.getTime().getTime() + ", " + c2.getTime());
    }
}

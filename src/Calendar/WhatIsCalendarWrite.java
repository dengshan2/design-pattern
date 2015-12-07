package Calendar;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

/**
 * Created by root on 10/20/15.
 * author: zd
 */
public class WhatIsCalendarWrite {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("calendar.out"));
        Calendar c1 = Calendar.getInstance();
        c1.set(2000, Calendar.JULY, 1, 0, 0, 0);
        System.out.println("c1 : " + c1.getTime() + ", long : " + c1.getTime().getTime());
        oos.writeObject(c1);
        Calendar c2 = Calendar.getInstance();
        c2.set(2000, Calendar.JULY, 1, 0, 0, 0);
        c2.set(Calendar.MILLISECOND, 0);
        System.out.println("c2 : " + c2.getTime() + ", long : " + c2.getTime().getTime());
        oos.writeObject(c2);
        oos.close();
    }
}

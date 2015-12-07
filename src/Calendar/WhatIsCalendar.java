package Calendar;

import java.util.Calendar;

/**
 * Created by root on 10/20/15.
 * author: zd
 */
public class WhatIsCalendar {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        if (calendar instanceof GregorianCalendar) {
//            System.out.println("It is an instance of GregorianCalendar!");
//        }
//        Date date = calendar.getTime();
//        System.out.println(date);
//        calendar.set(Calendar.MONTH, 0);
//        System.out.println(calendar.getTime());
        Calendar c1 = Calendar.getInstance();
        c1.set(2000, Calendar.JANUARY, 32, 0, 0, 0);
        System.out.println("c1 : " + c1.getTime());
        c1.setLenient(true);
        c1.set(2000, Calendar.FEBRUARY, 32, 0, 0, 0);
        System.out.println(c1.getTime());
    }
}

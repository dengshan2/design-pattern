package Calendar;


import java.text.DateFormat;
import java.util.Date;

/**
 * Created by root on 10/20/15.
 */
public class DateExample4 {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        DateFormat longDateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        DateFormat fulDateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);

        System.out.println(shortDateFormat.format(date));
        System.out.println(mediumDateFormat.format(date));
        System.out.println(longDateFormat.format(date));
        System.out.println(fulDateFormat.format(date));
    }
}

package Calendar;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by root on 10/20/15.
 * author: zd
 */
public class UnstableCalendar implements Serializable {
    public static void main(String[] args) throws Exception {
        Calendar c1 = Calendar.getInstance();
        c1.set(1999, Calendar.MAY, 6, 0, 0, 0);
        System.out.println("1 : " + c1.getTime());
        c1.roll(Calendar.WEEK_OF_MONTH, -1);
        System.out.println("2 : " + c1.getTime());
        c1.set(1999, Calendar.MAY, 6, 0, 0, 0);
        c1.add(Calendar.WEEK_OF_MONTH, -1);
        System.out.println("3 : " + c1.getTime());
    }
}

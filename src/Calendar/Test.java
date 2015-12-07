package Calendar;

import java.util.Calendar;

/**
 * Created by root on 10/20/15.
 * author: zd
 */
public class Test {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2000, 7, 31, 0, 0, 0);
        c1.set(Calendar.MONTH, Calendar.SEPTEMBER);
        c1.set(Calendar.DAY_OF_MONTH, 30);
        System.out.println(c1.getTime());
    }
}

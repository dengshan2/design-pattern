package Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by root on 10/20/15.
 */
public class DateExample2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE-MMMM-dd-yyyy");

        System.out.println(sdf.format(new Date()));
    }
}

package Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by root on 10/20/15.
 */
public class DateExample3 {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String dateToParse = "9-29-2001";

        Date date = sdf.parse(dateToParse);
        System.out.println(date.getTime());
    }
}

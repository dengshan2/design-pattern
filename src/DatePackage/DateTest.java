package DatePackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *      《登乐游原》 作者： 李商隐
 *      向晚意不适， 驱车游古原。
 *      夕阳无限好， 只是近黄昏。
 * Created by root on 11/13/15.
 * author: zd
 */
public class DateTest {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = sdf2.parse("2015-7-8");
        Date date3 = sdf2.parse("2015-7-9");
        System.out.println(date2.getTime());
        System.out.println(date3.getTime());
        System.out.println("date3 : " + date3);
        System.out.println(date3.getTime() - date2.getTime());
        System.out.println(3600*24*1000);
        SimpleDateFormat sdf3 = new SimpleDateFormat("MMM dd HH:mm:ss");
        Date date4 = sdf3.parse("Oct 27 16:31:49");
        System.out.println(date4.toString());
        System.out.println(date4.getTime());
        String line = "Nov  8 03:30:01 localhost systemd: Starting Session 550 of user root.";
        Pattern pattern = Pattern.compile("\\w{3}\\s+\\d{1,2}\\s\\d{2}:\\d{2}:\\d{2}");
        Matcher matcher = pattern.matcher(line);
        String buffer = null;
        if (matcher.find()) {
            buffer = matcher.group();
        }
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        Date date1 = calendar.getTime();
        System.out.println(year);
        System.out.println(buffer);
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyyMMM dd HH:mm:ss");
        Date date5 = sdf4.parse(year + buffer);
        System.out.println(date5.toString());
        System.out.println(date5.getTime());
        System.out.println(date1.getTime());
        System.out.println(line);


        Date date6 = sdf4.parse("2015Oct 19 03:31:02");
        System.out.println("date6 : " + date6);
        System.out.println("date6 : " + date6.getTime());
        Date date7 = sdf2.parse("2015-11-16");
        System.out.println("date7 : " + date7);
        System.out.println("date7 : " + date7.getTime());

        System.out.println(date6.getTime() >= date7.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Pattern pattern1 = Pattern.compile("\\d{8}");
        Matcher matcher1 = pattern1.matcher("maillog-20150927");
        if (matcher1.find()) {
            String buffer1 = matcher1.group();
            Date date8 = simpleDateFormat.parse(buffer1);
            System.out.println("date8 : " + date8);
        }
        Date date8 = new Date(1445109751*1000l);
        System.out.println(date8);


        Pattern pattern2 = Pattern.compile("\\w{3}\\s\\w{3}\\s\\d{1,2}\\s\\d{2}:\\d{2}:\\d{2}\\s\\d{4}");
        Matcher matcher2 = pattern2.matcher("[ 24885.333] AUDIT: Mon Nov 16 15:19:54 2015: 3937: client 43 disconnected");
        if (matcher2.find()) {
            String buffer2 = matcher2.group();
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("E MMM dd hh:mm:ss yyyy");
            Date date9 = simpleDateFormat1.parse(buffer2);
            System.out.println("date9 : " + date9);
            System.out.println(date9.getTime());
        }

        Pattern pattern3 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}");
        Matcher matcher3 = pattern3.matcher("root     pts/18       2015-10-22 19:26   ?         15082 (192.168.21.20)");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date date9 = simpleDateFormat1.parse("2015-10-23 10:08");
        System.out.println(date9);
        System.out.println(date9.getTime());
        if (matcher3.find()) {
            String buffer3 = matcher3.group();
            Date date10 = simpleDateFormat1.parse(buffer3);
            System.out.println(date10);
            System.out.println(date10.getTime());
        }
        Date date10 = new Date(1447603200000l);
        System.out.println(date10);
        System.out.println(date10.getTime());



















    }
}

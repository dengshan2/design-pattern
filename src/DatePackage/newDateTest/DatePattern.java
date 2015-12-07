package DatePackage.newDateTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *      《关山月》 作者：李白
 *      明月出天山， 苍茫云海间。
 *      长风几万里， 吹度玉门关。
 *      汉下白登道， 胡窥青海湾。
 *      由来征战地， 不见有人还。
 *      戍客望边色， 思归多苦颜。
 *      高楼当此夜， 叹息未应闲。
 * Created by root on 11/25/15.
 * author: zd
 */
public class DatePattern {
    private static final Logger LOGGER = LoggerFactory.getLogger(DatePattern.class);
    public static void main(String[] args) throws ParseException {
//        parse1("16/Mar/2005:01:01:42");
//        parse2("04:30:58,252");
//        parse3("Jan 7, 2013 12:58:51 AM");
//        parse4("2013-10-31 21:12:57");
//        long timestamp = parse5("Dec 12 03:15:01");
//        System.out.println(timestamp);
//        System.out.println(new Date(timestamp));
//        parse6("Thu Oct 31 04:22:38 CST 2013");
//        parse7("2015年 01月 07日 星期三 12:02:26 CST");
//        parse8("2013/12/20 16:00:07");
//        parse9("19-11-2014 10:41:24");
//        parse10("Jun 03 19:04:52 2006");
//        parse11("2014-11-19T04:13:58");
//        parse12("2015-11-09 18:10:33,890");
//        parse13("2015-06-25 15:17");

//        pattern("16/Mar/2005:01:01:42");          // 1
//        pattern("04:30:58,252");                  // 2
//        pattern("Jan 7, 2013 12:58:51 AM");       // 3
//        pattern("Oct 28, 2013 4:20:32 PM");       // 3
//        pattern("2013-10-31 21:12:57");           // 4
//        pattern("2013-08-25 23:15:38");           // 4
//        pattern("Jan 12 03:15:01");               // 5
//        pattern("Thu Oct 31 04:22:38 CST 2013");  // 6
//        pattern("2013/12/20 16:00:07");           // 8
//        pattern("19-11-2014 10:41:24");           // 9
//        pattern("Jun 03 19:04:52 2006");          // 10
//        pattern("2014-11-19T04:13:58");           // 11
//        pattern("2015-11-09 18:10:33,890");       // 12
//        long start = System.currentTimeMillis();
//        System.out.println("start : " + start);
//        long t = pattern("2015年 01月 07日 星期三 12:02:26 CST");                               // 7
//        System.out.println(t);
//        long timestamp = pattern("Oct 18 03:23:01 localhost run-parts(/etc/cron.daily)[5474]: finished logrotate");
//        System.out.println(timestamp);
//        long end = System.currentTimeMillis();
//        System.out.println("end : " + end);
//        System.out.println(end - start);
        long timestamp = pattern("root     pts/0        2015-06-25 15:17 00:10        3702 (:0.0)");
        System.out.println(timestamp);
        System.out.println(new Date(timestamp));
    }

    public static long pattern(String text) {
        long timestamp = -1l;
        boolean flag = true;
        while (flag) {
            /* Jun 03 19:04:52 2006 */
            Pattern pattern = Pattern.compile("^\\w{3}\\s\\d{2}\\s\\d{2}:\\d{2}:\\d{2}\\s\\d{4}");
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse10(regex);
                break;
            }
            /* Jan 12 03:15:01 */
            pattern = Pattern.compile("^\\w{3}\\s\\d{2}\\s\\d{2}:\\d{2}:\\d{2}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse5(regex);
                break;
            }
            /* 2015年 01月 07日 星期三 12:02:26 CST */
            pattern = Pattern.compile("^\\d{4}年\\s\\d{2}月\\s\\d{2}日\\s.{3}\\s\\d{2}:\\d{2}:\\d{2}\\s\\w{3}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse7(regex);
                break;
            }
            /* 16/Mar/2005:01:01:42 */
            pattern = Pattern.compile("^\\d{2}/\\w{3}/\\d{4}:\\d{2}:\\d{2}:\\d{2}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse1(regex);
                break;
            }
            /* 04:30:58,252 */
            pattern = Pattern.compile("^\\d{2}:\\d{2}:\\d{2},\\d{3}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse2(regex);
                break;
            }
            /* Jan 7, 2013 12:58:51 AM */
            /* Oct 28, 2013 4:20:32 PM */
            pattern = Pattern.compile("^\\w{3}\\s\\d{1,2},\\s\\d{4}\\s\\d{1,2}:\\d{1,2}:\\d{1,2}\\s\\w{2}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse3(regex);
                break;
            }
            /* 2015-11-09 18:10:33,890 */
            pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2},\\d{3}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse12(regex);
                break;
            }
            /* 2013-10-31 21:12:57 */
            pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse4(regex);
                break;
            }
            /* 2015-06-25 15:17 */
            pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse13(regex);
                break;
            }
            /* Thu Oct 31 04:22:38 CST 2013 */
            pattern = Pattern.compile("^\\w{3}\\s\\w{3}\\s\\d{2}\\s\\d{2}:\\d{2}:\\d{2}\\s\\w{3}\\s\\d{4}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse6(regex);
                break;
            }
            /* 2013/12/20 16:00:07 */
            pattern = Pattern.compile("^\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}:\\d{2}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse8(regex);
                break;
            }
            /* 19-11-2014 10:41:24 */
            pattern = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}\\s\\d{2}:\\d{2}:\\d{2}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse9(regex);
                break;
            }
            /* 2014-11-19T04:13:58 */
            pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}\\w\\d{2}:\\d{2}:\\d{2}");
            matcher = pattern.matcher(text);
            if (matcher.find()) {
                String regex = matcher.group();
                timestamp = parse11(regex);
                break;
            }
            flag = false;
        }
        return timestamp;
    }

    /* 2015-06-25 15:17 */
    private static long parse13(String text) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
//        System.out.println("parse13 : " + date);
//        System.out.println("parse13 : " + date.getTime());
        return date.getTime();
    }

    /*　2015-11-09 18:10:33,890　*/
    private static long parse12(String text) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
//        System.out.println("parse12 : " + date);
//        System.out.println("parse12 : " + date.getTime());
        return date.getTime();
    }

    /* 2014-11-19T04:13:58 */
    private static long parse11(String text) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
//        System.out.println("parse11 : " + date);
//        System.out.println("parse11 : " + date.getTime());
        return date.getTime();
    }

    /* Jun 03 19:04:52 2006 */
    private static long parse10(String text) {
        SimpleDateFormat format = new SimpleDateFormat("MMM dd HH:mm:ss yyyy");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
//        System.out.println("parse10 : " + date);
//        System.out.println("parse10 : " + date.getTime());
        return date.getTime();
    }

    /*　19-11-2014 10:41:24　*/
    private static long parse9(String text) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
//        System.out.println("parse9 : " + date);
//        System.out.println("parse9 : " + date.getTime());
        return date.getTime();
    }

    /* 2013/12/20 16:00:07 */
    private static long parse8(String text) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
//        System.out.println("parse8 : " + date);
//        System.out.println("parse8 : " + date.getTime());
        return date.getTime();
    }

    /* 2015年 01月 07日 星期三 12:02:26 CST  */
    private static long parse7(String text) {
        // 想办法把星期几去掉， 这个不好处理。
        int index = text.indexOf("星期");
        String text1 = text.substring(0, index).trim();
        String text2 = text.substring(index+3).trim();
        text = text1 + text2;

        SimpleDateFormat format = new SimpleDateFormat("yyyy年 MM月 dd日HH:mm:ss z");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1;
        }
//        System.out.println("parse7 : " + date);
//        System.out.println("parse7 : " + date.getTime());
        return date.getTime();
    }

    /* Thu Oct 31 04:22:38 CST 2013 */
    private static long parse6(String text) {
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
//        System.out.println("parse6 : " + date);
//        System.out.println("parse6 : " + date.getTime());
        return date.getTime();
    }

    /* Jan 12 03:15:01 */  // 需要加年份，这个要判断一下，不要超过当前时间
    private static long parse5(String text) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        String text1 = text + year;
        SimpleDateFormat format = new SimpleDateFormat("MMM dd HH:mm:ssyyyy");
        Date date;
        try {
            date = format.parse(text1);
            if (date.getTime() >= System.currentTimeMillis()) {
                text = text + (year - 1);
                date = format.parse(text);
            }
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
//        System.out.println("parse5 : " + date);
//        System.out.println("parse5 : " + date.getTime());
        return date.getTime();
    }

    /* 2013-10-31 21:12:57 */
    private static long parse4(String text) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
        System.out.println("parse4 : " + date);
        System.out.println("parse4 : " + date.getTime());
        return date.getTime();
    }

    /* Jan 7, 2013 12:58:51 AM */
    private static long parse3(String text) {
        SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss aa");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
//        System.out.println("parse3 : " + date);
//        System.out.println("parse3 : " + date.getTime());
        return date.getTime();
    }

    /* 04:30:58,252 */ // 只有时间， 没有日期，定为当前天。
    private static long parse2(String text) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        text = text + year + month + day;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss,SSSyyyyMMdd");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1l;
        }
//        System.out.println("parse2 : " + date);
//        System.out.println("parse2 : " + date.getTime());
        return date.getTime();
    }

    /* 16/Mar/2005:01:01:42 */
    private static long parse1(String text) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss");
        Date date;
        try {
            date = format.parse(text);
        } catch (ParseException e) {
            LOGGER.warn("", e);
            return -1;
        }
//        System.out.println("parse1 : " + date);
//        System.out.println("parse1 : " + date.getTime());
        return date.getTime();
    }

    /* 获取当前时间 */
    private static long getCurrentTime() {
        Date date = new Date();
        System.out.println(date);
        return date.getTime();
    }

    /* 获取时区 */
    private static String getTimeZone() {
        Calendar cal = Calendar.getInstance();
        TimeZone zone = cal.getTimeZone();
        return zone.getDisplayName();
    }
}

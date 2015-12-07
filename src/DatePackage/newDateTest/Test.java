package DatePackage.newDateTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by root on 11/27/15.
 * author: zd
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        Pattern pattern = Pattern.compile("");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse("2015-8-10");
        System.out.println(date.getTime());
        System.out.println(date);

        File dir = new File("./test");
        if (!dir.exists() && !dir.mkdirs()) {
            throw new Exception("make dir failed");
        }
        File[] files = dir.listFiles();
        if (files != null) {
            System.out.println("ok : " + files.length);
        } else {
            System.out.println("failed : files is null");
        }
    }
}

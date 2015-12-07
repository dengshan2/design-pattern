package zip;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/**
 * Created by root on 11/13/15.
 * author: zd
 */
public class aaa {
    public static void main(String[] args) {
        try {
            readZipFile("./conf/maillog-20150407.gz");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readZipFile(String file) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new GZIPInputStream(
                                new FileInputStream(file)), "UTF-8"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}

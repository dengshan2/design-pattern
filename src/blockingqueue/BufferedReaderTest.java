package blockingqueue;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by root on 11/3/15.
 * author: zd
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        int i = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("test.json"))) {
            while (!reader.ready()) {
                Thread.sleep(10l);
            }
            while (reader.ready()) {
                System.out.println(reader.readLine());
                i++;
                if (i == 6) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

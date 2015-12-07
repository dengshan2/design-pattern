package tail;

import java.io.FileWriter;

/**
 * Created by root on 11/5/15.
 * author: zd
 */
public class Test {
    public static void main(String[] args) throws Exception {
        int count = 0;
        FileWriter writer;
        while (true) {
            writer = new FileWriter("test.txt", true);
            count++;
            writer.write("这是第 " + count + " 行\n");
            writer.flush();
            Thread.sleep(100l);
            if (count == 10000) {
                break;
            }
        }
        writer.close();
    }
}

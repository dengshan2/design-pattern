package File123;

import java.io.File;
import java.io.IOException;

/**
 * Created by root on 10/8/15.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("./conf/file");
        if (!file.exists()) {
            file.getParentFile().mkdir();
            file.createNewFile();
        }
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        if (file.isDirectory()) {
            System.out.println("directory");
        }
        if (file.isFile()) {
            System.out.println("file");
        }
        System.out.println(File.separator);
    }
}

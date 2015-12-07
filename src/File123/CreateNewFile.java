package File123;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by root on 10/9/15.
 */
public class CreateNewFile {
    public static void main(String[] args) throws Exception {
        // 创建类的对象并调用该对象的createNewFile() 方法，创建新文件并写入数据
        CreateNewFile cnf = new CreateNewFile();
        cnf.createNewFile(args[0], args[1]);
    }

    // 创建一个方法完成创建文件的目的，方法的第一个参数是文件路径和文件名，第二个参数是文件内容
    // 如： myfile.doc  HelloJava!
    public static void createNewFile(String fileDirectoryAndName, String fileContent) throws Exception {
        String fileName = fileDirectoryAndName;
        // 创建File对象，参数为String类型，表示路径和文件名
        File file = new File(fileName);
        // 判断文件是否存在，如果不存在则调用createNewFile()方法创建新文件，否则跳至异常处理代码
        if (!file.exists()) {
            file.createNewFile();
        } else {    // 如果不存在则扔出异常
            throw new Exception("The new file already exists!");
        }
        // 下面把数据写入创建的文件，首先新建文件名为参数创建FileWriter对象
        FileWriter fw = new FileWriter(file);
        // 把该对象包装进PrintWriter对象
        PrintWriter pw = new PrintWriter(fw);
        // 再通过PrintWriter对象的println()方法把字符串数据写入新建文件
        pw.println(fileContent);
        // 关闭文件写入流
        pw.close();































    }
}

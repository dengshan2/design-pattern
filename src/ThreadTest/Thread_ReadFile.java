package ThreadTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Calendar;

/**
 * Created by root on 10/19/15.
 */
public class Thread_ReadFile extends Thread {
    @Override
    public void run() {
        Calendar start = Calendar.getInstance();
        System.out.println(System.currentTimeMillis());
        FileInputStream fs = null;
        FileLock fileLock = null;
        try {
            sleep(5000l);
            File file = new File("test.txt");
            fs = new FileInputStream(file);
            FileChannel fileChannel = fs.getChannel();
            while (true) {
                fileLock = fileChannel.tryLock(0, Long.MAX_VALUE, true);
                if (fileLock != null) {
                    break;
                } else {
                    System.out.println("有线程在操作文件， 当前线程休眠1000毫秒");
                    sleep(1000l);
                }
            }
            byte[] buf = new byte[1024];
            StringBuffer sb = new StringBuffer();
            int count;
            while ((count = fs.read(buf)) != -1) {
                sb.append(new String(buf, 0, count, "utf-8"));
                sleep(100l);
            }
            System.out.println(sb.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fs != null) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            Calendar end = Calendar.getInstance();
            System.out.println(System.currentTimeMillis());
            System.out.println("读文件共花了" + (end.getTimeInMillis() - start.getTimeInMillis()) + "毫秒");
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread_ReadFile();
        t.start();
    }
}

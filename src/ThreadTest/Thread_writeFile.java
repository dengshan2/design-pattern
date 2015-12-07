package ThreadTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Calendar;

/**
 * Created by root on 10/19/15.
 */
public class Thread_writeFile extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Calendar start = Calendar.getInstance();
        File file = new File("test.txt");
        FileOutputStream fs = null;
        FileChannel fileChannel = null;
        FileLock fileLock = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fs = new FileOutputStream(file);
            fileChannel = fs.getChannel();
            while (true) {
                fileLock = fileChannel.tryLock();
                if (fileLock != null) {
                    break;
                } else {
                    System.out.println("有其它线程正在操作当前文件， 等待100毫秒！");
                    sleep(100l);
                }
            }
            for (int i = 1; i <= 1000; i++) {
                sleep(10l);
                StringBuffer sb = new StringBuffer();
                sb.append("这是第" + i + "行， nanjingnanjing！\n");
                fs.write(sb.toString().getBytes("utf-8"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
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
            System.out.println(Thread.currentThread().getName());
            System.out.println("写文件共花了" + (end.getTimeInMillis() - start.getTimeInMillis()) + "毫秒");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread_writeFile();
        t1.start();
        t1.setName("1111");
    }
}

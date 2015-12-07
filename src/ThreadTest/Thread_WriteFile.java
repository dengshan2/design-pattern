package ThreadTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by root on 10/19/15.
 */
public class Thread_WriteFile extends Thread {
    @Override
    public void run() {
        Calendar start = Calendar.getInstance();
        File file = new File("test.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < 1000; i++) {
                sleep(10l);
                bw.write("这是第" + (i+1) + "行， 应该没错哈！\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                    fw = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        Calendar end = Calendar.getInstance();
        System.out.println("写文件共用了" + (end.getTimeInMillis() - start.getTimeInMillis()) + "毫秒");
    }

    public static void main(String[] args) {
        Thread thread = new Thread_WriteFile();
        thread.start();
    }
}

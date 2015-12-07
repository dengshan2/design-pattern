package ThreadTest;

import java.io.*;
import java.util.Calendar;

/**
 * Created by root on 10/19/15.
 */
public class Thread_readFile extends Thread {
    @Override
    public void run() {
        Calendar start = Calendar.getInstance();
        try {
            sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File file = new File("test.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String temp = null;
            while ((temp = br.readLine()) != null) {
                System.out.println(System.currentTimeMillis());
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            Calendar end = Calendar.getInstance();
            System.out.println(System.currentTimeMillis());
            System.out.println("读文件共用了" + (end.getTimeInMillis() - start.getTimeInMillis()) + "毫秒");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread_readFile();
        thread.start();
    }
}

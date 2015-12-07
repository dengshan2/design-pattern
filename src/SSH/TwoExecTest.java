package SSH;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by root on 11/11/15.
 * author: zd
 */
public class TwoExecTest {
    public static void main(String[] args) throws Exception {
        JSch jSch = new JSch();
        final Session session = jSch.getSession("root", "192.168.21.140", 22);
        java.util.Properties config = new java.util.Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.setPassword("sqq123");
        session.connect(15000);
        session.setServerAliveInterval(12000);
        ChannelExec openChannel = (ChannelExec) session.openChannel("exec");
        openChannel.setCommand("cat /var/log/maillog");
        openChannel.connect();
        InputStream in = openChannel.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            Thread.sleep(1000l);
        }
        br.close();
        openChannel.disconnect();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ChannelExec exec = (ChannelExec)session.openChannel("exec");
                    exec.setInputStream(null);
                    exec.setCommand("cat /var/log/messages");
                    exec.connect();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                        Thread.sleep(1000l);
                    }
//                    System.out.println("haha");
                    reader.close();
                    exec.disconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        t.join();
        session.disconnect();
    }
}

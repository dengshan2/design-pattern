package SSH;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by root on 9/30/15.
 * author: zd
 */
public class SSHHelper {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        String exec = exec("192.168.21.140", "root", "sqq123", 22, "tail /var/log/maillog");
        System.out.println(exec);
    }

    /**
     * 远程 执行命令并返回结果调用过程 是同步的 （执行完才会返回）
     * @param host      主机名
     * @param user      用户名
     * @param password  密码
     * @param port      端口
     * @param command   命令
     * @return string
     */
    public static String exec(String host, String user, String password, int port, String command) {
        StringBuilder result = new StringBuilder();
        Session session = null;
        ChannelExec openChannel = null;
        try {
            JSch jSch = new JSch();
            session = jSch.getSession(user, host, port);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.setPassword(password);
            session.connect(15000);
            session.setServerAliveInterval(12000);
            openChannel = (ChannelExec) session.openChannel("exec");
            openChannel.setCommand(command);
            openChannel.connect();
            InputStream in = openChannel.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String buf;
            while ((buf = br.readLine()) != null) {
                result.append(buf).append("\n");
            }
            ChannelExec exec = (ChannelExec)session.openChannel("exec");
            exec.setCommand("cat /var/log/messages");
            exec.setInputStream(null);
            exec.connect();
            BufferedReader br2 = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            String line;
            while ((line = br2.readLine()) != null) {
                System.out.println(line);
            }
            exec.disconnect();
            int exitStatus = openChannel.getExitStatus();
            System.out.println(exitStatus);
        } catch (Exception e) {
            if (e.getLocalizedMessage().contains("No route to host")) {
                System.out.println("主机无法连接");
                return null;
            }
            System.out.println(e.getLocalizedMessage());
            return null;
        } finally {
            if (openChannel != null && openChannel.isConnected()) {
                openChannel.disconnect();
            }
            if (session != null && session.isConnected()) {
                session.disconnect();
            }
        }
        return result.toString();

    }
}



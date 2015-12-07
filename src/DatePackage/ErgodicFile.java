package DatePackage;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.SCPClient;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 *      《八阵图》 作者：杜甫
 *      功盖三分国， 名成八阵图。
 *      江流石不转， 遣恨失吞吴。
 * Created by root on 11/13/15.
 * author: zd
 */
public class ErgodicFile {
    public static LogFileInfo destructString(String line) {
        LogFileInfo info = new LogFileInfo();
        String[] arr = line.split("\\s+");
        if (arr.length != 8) {
            return null;
        }
        info.setFileIndexNum(Integer.parseInt(arr[0].trim()));
        info.setFilename(arr[7].trim());
        info.setLastModificationTime(Long.parseLong(arr[6].trim()));
        return info;
    }

    public static void scpFile(String filePath) throws IOException {
        Connection con = new Connection("192.168.21.17", 22);
        con.connect();
        boolean isAuthed = con.authenticateWithPassword("root", "123dev");
        System.out.println(isAuthed);
        SCPClient scpClient = con.createSCPClient();
        scpClient.get(filePath, "./conf");
        con.close();
    }

    public static void main(String[] args) throws Exception {
        JSch jSch = new JSch();
        Session session = jSch.getSession("root", "192.168.21.17", 22);
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.setPassword("123dev");
        session.connect(15000);
        session.setServerAliveInterval(12000);
        ChannelExec exec = (ChannelExec)session.openChannel("exec");
        exec.setInputStream(null);
        exec.setCommand("ls -B -l -i --time-style=+'%s' /var/log/messages*");
        exec.connect();
        BufferedReader reader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        String line;
        Map<String, LogFileInfo> logFileInfoMap = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            LogFileInfo info = destructString(line);
            logFileInfoMap.put(info.getFilename(), info);
        }
        for (String fileName : logFileInfoMap.keySet()) {
            if (fileName.endsWith(".gz")) {
                scpFile(fileName);
            }
        }

        for (String fileName : logFileInfoMap.keySet()) {
            System.out.println(fileName);
        }
        exec.disconnect();
        session.disconnect();
    }
}

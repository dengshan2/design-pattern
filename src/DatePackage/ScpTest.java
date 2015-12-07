package DatePackage;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.SCPClient;

/**
 *      《弹琴》 作者：刘长卿
 *      泠泠七弦上， 静听松风寒。
 *      古调虽自爱， 今人多不弹。
 * Created by root on 11/13/15.
 * author: zd
 *  压缩文件传输过来
 */
public class ScpTest {
    public static void main(String[] args) throws Exception {
        Connection con = new Connection("192.168.21.17", 22);
        con.connect();
        boolean isAuthed = con.authenticateWithPassword("root", "123dev");
        System.out.println(isAuthed);
        SCPClient scpClient = con.createSCPClient();
        scpClient.get("/var/log/maillog-20150407.gz", "./conf");
        con.close();
    }

}

package SSH;

import java.net.InetAddress;

/**
 * Created by root on 10/30/15.
 */
public class Test6 {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost();
            String localName = ia.getHostName();
            String localIp = ia.getHostAddress();
            System.out.println("本机名称是： " + localName);
            System.out.println("本机IP是： " + localIp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package SSH;

import java.io.IOException;
import java.net.*;

/**
 * Created by root on 10/30/15.
 */
public class Reachable {
    private InetAddress remoteInetAaddress;
    private int port;
    private int timeout;

    public Reachable(InetAddress remoteInetAaddress, int port, int timeout) {
        this.remoteInetAaddress = remoteInetAaddress;
        this.port = port;
        this.timeout = timeout;
    }

    public static boolean isReachable(InetAddress localInetAddress, InetAddress remoteInetAddress, int port, int timeout) {
        boolean isReachable = false;
        Socket socket = null;
        try {
            socket = new Socket();
            SocketAddress localSocketAddress = new InetSocketAddress(localInetAddress, 0);
            socket.bind(localSocketAddress);
            InetSocketAddress endpointSocketAddress = new InetSocketAddress(remoteInetAddress, port);
            socket.connect(endpointSocketAddress, timeout);
            System.out.println("SUCCESS - connect established! local: " +
            localInetAddress.getHostAddress() + ", remote: " +
            remoteInetAddress.getHostAddress() + ", port: " + port);
            isReachable = true;
        } catch (IOException e) {
            System.out.println("FAILRE - can not connect! Local: " +
            localInetAddress.getHostAddress() + ", remote: " +
            remoteInetAddress.getHostAddress() + ", port: " + port);
        }finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println("Error occurred when closing socket...");
                }
            }
        }
        return isReachable;
    }

    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getByName("192.168.21.20");
        InetAddress remote = InetAddress.getByName("192.168.21.140");
        boolean isReachable = isReachable(local, remote, 22, 5000);
        System.out.println(isReachable);
    }
}

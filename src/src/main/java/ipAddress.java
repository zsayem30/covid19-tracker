import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipAddress {
    InetAddress ip;
    String hostname;

    {
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetDemo {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress inetAddress = InetAddress.getByName("Zyhaa");
        System.out.println(inetAddress);

        InetAddress inetAddress1 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress1);
    }
}

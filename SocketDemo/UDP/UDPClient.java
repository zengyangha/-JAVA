package SocketDemo.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        //创建udp的socket,
        DatagramSocket socket = new DatagramSocket(10086);
        System.out.println("输入你想给服务端的消息");
        //从控制台读取数据
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
//10088为远程端口
        //创建数据报包对象指定端口
        DatagramPacket datagramPacket=new DatagramPacket(str.getBytes(),str.getBytes().length, InetAddress.getByName("localhost"),10088);
        socket.send(datagramPacket);

        socket.close();
    }
}

package SocketDemo.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(10088);

        //
        byte[] buff = new byte[1024];
        //创建报包对象
        DatagramPacket datagramPacket = new DatagramPacket(buff, buff.length);
        //接受数据
        socket.receive(datagramPacket);
        //打印输出信息
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));

        //如果想响应客户端，那和TCP的一样

        socket.close();

    }
}

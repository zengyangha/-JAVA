package SocketDemo.client;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        //创建socket对象，开启实现io的虚拟接口（不同于java中的接口，而是类似于网线的插槽）
        //要指定数据接受方的ip地址和端口号
        Socket socket = new Socket("localhost", 10086);
        //获取输出流对象，准备向服务发送数据
        OutputStream outputStream = socket.getOutputStream();
        //将输出流对象进行包装
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        //传输数据
        dataOutputStream.writeUTF("hello!!!!!!!!!!");

        //接受服务端消息：
        InputStream inputStream = socket.getInputStream();

        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String str=dataInputStream.readUTF();

        System.out.println("接受到服务端的消息为："+str);

        //关闭相关操作：
        dataInputStream.close();
        inputStream.close();
        dataOutputStream.close();
        outputStream.close();
        socket.close();

    }
}

package SocketDemo.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //服务端要用serversocket来开放本地端口
        ServerSocket serverSocket = new ServerSocket(10086);
        //定义socket对象，来接受client传输过来的数据
        Socket socket = serverSocket.accept();
        //通过server获取输入流对象
        InputStream inputStream = socket.getInputStream();
        //对输入流进行包装
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        //读取对应数据
        String str = dataInputStream.readUTF();
        System.out.println("接收到客户端的消息为："+str);

        //给予客户端响应
        OutputStream outputStream = socket.getOutputStream();

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("hi!!!!!");


        //关闭相关操作
        dataOutputStream.close();
        dataInputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();


    }
}

package SocketDemo.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {

        //设置好服务端虚拟端口
        ServerSocket serverSocket = new ServerSocket(10000);
        //创建服务端
        Socket socket = serverSocket.accept();
//接受客户端的数据
        //获取输入流对象
        InputStream inputStream = socket.getInputStream();
        byte[] buff = new byte[1024];
        //这行代码从输入流 inputStream 中读取数据，并将读取的字节数保存在变量 length 中。同时，读取的数据被存储到 buff 数组中
        int length=inputStream.read(buff);
        // 这是一个字符串的构造方法，用于创建一个新的字符串对象。它接受三个参数：
        System.out.println("客户端传输的数据是："+new String(buff,0,length));

//传输给客户端数据：
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("这是服务端的数据".getBytes());

        //关闭相应操作
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}

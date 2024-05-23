package SocketDemo.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket socket = new Socket("127.0.0.1", 10000);
//向外输出
        //创建输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //数据输出
        outputStream.write("这是来自客户端的消息".getBytes());//不封装就得将字符串转换为字节数组

//接受服务器的数据
        //创建输入流对象
        InputStream inputStream = socket.getInputStream();
        //获取数据
        byte[] buff=new byte[1024];
        int length=inputStream.read(buff);
        System.out.println("接受服务器得数据为："+new String(buff,0,length));

        //关闭对应操作：
        inputStream.close();
        outputStream.close();
        socket.close();

    }
}

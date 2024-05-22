package SocketDemo.server;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PicServer {
    public static void main(String[] args) throws IOException {
        //开放端口
        ServerSocket serverSocket = new ServerSocket(2000);
        //创建Socket对象
        Socket socket = serverSocket.accept();
        //获取输入流对象
        InputStream inputStream = socket.getInputStream();
        //创建文件输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("fuuuha.jpg");
        int temp=0;
        while ((temp=inputStream.read())!=-1){
            fileOutputStream.write(temp);
        }

        //结束标志
        socket.shutdownInput();

        //上传图片结束后给客户端响应
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("这是服务端的消息,图片上传成功".getBytes());

        //结束标志
        socket.shutdownOutput();

        //关闭
        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}

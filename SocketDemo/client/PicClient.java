package SocketDemo.client;

import java.io.*;
import java.net.Socket;

public class PicClient {
    public static void main(String[] args) throws IOException {

        //创建图片的输入流对象
        FileInputStream fileInputStream = new FileInputStream("img.jpg");
        //创建Socket对象
        Socket socket = new Socket("localhost", 2000);
        //输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //输出图片
        int temp=0;
        while ((temp= fileInputStream.read())!=-1){//从文件输入流中读取一个字节，并返回一个 int 类型的值。
            outputStream.write(temp);//由于 read() 方法返回 int 类型，为了避免符号扩展的问题，将字节值提升为 int 类型
        }
        //结束标志
        socket.shutdownOutput();

        //接受服务端的响应
        InputStream inputStream = socket.getInputStream();
        byte[] buff = new byte[1024];
        int length=inputStream.read(buff);
        System.out.println(new String(buff,0,length));

        //结束标志
        socket.shutdownInput();

        //关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        fileInputStream.close();

    }
}

package SocketDemo.userLogin;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(10086);

        Socket socket = serverSocket.accept();
        //输入流对象
//        InputStream inputStream = socket.getInputStream();
        ////接受对象要objectOutputStream
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        User user = (User) objectInputStream.readObject();//反序列号

        String str = "";

        if ("fuuuha".equals(user.getUsername()) && "1234".equals(user.getPassword())) {
            str = "登录成功";
        } else {
            str = "登录失败";
        }
        //传输结束标志
        socket.shutdownInput();

        //给客户端响应：
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF(str);
        //传输结束标志
        socket.shutdownOutput();

        //关闭操作
        dataOutputStream.close();
        objectInputStream.close();
//        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}

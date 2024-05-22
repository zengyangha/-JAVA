package SocketDemo.userLogin;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 10086);

        OutputStream outputStream = socket.getOutputStream();

        //传输一个user对象
        User user = getUser();
        //传输对象要objectOutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);
        //传输结束标志
        socket.shutdownOutput();

        //接受服务端响应
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        String str = dataInputStream.readUTF();
        System.out.println(str);

        //关闭流
        dataInputStream.close();
        objectOutputStream.close();
        outputStream.close();
        socket.close();
    }

    public static User getUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入账户:");
        String userName = sc.nextLine();
        System.out.println("密码：");
        String userPassword=sc.nextLine();
        return new User(userName,userPassword);
    }

}

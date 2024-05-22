package SocketDemo.userLogin;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginThread implements Runnable {
    private Socket socket;

    public LoginThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            User user = (User) objectInputStream.readObject();
            String str = "";

            if ("fuuuha".equals(user.getUsername()) && "1234".equals(user.getPassword())) {
                str = "登录成功";
            } else {
                str = "登录失败";
            }
            //传输结束标志
            socket.shutdownInput();

            //响应客户端
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

            dataOutputStream.writeUTF(str);
            //传输结束标志
            socket.shutdownOutput();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                dataOutputStream.close();
                objectInputStream.close();
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}

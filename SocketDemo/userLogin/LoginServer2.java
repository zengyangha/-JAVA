package SocketDemo.userLogin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        while (true){
            Socket  socket= serverSocket.accept();
            LoginThread loginThread = new LoginThread(socket);

            new Thread(loginThread).start();
        }


    }
}

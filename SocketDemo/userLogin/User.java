package SocketDemo.userLogin;

import java.io.Serializable;

//Serializable,序列号接口
public class User implements Serializable {

    private static final long serialVersionUID = 4228268450042381850L;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public static void main(String[] args) {



    }
}

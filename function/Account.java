package function;

public class Account {

    private String str;

    public Account() {
        System.out.println("Account的无参构造");
    }

    public Account(String str) {
        this.str = str;
        System.out.println("str 参数构造"+str);
    }
}

package com.打印流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {

        InputStream poin=System.in;//System.in默认输入是键盘
        Scanner sc=new Scanner(poin);

        System.out.println("------------------");

        InputStream temp = new FileInputStream("writer.txt");
        Scanner sc1 = new Scanner(temp);
        String str=sc1.nextLine();
        System.out.println(str);


    }
}

package com.IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {


    //读入
    static public class Demo{
        public static void main(String[] args) {
            try {
                FileInputStream fis = new FileInputStream("abc.txt");
                int point;
                while ((point=fis.read())!=-1){
                    System.out.println((char) point);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //加入缓冲区
    static public class Demo2{
        public static void main(String[] args) {
            try {
                FileInputStream fis = new FileInputStream("abc.txt");
                int point;

                byte[] buffer = new byte[1024];
                while ((point=fis.read(buffer))!=-1){
                    System.out.println(new String(buffer,0,point));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



}

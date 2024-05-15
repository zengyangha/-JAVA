package com.IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopeFeil {
    //将abc中的数据复制到aaa中
    public static void main(String[] args) {

        //源数据文件
        File src = new File("abc.txt");

        //目的数据文件
        File dest = new File("aaa.txt");

        try{
            //创建对象
            FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(dest);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}

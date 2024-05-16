package com.IODemo;

import java.io.*;

public class CopyPic {
    public static void main(String[] args) {


        try {
            FileInputStream fileInputStream = new FileInputStream("1.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream("2.jpg");


            byte[] buffer = new byte[1024];
            while (fileInputStream.read(buffer) != -1) {
                fileOutputStream.write(buffer);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

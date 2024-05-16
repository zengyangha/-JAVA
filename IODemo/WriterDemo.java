package com.IODemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {


    static public class Demo {
        public static void main(String[] args) {

            File file = new File("writer.txt");

            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write("kskkdkakd.com");
                fileWriter.write("张三");
                fileWriter.write(" ");
                fileWriter.flush();

            } catch (IOException e) {
                throw new RuntimeException(e);
            } 


        }


    }


}

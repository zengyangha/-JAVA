package com.IODemo;

import java.io.*;

public class OutpuStreamWriterDemo {


    public static void main(String[] args) {
        File file = new File("abc.txt");
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream);

            outputStreamWriter.write(99);
            outputStreamWriter.write("lisi,and,zhangsan", 0, 10);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}

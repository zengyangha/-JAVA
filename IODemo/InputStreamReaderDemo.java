package com.IODemo;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        File file = new File("writer.txt");
        FileInputStream fileInputStream=null;
        InputStreamReader inputStreamReader=null;
        try {
             fileInputStream = new FileInputStream(file);
             inputStreamReader = new InputStreamReader(fileInputStream);

            char[] buffer = new char[20];
            int point=inputStreamReader.read(buffer);
            System.out.println(new String(buffer,0,point));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                inputStreamReader.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}

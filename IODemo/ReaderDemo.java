package com.IODemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {


    static public class Demo {
        public static void main(String[] args) {

            try {
                FileReader fileReader = new FileReader("abc.txt");
                int read = fileReader.read();
                System.out.println((char) read);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    static public class Demo2 {
        public static void main(String[] args) {

            try {
                FileReader fileReader = new FileReader("abc.txt");
                int read = 0;

                char[] buffer = new char[10];

                while ((read = fileReader.read(buffer)) != -1) {
                    //System.out.println((char) read);
                    System.out.println(new String(buffer,0,read));
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

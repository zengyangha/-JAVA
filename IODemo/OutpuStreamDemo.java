package com.IODemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutpuStreamDemo {

    static public class Demo{

        public static void main(String[] args) {

            File file = new File("abc.txt");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(99);
                fileOutputStream.write("\r\npppppppppppppppp".getBytes());


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }




    }


}

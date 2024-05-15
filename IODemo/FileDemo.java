package com.IODemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("aaa.txt");
        File file2 = new File("src/abc.txt");

        try {
            file.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        //判断文件属性,返回布尔值
        file.canExecute();
        file.canRead();
        file.canWrite();
        file.exists();

        //获取文件的名称

        System.out.println(file.getName());
        //获取文件的绝对路径,无论当前文件是否存在，只要给出具体的路径，都会返回相应的路径
        System.out.println(file.getAbsolutePath());
        //
        System.out.println(file2.getAbsoluteFile());

        //获取文件的父路径名称
        System.out.println(file2.getParent());
        //返回文件绝对路径的规范格式
        System.out.println(file2.getCanonicalPath());
        //返回操作系统的文件分割符
        System.out.println(File.separator);

        //判断目录
        System.out.println(file2.isDirectory());
        //判断文件
        System.out.println(file2.isFile());

        System.out.println("----------------");
        System.out.println();


        File file3 = new File("c:/");

        String[] list = file3.list();
        for (String str:list){
            System.out.println(str);
        }

        System.out.println("----------------");
        System.out.println();

        File[] files = file3.listFiles();
        for (File f:files){
            System.out.println(f);
        }

        //打印当前文件系统所有盘符
        File[] files1 = File.listRoots();
        for (File value : files1) {
            System.out.println(value);
        }



        //先给出具体路径
        File file4 = new File("c:/a/b/c");
        //创建单级目录
        file4.mkdir();
        //创建多级目录
        file4.mkdirs();

        System.out.println("----------------");
        System.out.println();

        System.out.println("遍历文件");
printFile(new File("C:\\dasan"));

    }


    //递归方法遍历文件
    public static void printFile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for(File f:files){
                printFile(f);
            }
        }else System.out.println(file.getAbsolutePath());
    }

}

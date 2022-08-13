package com.ljw4dakeai.jinjieban.chapter09.test01file.testpackage01;

import java.io.File;

/**
 * @author ZJH
 * @info
 * 文件对象的三种创建方式
 */
public class Test01TestFileConstructor {
    public static void main(String[] args) {
        //绝对路径创建(从盘符开始的路径)
        File newFileOne = new File("C:\\software\\code\\java\\JavaStudy\\JavaSe17\\src\\com\\ljw4dakeai\\jinjieban\\chapter09\\test01file\\testpackage01\\HelloWord.txt");
        File newFileTwo = new File("C:\\software\\code\\java\\JavaStudy\\JavaSe17\\src\\com\\ljw4dakeai\\jinjieban\\chapter09\\test01file\\testpackage01", "HelloWord.txt");
        File dir = new File("C:\\software\\code\\java\\JavaStudy\\JavaSe17\\src\\com\\ljw4dakeai\\jinjieban\\chapter09\\test01file\\testpackage01");
        File newFileThree = new File(dir, "HelloWord.txt");
        System.out.println(newFileOne);
        System.out.println(newFileThree);
        System.out.println(newFileTwo);


    }
}

package com.ljw4dakeai.jinjieban.chapter09.test01file.testpackage01;

import java.io.File;

/**
 * @author ZJH
 * @info file文件的写入
 * 文件路径
 * 绝对路径 : 从盘符开始, 盘符 : \\...\\...\文件名 (ctrl + shift + c)
 * 相对路径:从项目的根目录开始: 项目根目录省下不写
 */
public class Test02TestAbsAndRootPath {
    public static void main(String[] args) {
        //绝对路径创建(从盘符开始的路径)
        File newFileOne = new File("C:\\software\\code\\java\\JavaStudy\\JavaSe17\\src\\com\\ljw4dakeai\\jinjieban\\chapter09\\test01file\\testpackage01\\HelloWord.txt");
        System.out.println(newFileOne);
        //相对路径(项目根路径 : C:\software\code\java\JavaStudy)

        File newFileFour = new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test01file/testpackage01/HelloWord.txt");
        System.out.println(newFileFour);

        System.out.println(newFileFour.getAbsolutePath());
    }
}

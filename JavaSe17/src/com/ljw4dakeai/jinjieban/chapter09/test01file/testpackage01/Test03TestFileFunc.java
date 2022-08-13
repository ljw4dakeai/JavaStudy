package com.ljw4dakeai.jinjieban.chapter09.test01file.testpackage01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZJH
 * @info
 *文件的方法
 */
public class Test03TestFileFunc {
    public static void main(String[] args) {
        //准备一个file对象
        File file = new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test01file/testpackage01/HelloWord.txt");

        //判断一个文件是否是文件夹
        System.out.println(file.isDirectory());

        //判断一个文件是否是一个文件, 如果文件不存在也是false
        System.out.println(file.isFile());


        //判断文件是否存在
        System.out.println(file.exists());

        //获取对象的绝对路径
        File rootFile = new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test01file/testpackage01/HelloWord.txt");
        System.out.println(rootFile.getAbsoluteFile());

        //获取封装路径
        System.out.println(rootFile.getPath());

        //获取文件或者文件夹的名称
        System.out.println(rootFile.getName());

        //获取文件或者文件夹最后一次修订时间
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(rootFile.lastModified())));
    }
}

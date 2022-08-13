package com.ljw4dakeai.jinjieban.chapter09.test01file.testpackage01;

import java.io.File;
import java.io.IOException;

/**
 * @author ZJH
 */
public class Test04TestFileCreateDel {
    public static void main(String[] args) throws IOException {
        //准备一个file对象,关联一个文件路径
        File fileOne = new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test01file/testpackage01/create.txt");
        //createNewFile() 存在就返回false ,不存在就创建并且返回True
        System.out.println(fileOne.createNewFile());

        //创建多级目录
        File fileTwo = new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test01file/testpackage01/aaa/bbb/ccc");
        System.out.println(fileTwo.mkdirs());


        //删除空目录 最后一个目录
        System.out.println(fileTwo.delete());


    }
}

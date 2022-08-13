package com.ljw4dakeai.jinjieban.chapter10.test06commons.testpackage01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author ZJH
 */
public class Test01TestCommons {
    public static void main(String[] args) throws IOException {

        //读取文件内容
        System.out.println(FileUtils.readFileToString(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test06commons/GBK.txt"), "GBK"));

        //复制文件
        FileUtils.copyFile(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test06commons/utf-8.txt"), new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test06commons/GBK.txt"));



    }
}

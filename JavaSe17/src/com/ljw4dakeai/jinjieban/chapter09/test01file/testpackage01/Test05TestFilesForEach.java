package com.ljw4dakeai.jinjieban.chapter09.test01file.testpackage01;

import java.io.File;

/**
 * @author ZJH
 * @info
 * listFiles() 获取文件的下一级,文件夹,文件夹对象
 *          文件是不能遍历的否则会得到一个null
 *          无法访问的文件夹访问也会得到一个null
 */
public class Test05TestFilesForEach {
    public static void main(String[] args) {
        File f = new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test01file/testpackage01/aaa/bbb");
        File[] files = f.listFiles();

        System.out.println(files.length);
        for (File file : files) {
            System.out.println(file);
        }

    }
}

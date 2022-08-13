package com.ljw4dakeai.jinjieban.chapter10.HomeWorkCode;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author ZJH
 * @info
 *使用FileUtils工具类，完成文件复制、文件夹复制、获取文件夹大小(sizeOf方法)、删除文件夹（deleteDirectory方法）操作
 */
public class WorkEight {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkMD/FileUtilsTest/copyFile.txt"),
                new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkMD/FileUtilsTest/toFile.txt"));


        FileUtils.copyDirectory(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkMD/FileUtilsTest/CopyDir"),
                new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkMD/FileUtilsTest/toDIr"));


        System.out.println(FileUtils.sizeOf(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkMD/FileUtilsTest/CopyDir")));


        FileUtils.deleteDirectory(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkMD/FileUtilsTest/deleteDir"));
    }
}

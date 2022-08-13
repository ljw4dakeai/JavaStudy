package com.ljw4dakeai.jinjieban.chapter10.HomeWorkMD.homework;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test8 {
    public static void main(String[] args) throws IOException {
        //读取文件中的内容
        File file = new File("day10_io_properties\\a.txt");
        String str = FileUtils.readFileToString(file, "GBK");
        System.out.println(str);

        //复制文件
        File src = new File("day10_io_properties\\a.txt");
        File dest = new File("day10_io_properties\\b.txt");
        FileUtils.copyFile(src,dest);

        //复制文件夹
        File srcDir = new File("day10_io_properties");
        File destDir = new File("C:\\Users\\WANGQI\\Desktop");
        FileUtils.copyDirectoryToDirectory(srcDir,destDir);

        //获取文件夹大小
        long size = FileUtils.sizeOf(srcDir);
        System.out.println(srcDir+"大小："+size);

        //删除文件夹(前提是你有这个文件夹才能删除)
        File dir = new File("day10_io_properties\\hello");
        FileUtils.deleteDirectory(dir);
    }
}
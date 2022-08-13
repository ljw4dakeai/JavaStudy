package com.ljw4dakeai.jinjieban.chapter10.HomeWorkMD.homework;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:\\5-上课记录\\JavaSE进阶");

        File[] files = dir.listFiles();
        File destDir = new File("C:\\Users\\WANGQI\\Desktop\\JavaSE进阶作业");
        int num = 1;
        for (File file : files) {
            if(file.isDirectory()){
                if(file.getName().equals("作业")){
                    File dest = new File(destDir,"day0"+(num++)+file.getName());
                    dest.mkdirs();
                    FileUtils.copyDirectoryToDirectory(file,dest);
                }
            }
        }
    }
}

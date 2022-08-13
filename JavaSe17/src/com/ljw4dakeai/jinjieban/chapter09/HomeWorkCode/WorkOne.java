package com.ljw4dakeai.jinjieban.chapter09.HomeWorkCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author ZJH
 * @info
 *使用FileInputStream和FileOutputStream，一次读、写一个字节数组，完成复制文件的操作。
 */
public class WorkOne {
    public static void oneByteCopy(File copyFile, File toFile){
        try(
                FileInputStream fileInputStream = new FileInputStream(copyFile);
                FileOutputStream fileOutputStream = new FileOutputStream(toFile)
        ){
            int b ;
            while((b = fileInputStream.read()) != -1){
                fileOutputStream.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

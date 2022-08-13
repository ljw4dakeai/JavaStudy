package com.ljw4dakeai.jinjieban.chapter09.HomeWorkCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author ZJH
 * @info
 * 使用FileInputStream和FileOutputStream，一次读取、写入所有字节，完成复制文件的操作。
 * (ps: JDK8版本没有读取所有字节的方法，免做)
 */
public class WorkThree {
    public static void allByteCopy(File copyFile, File toFile) {
        try (
                final FileInputStream fileInputStream = new FileInputStream(copyFile);
                final FileOutputStream fileOutputStream = new FileOutputStream(toFile)
        ){
            fileOutputStream.write(fileInputStream.readAllBytes());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

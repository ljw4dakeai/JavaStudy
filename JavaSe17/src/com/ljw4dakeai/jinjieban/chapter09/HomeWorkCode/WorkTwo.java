package com.ljw4dakeai.jinjieban.chapter09.HomeWorkCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ZJH
 * @info 使用FileInputStream和FileOutputStream，一次读、写一个字节数组，完成复制文件的操作。
 */
public class WorkTwo {
    public static void manyByteCopy(File copyFile, File toFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(copyFile);
        FileOutputStream fileOutputStream = new FileOutputStream(toFile);
        int len;
        final byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}

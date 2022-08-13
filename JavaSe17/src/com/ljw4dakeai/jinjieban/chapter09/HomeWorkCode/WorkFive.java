package com.ljw4dakeai.jinjieban.chapter09.HomeWorkCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author ZJH
 */
public class WorkFive {
    public static void copyFile(File copyFile, File toFile) {
        try (
                final FileInputStream fileInputStream = new FileInputStream(copyFile);
                final FileOutputStream fileOutputStream = new FileOutputStream(toFile)
        ) {
            int len;
            final byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

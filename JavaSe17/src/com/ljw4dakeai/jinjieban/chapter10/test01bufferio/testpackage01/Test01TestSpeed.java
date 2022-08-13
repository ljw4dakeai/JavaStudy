package com.ljw4dakeai.jinjieban.chapter10.test01bufferio.testpackage01;

import java.io.*;

/**
 * @author ZJH
 */
public class Test01TestSpeed {
    public static void main(String[] args) throws IOException {
        //速度测试
        File copyFile = new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test01bufferio/testSpeedCopyFile.png");
        File toFile = new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test01bufferio/testSpeedToFile.png");
        long startTime = System.currentTimeMillis();
//        //速度54663ms
//        oneAndNoBuffer(copyFile, toFile);
//        //59933ms
//        manyAndNoBuffer(copyFile, toFile);
//        //317
//        oneAndBuffer(copyFile, toFile);
//        //2592
//        manyAndBuffer(copyFile, toFile);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }

    public static void oneAndNoBuffer(File copyFile, File toFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(copyFile);
        FileOutputStream fileOutputStream = new FileOutputStream(toFile);
        int ints;
        while ((ints = fileInputStream.read()) != -1) {
            fileOutputStream.write(ints);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void manyAndNoBuffer(File copyFile, File toFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(copyFile);
        FileOutputStream fileOutputStream = new FileOutputStream(toFile);
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read()) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void oneAndBuffer(File copyFile, File toFile) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(copyFile));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(toFile));
        int ints;
        while ((ints = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(ints);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    public static void manyAndBuffer(File copyFile, File toFile) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(copyFile));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(toFile));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}

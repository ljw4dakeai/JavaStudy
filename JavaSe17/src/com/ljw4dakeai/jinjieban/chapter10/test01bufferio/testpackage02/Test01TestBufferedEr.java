package com.ljw4dakeai.jinjieban.chapter10.test01bufferio.testpackage02;

import java.io.*;

/**
 * @author ZJH
 * @info buffer读取一行, 没办法读取到换行符号
 * newLine () 方法支持跨平台
 */
public class Test01TestBufferedEr {
    public static void main(String[] args) throws IOException {
        copyFileWithReadLine(
                new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test01bufferio/io.txt"),
                new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test01bufferio/copyio.txt"));

    }

    public static void copyFile(File copyFile, File toFile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(copyFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFile));

        int len;
        char[] chars = new char[1024];
        while ((len = bufferedReader.read(chars)) != -1) {
            bufferedWriter.write(chars, 0, len);
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static void copyFileWithReadLine(File copyFile, File toFile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(copyFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFile));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }


}

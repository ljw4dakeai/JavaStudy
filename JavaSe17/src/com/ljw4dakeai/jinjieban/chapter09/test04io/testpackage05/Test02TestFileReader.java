package com.ljw4dakeai.jinjieban.chapter09.test04io.testpackage05;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author ZJH
 * @info 字符流 一次写多个字符
 */
public class Test02TestFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test04io/copyio.txt");
        int len;
        char[] chars = new char[1024];
        while ((len = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }

        fileReader.close();
    }
}

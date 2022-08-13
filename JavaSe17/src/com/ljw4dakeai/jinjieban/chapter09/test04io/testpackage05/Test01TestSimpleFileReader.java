package com.ljw4dakeai.jinjieban.chapter09.test04io.testpackage05;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author ZJH
 * @info 字符流读取
 */
public class Test01TestSimpleFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test04io/copyio.txt");
        System.out.println(fileReader.read());
        System.out.println((char) fileReader.read());

        int ints;
        while ((ints = fileReader.read()) != -1) {
            System.out.println((char)ints);
        }

        fileReader.close();
    }
}

package com.ljw4dakeai.jinjieban.chapter09.test04io.testpackage06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ZJH
 * @info 字符流复制文件
 *注意  : 使用字符流只能复制文本文件, 不能复制其他文件(图片, 视屏, 音乐....)
 */
public class Test02FileCopy {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test04io/io.txt");
        FileWriter fileWriter = new FileWriter("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test04io/copyio.txt");
        int len;
        char[] chars = new char[1024];

        while ((len = fileReader.read(chars)) != -1) {
            fileWriter.write(chars, 0, len);
        }

        fileWriter.flush();
        fileReader.close();
        fileWriter.close();
    }
}

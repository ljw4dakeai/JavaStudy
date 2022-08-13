package com.ljw4dakeai.jinjieban.chapter09.test04io.testpackage06;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ZJH
 * @info 简单的字符输出流写文件
 */
public class Test01TestSimpleWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test04io/io.txt");
        //写入一个字符串
        fileWriter.write("hello word!");
        //写入一个整数
        fileWriter.write(97);
        //写入一个字符
        fileWriter.write('a');

        //写入一个字符数组中的全部
        char[] chars = {'0', 'h', '你', '好', '呀'};
        fileWriter.write(chars);
        fileWriter.write(chars, 0, 2);
        //不关闭流 write方法不会写入文件中,
        // fileWrite调用write方法时, 不会直接写入文件,因为在内存中有缓存
        //关闭流的时候会先刷新, 再关闭流
        fileWriter.flush();
        fileWriter.close();
    }
}

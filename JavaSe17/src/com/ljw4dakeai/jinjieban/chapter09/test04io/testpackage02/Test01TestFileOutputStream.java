package com.ljw4dakeai.jinjieban.chapter09.test04io.testpackage02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author ZJH
 * 创建FileOutPutStream 流的时候, 第二个参数如果不写就是覆盖
 * 如果文件不存在就会创建文件, 但是如果文件夹不存在就会报错, 不会创建文件夹
 */
public class Test01TestFileOutputStream {
    public static void main(String[] args) throws IOException {
        //创建一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/io.txt");

        //一次写入一个字节
        fileOutputStream.write(97);
        fileOutputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.write(98);
        fileOutputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.write(99);
        fileOutputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));

        //一次写入多个字节
        fileOutputStream.write(new byte[]{97, 98, 99});
        fileOutputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));

        //一次写入多个字节中的一部分
        fileOutputStream.write(new byte[]{97, 98, 99}, 0, 2);
        fileOutputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));

        //一次写入一行字符串
        fileOutputStream.write("hello word".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.write("你好 世界".getBytes(StandardCharsets.UTF_8));

        fileOutputStream.close();
    }
}

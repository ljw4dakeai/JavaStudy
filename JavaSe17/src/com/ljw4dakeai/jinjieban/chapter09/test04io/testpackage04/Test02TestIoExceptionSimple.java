package com.ljw4dakeai.jinjieban.chapter09.test04io.testpackage04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ZJH
 * @info
 * 不管有没有异常，  流都会自动释放
 */
public class Test02TestIoExceptionSimple {
    public static void main(String[] args) {
        try (
                FileInputStream fileInputStream = new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/io.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/copyio.txt");
        ) {
            //创建中间数组
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


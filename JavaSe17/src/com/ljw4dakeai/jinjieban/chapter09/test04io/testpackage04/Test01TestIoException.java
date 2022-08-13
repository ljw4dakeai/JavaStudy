package com.ljw4dakeai.jinjieban.chapter09.test04io.testpackage04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ZJH
 */
public class Test01TestIoException {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //创建两个流的对象
            fileInputStream = new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/io.txt");
            fileOutputStream = new FileOutputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/copyio.txt");

            //创建中间数组
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            //关闭流
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //不管异常是否产生 finally都会执行
            try {
                assert fileInputStream != null;
                fileInputStream.close();
                assert fileOutputStream != null;
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

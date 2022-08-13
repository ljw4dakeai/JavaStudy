package com.ljw4dakeai.jinjieban.chapter09.test04io.testpackage03;

import java.io.*;

/**
 * @author ZJH
 * @info 文件的拷贝
 * fileInputStream有两个不同的read()方法
 * read() 读取一个字节,返回字节对应的编码值, 例如读取一个'a' 返回值为97
 * read(bytes) 读取一个字节数组, 返回字节数字有用的个数!
 */
public class Test01TestFileCopy {
    public static void main(String[] args) throws IOException {
        //创建两个流的对象
//        FileInputStream fileInputStream = new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/io.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/copyio.txt");
        //复制图片
        FileInputStream fileInputStream = new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test02recoursion/testpackage02/searchFile/美女照片文件夹/凝光美足.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/copypicture.jpg");

        //创建中间数组
        byte[] bytes = new byte[1024];
        int len;
        while((len = fileInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes, 0, len);
        }

        //关闭流
        fileInputStream.close();
        fileOutputStream.close();
    }
}

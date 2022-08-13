package com.ljw4dakeai.jinjieban.chapter10.HomeWorkMD.homework;

import java.io.*;

public class Test7 {
    public static void main(String[] args) throws IOException {
        //指定编码GBK读取a.txt文件（前提是a.txt的编码本身是GBK格式）
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_io_properties\\a.txt"),"UTF-8");
        BufferedReader br = new BufferedReader(isr);

        //指定编码UTf-8写入b.txt文件（b.txt文件idea会自动创建，自动创建的默认就是utf-8格式）
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_io_properties\\b.txt"),"GBK");
        BufferedWriter bw = new BufferedWriter(osw);

        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}

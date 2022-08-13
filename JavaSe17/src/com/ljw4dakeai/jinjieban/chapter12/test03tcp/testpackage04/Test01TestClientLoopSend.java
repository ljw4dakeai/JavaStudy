package com.ljw4dakeai.jinjieban.chapter12.test03tcp.testpackage04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;


/**
 * @author ZJH
 */
public class Test01TestClientLoopSend {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动 : ");
        //创建客户端对象
        Socket client = new Socket("localhost", 10086);

        //获取输出流对象
        OutputStream outputStream = client.getOutputStream();

        ///封装输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        //循环发出数据
        while (true) {
            System.out.println("请输入你要发出的数据 : ");
            String sendMsg = new Scanner(System.in).nextLine();
            bufferedWriter.write(sendMsg);
            //写入换行
            bufferedWriter.newLine();
            //刷新数据
            bufferedWriter.flush();

            if ("exit".equalsIgnoreCase(sendMsg)){
                break;
            }
        }

        client.shutdownOutput();
        client.close();


    }
}

package com.ljw4dakeai.jinjieban.chapter12.test03tcp.testpackage03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ZJH
 */
public class Test02TestServerLoopReceive {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 : ");
        //服务端对象
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket server = serverSocket.accept();

        //获取输入流
        InputStream inputStream = server.getInputStream();

        //封装输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));


        //读取数据
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        //关闭对象
        server.close();
        serverSocket.close();


    }
}

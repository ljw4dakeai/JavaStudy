package com.ljw4dakeai.jinjieban.chapter12.test03tcp.testpackage04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ZJH
 * @info 多线程实现多
 */
public class Test02TestServerManyReceive {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 : ");
        //服务端对象
        ServerSocket serverSocket = new ServerSocket(10086);
        while (true) {
            Socket server = serverSocket.accept();
            new Thread(new Task(server)).start();
        }

    }
}

package com.ljw4dakeai.jinjieban.chapter12.test03tcp.testpackage01;

import ch.qos.logback.classic.net.server.ServerSocketReceiver;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

/**
 * @author ZJH
 */
public class Test02TestServerSocketReceive {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10010);
        //获取输入流
        InputStream inputStream = serverSocket.accept().getInputStream();

        byte[] bytes = new byte[1024];
        int len;
        while((len = inputStream.read(bytes)) != -1){
            System.out.println( "我接受的数据是 : " + new String(bytes, 0 , len));
        }

        inputStream.close();
        serverSocket.close();
    }
}

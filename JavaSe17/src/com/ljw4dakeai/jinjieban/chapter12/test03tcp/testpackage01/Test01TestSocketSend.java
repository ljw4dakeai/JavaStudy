package com.ljw4dakeai.jinjieban.chapter12.test03tcp.testpackage01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author ZJH
 * 步骤
 * 1 : 创建客户端socket对象
 * 2 : 获取输出流写入数据
 * 3 : 关闭客户端, 释放资源
 */

public class Test01TestSocketSend {
    public static void main(String[] args) throws IOException {
        //面向有链接的 , 不能直接运行客户端
        Socket socket = new Socket(InetAddress.getByName("xiaomipro156"), 10010);
        OutputStream outputStream = socket.getOutputStream();

        System.out.println("我发送的数据是 : ");
        outputStream.write("你好呀, 我来啦!".getBytes());



        socket.close();
        outputStream.close();

    }
}

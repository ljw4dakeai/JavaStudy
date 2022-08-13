package com.ljw4dakeai.jinjieban.chapter12.test03tcp.testpackage02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author ZJH
 * @info 客户端发送反馈并且接受服务端信息返回
 */
public class Test01TestClientSendAndReceive {
    public static void main(String[] args) throws IOException {
//
//        Socket client = new Socket(InetAddress.getByName("xiaomipro156"), 8888);
//
//        OutputStream outputStream = client.getOutputStream();
//        String sendMsg = "我发送反馈啦";
//        byte[] bytesSend = sendMsg.getBytes();
//        System.out.println("客户端发送的数据是 : " + sendMsg);
//        outputStream.write(bytesSend);
//
//        //结束发送
//        client.shutdownOutput();
//
//
//        //获取服务器返回数据
//        InputStream inputStream = client.getInputStream();
//
//        int len;
//        byte[] bytes = new byte[1024];
//        while ((len = inputStream.read(bytes)) != -1) {
//            System.out.println("客户端接受到的数据是 : " + new String(bytes, 0, len));
//        }
//
//
//        client.close();

        //创建客户端
        Socket client = new Socket(InetAddress.getByName("127.0.0.1"), 10086);

        //客户端发送数据
        OutputStream outputStream = client.getOutputStream();
        String sendMsg = "我是客户端, 我发送反馈啦";
        System.out.println("客户端发送的数据是 : " + sendMsg);
        outputStream.write(sendMsg.getBytes());

        //客户端挺尸发送数据
        client.shutdownOutput();


        //客户端接受服务端发返回的数据
        InputStream inputStream = client.getInputStream();
        int len;
        byte[] bytes = new byte[1024];
        while((len = inputStream.read(bytes)) != -1){
            System.out.println("客户端收的的数据是 : " + new String(bytes, 0, len));
        }

        client.close();
    }
}

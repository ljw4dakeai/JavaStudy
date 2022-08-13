package com.ljw4dakeai.jinjieban.chapter12.test03tcp.testpackage02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ZJH
 * @info 客户端接受反馈并且返回消息给客户端
 */
public class Test02TestServerReceiveAndSend {
    public static void main(String[] args) throws IOException {
//        //服务端接受返回
//        ServerSocket server = new ServerSocket(8888);
//        Socket accept = server.accept();
//        InputStream inputStream = accept.getInputStream();
//
//        int len;
//        byte[] bytes = new byte[1024];
//        while ((len = inputStream.read(bytes)) != -1) {
//            System.out.println("服务端接受的数据是 : " + new String(bytes, 0, len));
//        }
//
//
//        OutputStream outputStream = accept.getOutputStream();
//        String returnMsg = "我收到你的反馈啦";
//        System.out.println("服务端返回的数据是" + returnMsg);
//        outputStream.write(returnMsg.getBytes());
//
//
//        accept.shutdownOutput();
//        server.close();

//        创建一个服务端
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket server = serverSocket.accept();


        ///服务器届接受数据
        InputStream inputStream = server.getInputStream();
        int len;
        byte[] bytes = new byte[1024];
        while((len = inputStream.read(bytes)) != -1){
            System.out.println("服务端收到的数据是 : " + new String(bytes, 0, len));
        }

        //服务器发送数据
        OutputStream outputStream = server.getOutputStream();
        String returnMsg = "我是服务端"+"我看到你的反馈啦";
        System.out.println("服务端返回的数据是 : " + returnMsg);
        outputStream.write(returnMsg.getBytes(), 0, returnMsg.getBytes().length);

        server.shutdownOutput();

        server.close();
        serverSocket.close();
    }

}

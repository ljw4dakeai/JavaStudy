package com.ljw4dakeai.jinjieban.chapter12.test02udp.testpackage01;

import java.io.IOException;
import java.net.*;

/**
 * @author ZJH
 */
public class Test02TestDatagramSocketSend {
    public static void main(String[] args) throws IOException {
//        System.out.println("客户端启动!\n发送的数据是 : ");
//
//        //创建socket发送对象
//        DatagramSocket datagramSocket = new DatagramSocket();
//        //创建数据,并且打包数据
//        String data = "Hello Word";
//        System.out.println(data);
//        byte[] bytes = data.getBytes();
//        DatagramPacket dataPackage = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("xiaomipro156"), 10086);
//        //datagramSocket对象发送数据
//        datagramSocket.send(dataPackage);
//        //关闭datagramSocket关闭
//        datagramSocket.close();

        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] bytes = "傻狗".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(
                bytes,
                0,
                bytes.length,
                InetAddress.getByName("192.168.66.111"),
                10086
        );

        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}

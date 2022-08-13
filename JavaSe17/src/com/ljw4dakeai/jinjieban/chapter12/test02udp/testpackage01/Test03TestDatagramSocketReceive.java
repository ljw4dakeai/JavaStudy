package com.ljw4dakeai.jinjieban.chapter12.test02udp.testpackage01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author ZJH
 */
public class Test03TestDatagramSocketReceive {
    public static void main(String[] args) throws IOException {
//        System.out.println("接受端启动!\n接受的数据是 : ");
//
//        //创建socket发送对象
//        DatagramSocket datagramSocket = new DatagramSocket(10086);
//        //创建数据,创建数据包接受数据(数据缓冲区)
//        byte[] bytes = new byte[1024];
//        DatagramPacket dataPackage = new DatagramPacket(bytes, 0, bytes.length);
//        //datagramSocket对象接受数据
//        datagramSocket.receive(dataPackage);
//        //将接受的数据显示在控制台上
//        byte[] data = dataPackage.getData();
//        //getDate()拿到的数据的缓冲区, getLength()拿到的是长度
//        System.out.println("接受的到数据是" + new String(data, 0, dataPackage.getLength()));
//        //关闭datagramSocket关闭
//        datagramSocket.close();

        DatagramSocket datagramSocket = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);

        datagramSocket.receive(datagramPacket);
        System.out.println(datagramPacket.getSocketAddress() + "发来了 : " + new String(datagramPacket.getData()));

        datagramSocket.close();
    }

}

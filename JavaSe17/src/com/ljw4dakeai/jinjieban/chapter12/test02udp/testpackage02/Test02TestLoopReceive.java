package com.ljw4dakeai.jinjieban.chapter12.test02udp.testpackage02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author ZJH
 */
public class Test02TestLoopReceive {
    public static void main(String[] args) throws IOException {
        //不知道什么时候结束, 古采用死循环
        DatagramSocket datagramSocket = new DatagramSocket(10010);
        while (true) {
            System.out.println("接受的数据为 : ");

            //缓冲区数组
            byte[] bytes = new byte[1024];

            DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);

            datagramSocket.receive(datagramPacket);

            String getData = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println("我们收到的数据是 : " + getData);
        }

    }
}

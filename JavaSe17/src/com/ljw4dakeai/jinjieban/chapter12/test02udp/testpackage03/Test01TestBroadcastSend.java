package com.ljw4dakeai.jinjieban.chapter12.test02udp.testpackage03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author ZJH
 * @info 广播
 */
public class Test01TestBroadcastSend {

    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        System.out.println("开始发送数据, 直到发送886结束发送!");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            DatagramPacket datagramPacket = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("255.255.255.255"), 10010);
            datagramSocket.send(datagramPacket);
            if ("886".equals(line)) {
                break;
            }
        }

        datagramSocket.close();

    }
}


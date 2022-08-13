package com.ljw4dakeai.jinjieban.chapter12.test03tcp.testpackage05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author ZJH
 */
public class Task implements Runnable {
    private final Socket server;

    public Task(Socket server) {
        this.server = server;
    }

    @Override
    public void run() {
        try {
            //获取输入流
            InputStream inputStream = server.getInputStream();
            //封装输入流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            //读取数据
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(server.getRemoteSocketAddress() + "发送了 : "+line);
                if("exit".equalsIgnoreCase(line)){
                    System.out.println(server.getRemoteSocketAddress() + "正常下线!");
                    server.close();
                }
            }
        } catch (IOException e) {
            System.out.println(server.getRemoteSocketAddress() + "异常下线!");
            try {
                server.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}

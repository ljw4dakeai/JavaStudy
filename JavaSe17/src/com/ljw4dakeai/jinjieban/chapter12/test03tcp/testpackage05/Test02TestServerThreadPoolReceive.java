package com.ljw4dakeai.jinjieban.chapter12.test03tcp.testpackage05;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ZJH
 * @info 多线程实现多
 */
public class Test02TestServerThreadPoolReceive {
    private static final ThreadPoolExecutor THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(
            3,
             5,
            5,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(10),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy()
    );

    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 : ");
        //服务端对象
        ServerSocket serverSocket = new ServerSocket(10086);
        while (true) {
            Socket server = serverSocket.accept();
            THREAD_POOL_EXECUTOR.submit(new Task(server));
        }

    }
}

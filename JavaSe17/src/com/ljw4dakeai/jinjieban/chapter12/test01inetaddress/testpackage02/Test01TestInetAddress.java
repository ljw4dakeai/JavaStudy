package com.ljw4dakeai.jinjieban.chapter12.test01inetaddress.testpackage02;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ZJH
 * InetAddress 没有构造方法
 * 但是有单例设计模式, 通过静态方法获取IP地址
 */
public class Test01TestInetAddress {
    public static void main(String[] args) throws IOException {
        //获取本机地址对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        System.out.println("本机IP地址" + localHost.getHostName());
        System.out.println("本机主机名 " + localHost.getHostName());

        //确定主机名字的IP地址, 主机名可以是机器名, 也可以是ip地址

        InetAddress inetAddress = InetAddress.getByName("xiaomipro156");
        System.out.println(inetAddress);

        //获取主机名字getHostName()
        System.out.println(inetAddress.getHostName());

        //获取主机IP地址
        System.out.println(inetAddress.getHostAddress());


        //获取别人的IP地址对象
        InetAddress baidu = InetAddress.getByName("182.61.200.6");
        boolean reachable = baidu.isReachable(5000);
        System.out.println(reachable);
    }
}

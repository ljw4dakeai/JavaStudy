package com.ljw4dakeai.JiChuBan.Chapter10;

import java.util.Scanner;

/**
 * @author ZJH
 * @info scanner API文档使用
 */
public class Test01Scanner {


    public static void main(String[] args) {
        //创建对象,
        Scanner scanner = new Scanner(System.in);
        // 调用方法
        int i = scanner.nextInt();

        //接受不全, 空格后面的都丢失了
        String next = scanner.next();
        //管的太多了, 把内存的数据接受了
        String s = scanner.nextLine();




    }
}

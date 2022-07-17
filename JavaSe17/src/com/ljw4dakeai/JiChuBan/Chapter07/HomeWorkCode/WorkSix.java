package com.ljw4dakeai.JiChuBan.Chapter07.HomeWorkCode;

import java.util.Scanner;


/**
 * @author ZJH
 */
public class WorkSix {
    public static void main(String[] args) {
        while (true) {
            System.out.println("欢迎来到xxx管理系统");
            System.out.println("输入1 新增xx");
            System.out.println("输入2 删除xx");
            System.out.println("输入3 修改xx");
            System.out.println("输入4 查看xx");
            System.out.println("输入5 退出再见");
            System.out.println("=======================================================");
            System.out.println("请输入一个数");
            int i = new Scanner(System.in).nextInt();
            switch (i) {
                case 1 -> add();
                case 2 -> del();
                case 3 -> update();
                case 4 -> find();
                case 5 -> {
                    exit();
                    System.exit(1);
                }
                default -> System.out.println("输入错误");
            }
        }
    }

    public static void add() {
        System.out.println("增加!");
    }

    public static void del() {
        System.out.println("删除!");
    }

    public static void update() {
        System.out.println("修改!");
    }

    public static void find() {
        System.out.println("查询!");
    }

    public static void exit() {
        System.out.println("退出");
    }
}

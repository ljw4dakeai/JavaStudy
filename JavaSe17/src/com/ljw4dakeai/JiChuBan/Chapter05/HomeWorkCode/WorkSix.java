package com.ljw4dakeai.JiChuBan.Chapter05.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkSix {
    public static void main(String[] args) {
        while (true){
            System.out.println("输入1 新增xx");
            System.out.println("输入2 删除xx");
            System.out.println("输入3 修改xx");
            System.out.println("输入4 查看xx");
            System.out.println("输入5 退出再见");
            System.out.println("=======================================================");
            System.out.println("请输入一个数");
            int num = new Scanner(System.in).nextInt();
            switch (num){
                case 1 -> System.out.println("新增");
                case 2 -> System.out.println("删除");
                case 3 -> System.out.println("修改");
                case 4 -> System.out.println("查看");
                case 5 -> {
                    System.out.println("再见!");
                    System.exit(1);
                }
                default -> System.out.println("请输入正确的数字!");
            }
        }

    }
}

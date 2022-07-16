package com.ljw4dakeai.Chapter05.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkOne {
    public static void main(String[] args) {
        while (true) {
            System.out.println("输入1 新增xx");
            System.out.println("输入2 删除xx");
            System.out.println("输入3 修改xx");
            System.out.println("输入4 查看xx");
            System.out.println("输入5 退出再见");
            System.out.println("=======================================================");
            System.out.println("请输入一个数");
            int num = new Scanner(System.in).nextInt();
            switch (num) {
                case 1:
                    System.out.println("新增");
                    break;
                case 2:
                    System.out.println("删除");
                    break;
                case 3:
                    System.out.println("修改");
                    break;
                case 4:
                    System.out.println("查看");
                    break;
                case 5:
                    System.out.println("退出,再见");
                    System.exit(1);
                default:
                    System.out.println("请输入正确数字");
            }

        }
    }
}

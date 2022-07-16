package com.ljw4dakeai.Pritice713;

import java.util.Scanner;

/**
 * @author ZJH
 * 请按如下要求编写程序,打印菜单:
 * 		1.从键盘上录入一个1到5的数字;
 * 		2.当数字为1时打印菜单"新建";
 * 		当数字为2时打印菜单"打开文件";
 * 		当数字为3时打印菜单"保存";
 * 		当数字为4时打印菜单"刷新";
 * 		当数字为5时打印菜单"退出",并退出程序;
 * 		此行代码可以终止java程序运行: System.exit(0);
 */
public class WorkThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入1到5的数字");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> System.out.println("新建");
                case 2 -> System.out.println("删除");
                case 3 -> System.out.println("修改");
                case 4 -> System.out.println("查看");
                case 5 -> {
                    System.out.println("退出");
                    System.exit(1);
                }
                default -> System.out.println("情重新输入!");
            }
        }

    }
}

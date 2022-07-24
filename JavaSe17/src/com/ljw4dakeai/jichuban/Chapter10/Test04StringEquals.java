package com.ljw4dakeai.jichuban.Chapter10;

import java.util.Scanner;

/**
 * @author ZJH
 * 登录系统简单实现
 */
public class Test04StringEquals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到XXX登录系统!");
        String zoujiahao = "zoujiahao";
        String zoujiahaoPassword = "ljw4zjhdedakeai";
        int num = 0;
        while (num <= 3) {
            System.out.println("请输入你的用户名!");
            String user = scanner.nextLine();
            System.out.println("请输入你的用户密码!");
            String passWord = scanner.nextLine();
            if (user.equals(zoujiahao) && passWord.equals(zoujiahaoPassword)) {
                System.out.println("登录成功!");
                break;
            } else {
                System.out.println("你还有" + (3 - num) + "次机会!");
                num++;
            }

        }
    }
}

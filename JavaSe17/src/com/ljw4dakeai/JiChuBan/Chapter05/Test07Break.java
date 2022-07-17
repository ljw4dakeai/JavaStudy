package com.ljw4dakeai.JiChuBan.Chapter05;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 键入数字打入数字, 直到输入886停下来
 */
public class Test07Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("while实现");
            System.out.println("请输入一个数字, 输入886结束!");
            int input = scanner.nextInt();
            if (input == 886) {
                break;
            } else {
                System.out.println(input);
            }
        }



        for (; ; ) {
            System.out.println("for实现");
            System.out.println("请输入一个数字, 输入886结束!");
            int input = scanner.nextInt();
            if (input == 886) {
                break;
            } else {
                System.out.println(input);
            }
        }
    }
}

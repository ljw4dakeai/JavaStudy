package com.ljw4dakeai.JiChuBan.Chapter04.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkFive {
    public static void main(String[] args) {
        System.out.println("请输入一个数!");
        int num = new Scanner(System.in).nextInt();

        switch (num) {
            case 1 -> System.out.println(1);
            case 2 -> System.out.println(2);
            case 3 -> System.out.println(3);
            case 4 -> System.out.println(4);
            default -> System.out.println("无法判断");
        }

    }
}

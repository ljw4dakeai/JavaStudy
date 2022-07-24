package com.ljw4dakeai.jichuban.Chapter05.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("请输入一个数:");
            int num = scanner.nextInt();
            System.out.println("你输入的数是" + num);
            System.out.println("============================");
        }
    }
}

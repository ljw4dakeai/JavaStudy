package com.ljw4dakeai.jichuban.Practice713;

import java.util.Scanner;

/**
 * @author ZJH
 * 从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和:
 * 1.数字的个位数不为7;
 * 2.数字的十位数不为5;
 * 3.数字的百位数不为3;
 */
public class WorkTwo {
    public static void main(String[] args) {
        String s = " ";


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("请输入一个大于100数字!");
            int num = scanner.nextInt();
            if (num > 100) {
                for (int i = 100; i < num; i++) {
                    if (i % 10 != 7 && i / 10 % 10 != 5 && i / 10 / 10 != 3) {
                        sum += i;
                    }
                }
                System.out.println(sum);
            } else {
                System.out.println("情重新输入!");
            }

        }

    }
}

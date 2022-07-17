package com.ljw4dakeai.JiChuBan.Chapter04.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkOne {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入两个数(以空格分开):");
            String[] numsS = new Scanner(System.in).nextLine().split(" ");
            if (numsS.length > 2) {
                System.out.println("请输入正确的格式");
            } else {
                int num0 = Integer.parseInt(numsS[0]);
                int num1 = Integer.parseInt(numsS[1]);
                System.out.println(num0 + num1);
                System.out.println(num0 - num1);
                System.out.println(num0 * num1);
                System.out.println(num0 / num1);
                System.exit(1);
            }

        }
    }
}

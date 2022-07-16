package com.ljw4dakeai.Chapter06.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkFour {
    public static void main(String[] args) {

        System.out.println("请输入你们组的人数!");
        int num = new Scanner(System.in).nextInt();
        int[] userAge = new int[num];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < userAge.length; i++) {
            System.out.println("请输入你们组一个人的年纪");
            userAge[i] = scanner.nextInt();
        }


        int sum = 0;

        for (int i : userAge) {
            sum += i;
        }

        System.out.println("年龄和为" + sum + " 平均值为" + sum/num);

    }
}

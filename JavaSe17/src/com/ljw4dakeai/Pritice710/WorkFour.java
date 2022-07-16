package com.ljw4dakeai.Pritice710;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 键盘录入一个长方形的长和宽(长和宽为int类型), 计算长方形的面积和周长
 */
public class WorkFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入长方形的长:");
        int high = scanner.nextInt();

        System.out.println("请输入长方形的宽:");
        int weigh = scanner.nextInt();

        System.out.println("长方形的周长是" + (2 * (high + weigh)));

        System.out.println("长方形的面积是" + (high * weigh));

    }
}

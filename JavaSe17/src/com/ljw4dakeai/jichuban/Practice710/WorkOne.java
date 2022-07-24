package com.ljw4dakeai.jichuban.Practice710;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
 */
public class WorkOne {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入一个整数!");
            int num = new Scanner(System.in).nextInt();

            System.out.println(num %  2 == 0 ? "偶数" : "奇数");
        }

    }
}

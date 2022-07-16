package com.ljw4dakeai.Pritice710;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 使用三元运算符判断如果a大于b返回a与b的和, 否则返回a与b的乘积, 打印结果
 */
public class WorkFive {
    public static void main(String[] args) {

        System.out.println("请输入a和b(空格分开):");
        String[] s = new Scanner(System.in).nextLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        System.out.println(a > b ? a + b : a * b);


    }
}

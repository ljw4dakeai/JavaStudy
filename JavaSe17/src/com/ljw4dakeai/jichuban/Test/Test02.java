package com.ljw4dakeai.jichuban.Test;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 奇偶数的判断
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入一个数!");
        int num = new Scanner(System.in).nextInt();
        if (num % 2 == 0) {
            System.out.println("这是一个偶数");
        } else {
            System.out.println("这是一个偶数");
        }
        //三元运算符实现
        //System.out.println(num % 2 == 0 ? "这个数是一个偶数" : "这个数是一个奇数");
    }
}

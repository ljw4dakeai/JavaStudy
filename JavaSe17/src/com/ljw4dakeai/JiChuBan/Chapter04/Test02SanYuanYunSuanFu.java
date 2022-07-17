package com.ljw4dakeai.JiChuBan.Chapter04;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 三元运算符
 */

public class Test02SanYuanYunSuanFu {
    public static void main(String[] args) {
        //条件判断语句？条件true 执行 : 条件false 执行
        System.out.println("请输入你的年纪！");
        int age = new Scanner(System.in).nextInt();

        System.out.println(age > 20 ? "帅哥" : "大帅哥");

        int a = 10;
        int b = 220;
        int max = a > b ? a: b;

    }
}

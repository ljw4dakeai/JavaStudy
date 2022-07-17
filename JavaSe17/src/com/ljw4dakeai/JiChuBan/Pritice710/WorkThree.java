package com.ljw4dakeai.JiChuBan.Pritice710;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 键盘录入自己的姓名(String), 年龄(int), 身高(int)保存到对应的变量中,输出结果如:我的姓名是张三,年龄25岁,身高180CM(
* @inport netInt 不能在nextLine 前面使用 ，当 整数和字符串一起输入的时候 推荐都使用nextLine 然后使用包装类         Integer.parseInt(scanner.NextLine()) 封装
 */

public class WorkThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入自己的姓名:");
        String name = scanner.nextLine();

        System.out.println("请输入自己的年龄:");
        int age = scanner.nextInt();

        System.out.println("请输入自己的身高:");
        int high = scanner.nextInt();

        System.out.printf("我的姓名是%s,年龄%d岁,身高%dCM\n", name, age, high);
    }
}

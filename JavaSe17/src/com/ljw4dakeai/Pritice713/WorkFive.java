package com.ljw4dakeai.Pritice713;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ZJH
 * 分析以下需求，并用代码实现：
 * 1.功能描述：模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
 * 2.要求：
 * (1)键盘录入三个整数,其中前两个整数代表参加运算的数据，
 * 第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
 * (2)使用今天所学知识完成功能
 * (3)演示格式如下:
 * 请输入第一个整数:30
 * 请输入第二个整数:40
 * 请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0
 * 控制台输出:30+40=70
 */
public class WorkFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入请输入 (数字 数字 数字(0,1,2,3))");
            List<Integer> integers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
            if (integers.size() == 3) {
                switch (integers.get(2)) {
                    case 0 -> System.out.println(integers.get(1) + integers.get(2));
                    case 1 -> System.out.println(integers.get(1) - integers.get(2));
                    case 2 -> System.out.println(integers.get(1) * integers.get(2));
                    case 3 -> System.out.println(integers.get(1) / integers.get(2));
                    default -> System.out.println("请输入正确的值 (数字 数字 数字(0,1,2))");
                }
            }
        }
    }
}

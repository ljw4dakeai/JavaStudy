package com.ljw4dakeai.jichuban.Test;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 键盘录入三个数,拆分个位, 十位, 百位
 */
public class Test01 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入三个数");
            int i = new Scanner(System.in).nextInt();
            //变量快捷生成 .var 或者 ctrl + alt + v  或者 alt + enter
            if (i < 100 || i >= 1000) {
                System.out.println("情输入一个正确的三位数!");
            } else {
                System.out.println("个位: " + (i % 10));
                System.out.println("十位: " + (i / 10 % 10));
                System.out.println("百位: " + (i / 10 / 10 % 10));
                System.exit(1);
            }
        }

    }
}

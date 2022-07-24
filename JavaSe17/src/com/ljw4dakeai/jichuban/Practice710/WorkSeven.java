package com.ljw4dakeai.jichuban.Practice710;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 1.小明左、右手中分别拿两张纸牌（比如：黑桃10和红桃8，数字10和8可通过键盘录入），要求编写代码交换小明手中的牌
 * 2.程序运行的结果如下：
 * <p>
 * 请输入小明左手中的纸牌：10
 * 请输入小明右手中的纸牌：8
 * <p>
 * 互换前小明手中的纸牌：
 * 左手中的纸牌：10
 *
 * 右手中的纸牌：8
 * <p>
 * 互换后小明手中的纸牌：
 * 左手中的纸牌：8
 * 右手中的纸牌：10
 */
public class WorkSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入左手的牌!");
        int left = scanner.nextInt();

        System.out.println("请输入右手的牌!");
        int right = scanner.nextInt();

        left = left ^ right;
        right = left ^ right;
        left = left ^ right;


        System.out.println("左手的牌是" + left);
        System.out.println("右手的牌是" + right);
    }
}

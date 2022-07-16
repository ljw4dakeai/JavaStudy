package com.ljw4dakeai.Test;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 键盘录入五个数字 求和
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要创建的数组的大小！");
        int length = scanner.nextInt();
        int[] numArr = new int[length];
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            System.out.println("请输入第 " + (i + 1) + "数！");
            numArr[i] = scanner.nextInt();
        }

        for (int i : numArr) {
            sum += i;
        }
        System.out.println("长为" + length + "的数组的和为" + sum);


    }
}

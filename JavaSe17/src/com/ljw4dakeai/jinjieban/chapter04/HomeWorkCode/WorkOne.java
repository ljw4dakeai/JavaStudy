package com.ljw4dakeai.jinjieban.chapter04.HomeWorkCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author ZJH
 * @info - 需求 :  键盘录入字符串 "10 20 50 30 40" ，录入字符串用nextLine()方法。中间用空格隔开
 * - 查找String类的API找到split方法，使用该方法按照空格对字符串进行切割，得到一个字符串数组
 * - 遍历数组，把字符串数组中的每一个元素转换为int类型
 * - 再使用Arrays对int类型数组元素进行升序排列。
 */
public class WorkOne {
    public static void main(String[] args) {
        System.out.println("请输入数字字符串, 中间使用空格隔开!");
        System.out.println(
                Arrays
                        .stream(
                        new Scanner(System.in)
                                .nextLine()
                                .split(" ")
                        )
                        .map(Integer::parseInt)
                        .sorted()
                        .toList());

        System.out.println("------------------------------------------------------");

        System.out.println("请输入数字字符串, 中间使用空格隔开!");
        Scanner scanner = new Scanner(System.in);
        String[] numsString = scanner.nextLine().split(" ");
        Integer[] nums = new Integer[numsString.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numsString[i]);
        }
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(nums));

    }
}

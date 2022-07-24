package com.ljw4dakeai.jichuban.Test;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ZJH
 * @info 查找数据中的数组中的index
 */
public class Test12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入构建数组大小！");
        int numsLength = scanner.nextInt();
        int[] nums = new int[numsLength];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数！");
            nums[i] = scanner.nextInt();
        }

/*        System.out.println("请输入要查找的数字！");
        int inputNum = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (inputNum == nums[i]) {
                flag = true;
                System.out.println("找到了！在数组中的索引值为" + i);
                break;
            }
        }
        if (!flag) {
            System.out.println("请重新输入一个值！数组中的元素有 " + Arrays.toString(nums));
        }*/

        loop:
        while (true) {
            System.out.println("请输入要查找的数字！");
            int inputNum = scanner.nextInt();
            for (int i = 0; i < nums.length; i++) {
                if (inputNum == nums[i]) {
                    System.out.println("找到了！在数组中的索引值为" + i);
                    break loop;
                }
            }
            System.out.println("请重新输入一个值！数组中的元素有 " + Arrays.toString(nums));
        }

    }
}

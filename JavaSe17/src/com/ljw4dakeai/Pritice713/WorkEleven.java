package com.ljw4dakeai.Pritice713;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ZJH
 * 训练描述
 * 假设有一个长度为5的数组，数组元素通过键盘录入，如下所示：
 * int[] arr = {1,3,-1,5,-2}
 * 要求：
 * 创建一个新数组newArr[],新数组中元素的存放顺序与原数组中的元素逆序，并且如果原数组中的元素值小于0，
 * 在新数组中按0存储。最后输出原数组和新数组中的内容
 * <p>
 * <p>
 * 打印格式：
 * 请输入5个整数：
 * 1
 * 3
 * -1
 * 5
 * -2
 * 原数组内容：
 * 1 3 -1 5 -2
 * 新数组内容：
 * 0 5 0 3 1
 * <p>
 * <p>
 * 操作步骤描述
 * 1.创建键盘录入对象
 * 2.定义长度为5的int类型的数组arr
 * 3.利用for循环通过键盘录入给数组元素赋值
 * 4.定义长度为5的int类型的新数组newArr，定义int类型的变量index=0，用来表示新数组的元素索引
 * 5.倒着遍历原数组
 * (1)定义int类型的变量num，并将数组当前元素的值赋值给num
 * (2)使用if判断num的值
 * a.如果num>=0,直接将num赋值给新数组的当前元素，index++
 * b.否则直接将0复制给新数组的当前元素，index++
 * 6.打印原数组和新数组的内容（利用for循环）
 */
public class WorkEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数组的长度!");
        int[] ints = new int[scanner.nextInt()];

        for (int i = 0; i < ints.length; i++) {
            System.out.println("请输入数组的第" + (i + i) + "个数");
            ints[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(ints));

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                ints[i] = 0;
            }
        }

        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(ints));

    }
}

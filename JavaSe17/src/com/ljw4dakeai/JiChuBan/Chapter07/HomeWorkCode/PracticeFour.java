package com.ljw4dakeai.JiChuBan.Chapter07.HomeWorkCode;

import java.util.Arrays;

/**
 * @author ZJH
 * @info
 *
请定义一个方法，实现交换整数数组中两个索引上的元素值。并调用方法，查看运行效果。

例如，数组为{11, 22, 33, 44, 55, 66}，交换索引1和索引5位置上的元素，结果为{11, 66, 33, 44, 55, 22}

### 训练提示

1、首先明确方法的返回值和参数列表，交换元素, 不需要具体返回值.我们要操作哪个数组，要交换哪两个索引上的元素，所以参数列表应该接收一个数组,和两个变量(代表的要交换的索引)

2、在方法中，如果交换两个数组中的元素, 需要根据索引进行交换

3、在主方法中，用void修饰的方法,如何调用？

### 操作步骤

1、定义方法，返回值void，参数列表 int[] arr, int index1, int index2。

2、在方法中，定义临时变量，交换两个索引上的元素值。

3、在主方法中，创建一个int数组，调用方法，将数组作为参数传递。然后遍历数组查看结果

 */
public class PracticeFour {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30,40};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(changeArrIndex(arr, 1, 2)));
    }

    public static int[] changeArrIndex(int[] arr, int startIndex, int endIndex){
        arr[startIndex] = arr[startIndex] ^ arr[endIndex];
        arr[endIndex] = arr[startIndex] ^ arr[endIndex];
        arr[startIndex] = arr[startIndex] ^ arr[endIndex];
        return arr;
    }

}

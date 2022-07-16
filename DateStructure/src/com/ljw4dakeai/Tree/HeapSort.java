package com.ljw4dakeai.Tree;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[8000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 80000));
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringdate1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是：" + stringdate1);

        heapSort(array);

        Date date2 = new Date();
        String stringdate2 = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是：" + stringdate2);

//        System.out.println(Arrays.toString(array));
    }

    //对排序方法

    public static void heapSort(int array[]) {
        int temp = 0;


        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }

        for (int j = array.length - 1; j > 0; j--) {
            //交换
            temp = array[j];
            array[j] = array[0];
            array[0] = temp;
            adjustHeap(array, 0, j);
        }
    }

    //将一个数组的（二叉树），调整成为一个大顶堆

    public static void adjustHeap(int[] array, int i, int length) {
        //待调整的数组，非叶子节点在树中的索引， length表示有多少个元素待调整
        //length在逐渐减少
        //任务：将以i，指向的对应的飞叶子节点对应的树，调整为大顶堆！

        //取出当前元素
        int temp = array[i];

        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && array[k] < array[k + 1]) {
                //说明左子节点他的值小于右子节点的值
                k++; //k指向右子节点
            }
            if (array[k] > temp) {
                //把较大的纸父给当前节点，然后让i指向k，继续循环比较。
                array[i] = array[k];
                i = k;
            } else {
                break; //
            }
        }
        //当for循环结束后，我们已经将以i为父节点的树的最大值，放在了最顶端！（局部的树）
        array[i] = temp;
    }
}

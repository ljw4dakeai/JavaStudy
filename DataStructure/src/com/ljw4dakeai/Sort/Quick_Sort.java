package com.ljw4dakeai.Sort;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Quick_Sort {
    public static void main(String[] args) {
//        int[] array = {-9, 78, 0, 23, -567, 70};
//        System.out.println("快速排序原数组：" + Arrays.toString(array));
//        quick_Sort(array,0,array.length-1);
//
//        System.out.println("快速排序的结果为：" + Arrays.toString(array));

        int[] array = new int[80000];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random() * 80000));
        }


        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringdate1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是：" + stringdate1);

        quick_Sort(array,0,array.length - 1);
//        System.out.println(Arrays.toString(array));

        Date date2 = new Date();
        String stringdate2 = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是：" + stringdate2);


    }

    public static void quick_Sort(int[] array,int left, int right){
        //第一步

        int l = left;
        int r = right;
        int pivot = array[(left + right) / 2];

        //while循环的目的，是让比pivot小的放到pivot的左边，比pivot大的放到右边
        while (l < r){

            //左边找到比pivot大的值，就退出
            while (array[l] < pivot){
                l += 1;
            }

            //右边找到小于等于pivot的值就退出
            while (array[r] > pivot){
                r -= 1;
            }

            //说明pivot左右两边的值已经按照左边全部是小于等于pivot的，右边是大于等于pivot的
            if (l >= r){
                break;
            }

            //交换
            int temp = 0;
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            //交换完成后如果array[l] = pivot;
            if (array[l] == pivot){
                r --;
            }

            //交换完成后array[r] = pivot
            if (array[r] == pivot){
                l ++;
            }

        }

        //第二步
        if (l == r){
            l += 1;
            r -= 1;

        }

        //左递归
        if (left < r){
            quick_Sort(array,left,r);
        }


        //右递归
        if (right > l){
            quick_Sort(array,l,right);
        }

    }
}

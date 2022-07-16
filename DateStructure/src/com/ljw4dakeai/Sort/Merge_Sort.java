package com.ljw4dakeai.Sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Merge_Sort {
    public static void main(String[] args) {
//        int[] array = {8, 4, 5, 7, 1, 3, 6, 2};
//        int[] temp = new int[array.length];
//        marge_Sort(array,0, array.length-1, temp);
//        System.out.println("归并排序后的数组：" + Arrays.toString(array));

        int[] array = new int[80000];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random() * 80000));
        }

        int[] temp = new int[array.length];


        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringdate1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是：" + stringdate1);

        marge_Sort(array,0,array.length - 1,temp);
//        System.out.println(Arrays.toString(array));

        Date date2 = new Date();
        String stringdate2 = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是：" + stringdate2);

    }
    public static void marge_Sort(int[] array ,int left, int right, int[] temp){
        if (left < right){
            int mind = (left + right) / 2;
            marge_Sort(array, left, mind, temp);
            marge_Sort(array, mind + 1, right, temp);
            marge(array, left, mind, right,temp);

        }
    }

    //合并算法
    public static void marge(int[] array,int left, int mind, int right, int[] temp){
        int i = left;
        int j = mind + 1 ;
        int t = 0;

        while(i <= mind && j <= right){
            if (array[i] <= array[j]){
                temp[t] = array[i];
                t += 1;
                i += 1;
            }else {
                temp[t] = array[j];
                t += 1;
                j += 1;
            }
        }

        //左边还有剩余
        while (i <= mind){
            temp[t] = array[i];
            t += 1;
            i += 1;
        }

        //右边还有剩余
        while (j <= right){
            temp[t] = array[j];
            t += 1;
            j += 1;
        }

        //temp拷贝到array
        t = 0;
        int templeft = left;
        while (templeft <= right){
            array[templeft] = temp[t];
            t += 1;
            templeft += 1;

        }


    }
}

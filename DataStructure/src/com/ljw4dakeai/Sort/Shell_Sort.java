package com.ljw4dakeai.Sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Shell_Sort {
    public static void main(String[] args) {
//        int[] array = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
//        System.out.println("排序前的数组为：" + Arrays.toString(array));
//        reshell_Sort(array);
        int[] array = new int[80000];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random() * 80000));
        }


        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringdate1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是：" + stringdate1);

        //shell_Sort(array);
        reshell_Sort(array);

        Date date2 = new Date();
        String stringdate2 = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是：" + stringdate2);

    }

    public static void shell_Sort(int[] array){
        int temp = 0;
        int count = 0;

//        //第一轮
//        for (int i = 5; i < array.length; i++){
//            for (int j = i - 5; j >= 0; j -= 5 ){
//                //如果当前元素大于，加上步长的元素就交换
//                if (array[j] > array[j + 5]){
//                    temp = array[j];
//                    array[j] = array[j + 5];
//                    array[j + 5] = temp;
//                }
//            }
//        }
//        System.out.println("第一轮排序后的情况："+ Arrays.toString(array));
//
//
//        //第二轮
//        for (int i = 2; i < array.length; i++){
//            for (int j = i - 2; j >= 0; j -= 2 ){
//                //如果当前元素大于，加上步长的元素就交换
//                if (array[j] > array[j + 2]){
//                    temp = array[j];
//                    array[j] = array[j + 2];
//                    array[j + 2] = temp;
//                }
//            }
//        }
//        System.out.println("第二轮排序后的情况："+ Arrays.toString(array));
//
//
//        //第三轮
//        for (int i = 1; i < array.length; i++){
//            for (int j = i - 1; j >= 0; j -= 1 ){
//                //如果当前元素大于，加上步长的元素就交换
//                if (array[j] > array[j + 1]){
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println("第三轮排序后的情况："+ Arrays.toString(array));


        //循环实现
        for (int gap = array.length/2; gap > 0; gap = gap / 2){

            for (int i = gap; i < array.length; i++){
                for (int j = i - gap; j >= 0; j -= gap ){
                    //如果当前元素大于，加上步长的元素就交换
                    if (array[j] > array[j + gap]){
                        temp = array[j];
                        array[j] = array[j + gap];
                        array[j + gap] = temp;
                    }
                }
            }
//            System.out.println("希尔排序第"+ (++count) + "轮排序后的情况："+ Arrays.toString(array));

        }
    }

    //移位法
    public static void reshell_Sort(int[] array){
        for (int gap = array.length/2; gap > 0; gap = gap / 2){

            for (int i = gap; i < array.length; i++){
                int j = i;
                int temp = array[j];
                if (array[j] < array [j - gap]){
                    while (j - gap >= 0 && temp < array[j - gap]){
                        //移动
                        array[j]  = array[j - gap];
                        j -= gap;
                    }
                    //while推出后就找到了位置
                    array[j] = temp;
                }
            }
        }
//        System.out.println("移位法希尔排序后的数组为：" + Arrays.toString(array));
    }



}

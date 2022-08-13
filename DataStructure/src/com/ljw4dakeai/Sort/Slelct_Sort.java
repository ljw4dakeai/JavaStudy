package com.ljw4dakeai.Sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Slelct_Sort {
    public static void main(String[] args) {
//        int[] array = {20,1,10,15,100,79};
//        System.out.println("排序前的数组：" + Arrays.toString(array));
        int[] array = new int[80000];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 80000));
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringdate1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是：" + stringdate1);

        select_sort(array);

        Date date2 = new Date();
        String stringdate2 = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是：" + stringdate2);


    }

    public static void select_sort(int[] array) {
//        //分部实现
//        //第一轮
//        int MinIndex = 0;
//        int MinArray = array[0];
//        for (int j = 0 + 1; j < array.length;j++){
//            if (MinArray > array[j]){
//                //重置最小值
//                MinArray = array[j];
//                MinIndex = j;
//            }
//        }
//        //把最小值放在array[0]
//        if (MinIndex != 0){
//            array[MinIndex] = array[0];
//            array[0] = MinArray;
//        }
//
//        System.out.println("第一轮后的排序情况：" + Arrays.toString(array));
//
//        //第二轮
//        MinIndex = 1;
//        MinArray = array[1];
//        for (int j = 1 + 1; j < array.length;j++){
//            if (MinArray > array[j]){
//                //重置最小值
//                MinArray = array[j];
//                MinIndex = j;
//            }
//        }
//        //把最小值放在array[1]
//        if (MinIndex != 1){
//            array[MinIndex] = array[1];
//            array[1] = MinArray;
//        }
//
//        System.out.println("第二轮后的排序情况：" + Arrays.toString(array));
//
//        //第三轮
//        MinIndex = 2;
//        MinArray = array[2];
//        for (int j = 2 + 1; j < array.length;j++){
//            if (MinArray > array[j]){
//                //重置最小值
//                MinArray = array[j];
//                MinIndex = j;
//            }
//        }
//        //把最小值放在array[1]
//        if (MinIndex != 2){
//            array[MinIndex] = array[2];
//            array[2] = MinArray;
//        }
//
//        System.out.println("第三轮后的排序情况：" + Arrays.toString(array));


        for (int i = 0; i < array.length - 1; i++) {
            int MinIndex = i;
            int MinArray = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (MinArray > array[j]) {
                    //重置最小值
                    MinArray = array[j];
                    MinIndex = j;
                }
            }
            //把最小值放在array[1]
            if (MinIndex != i) {
                array[MinIndex] = array[i];
                array[i] = MinArray;
            }

//            System.out.printf("第%d轮后的排序情况：" ,i+1);
//            System.out.println(Arrays.toString(array));
        }

    }


}

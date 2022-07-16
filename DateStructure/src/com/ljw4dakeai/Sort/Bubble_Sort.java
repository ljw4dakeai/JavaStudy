package com.ljw4dakeai.Sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bubble_Sort {
    public static void main(String[] args) {
//        int[] array = {3, 9, -1, 4, -2};
//        int[] array = {1, 2, 3, 4, 5,};
//        int temp = 0;
//        //优化
//        boolean falge = false;
//        for (int i = 0; i < array.length -1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                //如果前面的比后面的大就交换
//                if (array[j] > array[j + 1]) {
//                    falge = true;
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//            System.out.printf("第%d次排序为",i+1);
//            System.out.println(Arrays.toString(array));
//            if (!falge){
//                //一次都没有发生
//                System.out.println("不需要进行排序了");
//                break;
//            }else {
//                //重置flage，进行下次判断
//                falge = false;
//            }
//        }

//        //第一趟，把最大的排在最后
//
//        for (int j = 0; j < array.length - 1; j++ ){
//            //如果前面的比后面的大就交换
//            if (array[j] > array[j + 1]){
//                temp = array[j];
//                array[j] = array[j+1];
//                array[j+1] = temp;
//            }
//        }
//        System.out.println("第一趟排序的数组" + Arrays.toString(array));
//
//        //第二趟排序
//        for (int j = 0; j < array.length - 2; j++ ){
//            //如果前面的比后面的大就交换
//            if (array[j] > array[j + 1]){
//                temp = array[j];
//                array[j] = array[j+1];
//                array[j+1] = temp;
//            }
//        }
//        System.out.println("第二趟排序的数组" + Arrays.toString(array));
//
//        //第三趟排序
//        for (int j = 0; j < array.length - 3; j++ ){
//            //如果前面的比后面的大就交换
//            if (array[j] > array[j + 1]){
//                temp = array[j];
//                array[j] = array[j+1];
//                array[j+1] = temp;
//            }
//        }
//        System.out.println("第三趟排序的数组" + Arrays.toString(array));
//
//        //第四趟排序
//        for (int j = 0; j < array.length - 4; j++ ){
//            //如果前面的比后面的大就交换
//            if (array[j] > array[j + 1]){
//                temp = array[j];
//                array[j] = array[j+1];
//                array[j+1] = temp;
//            }
//        }
//        System.out.println("第四趟排序的数组" + Arrays.toString(array));
        int[] array = new int[80000];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 80000));
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringdate1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是：" + stringdate1);

        BubbleSort(array);

        Date date2 = new Date();
        String stringdate2 = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是：" + stringdate2);

    }

    public static void BubbleSort(int[] array) {
        int temp = 0;
        //优化
        boolean falge = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                //如果前面的比后面的大就交换
                if (array[j] > array[j + 1]) {
                    falge = true;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
//            System.out.printf("第%d次排序为",i+1);
//            System.out.println(Arrays.toString(array));
            if (!falge) {
                //一次都没有发生
                System.out.println("排序完成");
                break;
            } else {
                //重置flage，进行下次判断
                falge = false;
            }
        }
    }

}

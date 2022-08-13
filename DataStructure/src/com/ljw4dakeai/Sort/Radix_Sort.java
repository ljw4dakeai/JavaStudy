package com.ljw4dakeai.Sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Radix_Sort {
    public static void main(String[] args) {
//        int[] array = {53, 3, 542, 748, 14, 214};
//        radix_Sort(array);

        int[] array = new int[80000];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random() * 80000));
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringdate1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是：" + stringdate1);

        radix_Sort(array);

        Date date2 = new Date();
        String stringdate2 = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是：" + stringdate2);
    }

    public static void radix_Sort(int[] array){

//        //第一轮（个位排序）
//        //二维数组表示10个桶，每个桶就是一个一维数组
//        //防止溢出，就让每个桶的大小为array.length（空间换时间）
//        int[][] bucket = new int[10][array.length];
//
//        //记录桶放入的个数
//        int[] bucketElementCounts = new int[10];
//
//        for (int j = 0;j < array.length; j++ ){
//            //取出每一个元素的个位
//            int digitOfElement = array[j] % 10;
//
//            bucket[digitOfElement][bucketElementCounts[digitOfElement]] = array[j];
//            bucketElementCounts[digitOfElement] ++;
//
//        }
//        //按照桶的顺序，把数据放入数组中
//        int Index = 0;
//        for (int k = 0; k < bucketElementCounts.length; k++){
//            //如果桶中有数据，我们才放入到原数组
//            if (bucketElementCounts[k] != 0){
//                //循环该桶
//                //第k个一维数组
//                for (int l = 0; l < bucketElementCounts[k]; l++){
//                    array[Index] = bucket[k][l];
//                    Index ++;
//                }
//            }
//
//            //第一轮处理后，需要把桶置为0
//            bucketElementCounts[k] = 0;
//        }
//        System.out.println("第一轮排序后的数组：" + Arrays.toString(array));
//
//        //第二轮（百位排序）
//        //二维数组表示10个桶，每个桶就是一个一维数组
//        //防止溢出，就让每个桶的大小为array.length（空间换时间）
//
//
//        for (int j = 0;j < array.length; j++ ){
//            //取出每一个元素的个位
//            int digitOfElement = array[j] / 10 % 10;
//
//            bucket[digitOfElement][bucketElementCounts[digitOfElement]] = array[j];
//            bucketElementCounts[digitOfElement] ++;
//
//        }
//        //按照桶的顺序，把数据放入数组中
//        Index = 0;
//        for (int k = 0; k < bucketElementCounts.length; k++){
//            //如果桶中有数据，我们才放入到原数组
//            if (bucketElementCounts[k] != 0){
//                //循环该桶
//                //第k个一维数组
//                for (int l = 0; l < bucketElementCounts[k]; l++){
//                    array[Index] = bucket[k][l];
//                    Index ++;
//                }
//            }
//            bucketElementCounts[k] = 0;
//        }
//        System.out.println("第二轮排序后的数组：" + Arrays.toString(array));
//
//
//        //第s三轮（百位排序）
//        //二维数组表示10个桶，每个桶就是一个一维数组
//        //防止溢出，就让每个桶的大小为array.length（空间换时间）
//
//
//        for (int j = 0;j < array.length; j++ ){
//            //取出每一个元素的个位
//            int digitOfElement = array[j] / 100 % 10;
//
//            bucket[digitOfElement][bucketElementCounts[digitOfElement]] = array[j];
//            bucketElementCounts[digitOfElement] ++;
//
//        }
//        //按照桶的顺序，把数据放入数组中
//        Index = 0;
//        for (int k = 0; k < bucketElementCounts.length; k++){
//            //如果桶中有数据，我们才放入到原数组
//            if (bucketElementCounts[k] != 0){
//                //循环该桶
//                //第k个一维数组
//                for (int l = 0; l < bucketElementCounts[k]; l++){
//                    array[Index] = bucket[k][l];
//                    Index ++;
//                }
//            }
//            bucketElementCounts[k] = 0;
//        }
//        System.out.println("第三轮排序后的数组：" + Arrays.toString(array));

        int max = array[0];
        for (int i = 0;i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        //最大位数
        int maxLength = (max + "").length();

        //二维数组表示10个桶，每个桶就是一个一维数组
        //防止溢出，就让每个桶的大小为array.length（空间换时间）
        int[][] bucket = new int[10][array.length];

        //记录桶放入的个数
        int[] bucketElementCounts = new int[10];

        for (int i = 0, n = 1; i <maxLength; i++, n *= 10){

            for (int j = 0;j < array.length; j++ ){
                //取出每一个元素的个位
                int digitOfElement = array[j] / n %10;

                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = array[j];
                bucketElementCounts[digitOfElement] ++;

            }
            //按照桶的顺序，把数据放入数组中
            int Index = 0;
            for (int k = 0; k < bucketElementCounts.length; k++){
                //如果桶中有数据，我们才放入到原数组
                if (bucketElementCounts[k] != 0){
                    //循环该桶
                    //第k个一维数组
                    for (int l = 0; l < bucketElementCounts[k]; l++){
                        array[Index] = bucket[k][l];
                        Index ++;
                    }
                }

                //每轮处理后，需要把桶置为0
                bucketElementCounts[k] = 0;
            }
//            System.out.println("第"+ (i+1) +"轮排序后的数组：" + Arrays.toString(array));

        }
    }
}

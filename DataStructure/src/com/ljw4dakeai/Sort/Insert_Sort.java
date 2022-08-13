package com.ljw4dakeai.Sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Insert_Sort {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        System.out.println("原始数组：" + Arrays.toString(array));
        int[] array = new int[80000];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random() * 80000));
        }


        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringdate1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是：" + stringdate1);

        insert_Sort(array);

        Date date2 = new Date();
        String stringdate2 = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是：" + stringdate2);
    }

    public static void insert_Sort(int[] array){

//        //第一轮
//        //定义带插入的数
//        int insert_Value = array[1];
//        int inser_Index = 1-1;//arr[1]前面这个数的下下标
//
//        while(inser_Index >= 0 && insert_Value <= array[inser_Index]){
//            array[inser_Index + 1] = array[inser_Index ];
//            inser_Index -- ;
//        }
//        //退出循环时找到了位置，inser_Index + 1
//        array[inser_Index + 1] = insert_Value;
//        System.out.println("第一轮插入后的数组：" + Arrays.toString(array));
//
//        //第二轮
//        //定义带插入的数
//        insert_Value = array[2];
//        inser_Index = 2-1;//arr[1]前面这个数的下下标
//
//        while(inser_Index >= 0 && insert_Value <= array[inser_Index]){
//            array[inser_Index + 1] = array[inser_Index ];
//            inser_Index -- ;
//        }
//        //退出循环时找到了位置，inser_Index + 1
//        array[inser_Index + 1] = insert_Value;
//        System.out.println("第二轮插入后的数组：" + Arrays.toString(array));
//
//        //第三轮
//        //定义带插入的数
//        insert_Value = array[3];
//        inser_Index = 3-1;//arr[1]前面这个数的下下标
//
//        while(inser_Index >= 0 && insert_Value <= array[inser_Index]){
//            array[inser_Index + 1] = array[inser_Index ];
//            inser_Index -- ;
//        }
//        //退出循环时找到了位置，inser_Index + 1
//        array[inser_Index + 1] = insert_Value;
//        System.out.println("第三轮插入后的数组：" + Arrays.toString(array));
//
//        //第四轮
//        //定义带插入的数
//        insert_Value = array[4];
//        inser_Index = 4-1;//arr[1]前面这个数的下下标
//
//        while(inser_Index >= 0 && insert_Value <= array[inser_Index]){
//            array[inser_Index + 1] = array[inser_Index ];
//            inser_Index -- ;
//        }
//        //退出循环时找到了位置，inser_Index + 1
//        array[inser_Index + 1] = insert_Value;
//        System.out.println("第四轮插入后的数组：" + Arrays.toString(array));



        //定义带插入的数
        int insert_Value ;
        int inser_Index ;//arr[i]前面这个数的下下标
        for (int i = 0; i < array.length -1; i++){
            inser_Index = i;
            insert_Value = array[i+1];
            while(inser_Index >= 0 && insert_Value <= array[inser_Index]){
                array[inser_Index + 1] = array[inser_Index ];
                inser_Index -- ;
            }
            //退出循环时找到了位置，inser_Index + 1
            //判断是否需要赋值
            if (inser_Index  !=  i){
                array[inser_Index + 1] = insert_Value;
            }
//            System.out.printf("第%d轮插入后的数组：" ,i + 1);
//            System.out.println(Arrays.toString(array));


        }

        
    }
}

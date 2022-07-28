package com.ljw4dakeai.jinjieban.chapter04.test03arithmetic.testpackage01;

import java.util.Random;

/**
 * @author ZJH
 */
public class Test01TestSort {
    public static void main(String[] args) {
        int[] ints = new int[80000];
        int[] newInts = new int[80000];

        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            int value = random.nextInt(1000);
            ints[i] = value;
            newInts[i] = value;

        }


        long bubbleSortStartTime = System.currentTimeMillis();
        bubbleSort(ints);
        long bubbleSortEndTime = System.currentTimeMillis();
        System.out.println(bubbleSortEndTime - bubbleSortStartTime);

        long quickSortStartTime = System.currentTimeMillis();
        quickSort(newInts, 0 , newInts.length -1);
        long quickSortEndTime = System.currentTimeMillis();
        System.out.println(quickSortEndTime - quickSortStartTime);
    }

    public static void bubbleSort(int[] array) {
        //优化
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                //如果前面的比后面的大就交换
                if (array[j] > array[j + 1]) {
                    flag = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (!flag) {
                //一次都没有发生
                System.out.println("排序完成");
                break;
            } else {
                //重置flag，进行下次判断
                flag = false;
            }
        }
    }

    public static void quickSort(int[] array,int left, int right){
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
            quickSort(array,left,r);
        }


        //右递归
        if (right > l){
            quickSort(array,l,right);
        }

    }
}

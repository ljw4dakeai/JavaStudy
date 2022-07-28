package com.ljw4dakeai.jinjieban.chapter04.HomeWorkCode;

import java.util.Arrays;

/**
 * @author ZJH
 */
public class WorkFive {
    public static void main(String[] args) {
        Integer[] array = {90, 70, 50, 60, 30, 10, 20, 40, 80};
        //1.打印数组中的元素
        System.out.println(Arrays.toString(array));
        //对元素进行排序
        //2.1对数组的元素排序(默认升序排列);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        //2.2对数组的元素排序(手动排序规则);
//        System.out.println(Arrays.toString(Arrays.stream(array).sorted((v1, v2) -> v2 - v1).toArray()));
        System.out.println(Arrays.stream(array).map(Integer :: valueOf).sorted((v1, v2) -> v2 - v1).toList());
        //3.查找数组中指定的元素索引
        //二分查找之前，必须对数组进行排序（升序）
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 30));
    }
}

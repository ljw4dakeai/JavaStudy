package com.ljw4dakeai.jinjieban.chapter04.test04arrays.testpackage01;

import java.util.Arrays;

/**
 * @author ZJH
 */
public class Test02ArraysBinarySearch {
    public static void main(String[] args) {
        int[] ints = {10, 8, 220, 7, 9, 5, 110, 3};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.binarySearch(ints, 10));
    }
}

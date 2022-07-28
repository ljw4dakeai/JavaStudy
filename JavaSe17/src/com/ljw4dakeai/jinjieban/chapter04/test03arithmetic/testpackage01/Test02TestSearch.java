package com.ljw4dakeai.jinjieban.chapter04.test03arithmetic.testpackage01;

/**
 * @author ZJH
 */
public class Test02TestSearch {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(ints, 1));

    }

    public static int binarySearch(int[] ints, int findValue) {
        int start = 0;
        int end = ints.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (ints[mid] > findValue) {
                end = mid - 1;
            } else if (ints[mid] < findValue) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

}

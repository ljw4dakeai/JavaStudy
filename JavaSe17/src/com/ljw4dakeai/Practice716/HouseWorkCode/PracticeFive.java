package com.ljw4dakeai.Practice716.HouseWorkCode;

/**
 * @author ZJH
 * @info 打印1~1000以内能同时被2和3整除的数，两个一行、三个一行打印。例如：
 * 6 12
 * 18 24 30
 * 36 42
 * 48 54 60
 */


public class PracticeFive {
    public static void main(String[] args) {
        for (int i = 1, num = 1,split = 1; i <= 1000; i++, num++, split ++ ) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (num % 5 == 0 || (split-2) % 5 ==0) {
                    System.out.print(i + " \n");
                } else {
                    System.out.print(i + " ");

                }
            }
        }
    }
}

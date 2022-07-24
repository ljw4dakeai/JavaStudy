package com.ljw4dakeai.jichuban.Practice716.HouseWorkCode;

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
        for (int i = 1, num = 1; i <= 1000; i++, num++) {
            if (i %6== 0) {
                System.out.print(num % 5 == 0 || (num - 2) % 5 == 0 ? i + " \n" : i + " ");
            }
        }
    }
}

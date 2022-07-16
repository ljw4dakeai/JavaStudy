package com.ljw4dakeai.Chapter06.HomeWorkCode;

/**
 * @author ZJH
 */
public class WorkTwo {
    public static void main(String[] args) {
        int[] userAge = new int[]{21, 21, 24};

        int sum = 0;
        for (int i : userAge) {
            sum += i;
        }
        System.out.println(sum);


        int sum_= 0;

        for (int i = 0; i < userAge.length; i++) {
            sum_ += userAge[i];
        }

        System.out.println(sum_);
    }
}

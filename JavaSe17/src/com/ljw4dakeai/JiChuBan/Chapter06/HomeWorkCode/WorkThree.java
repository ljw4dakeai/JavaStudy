package com.ljw4dakeai.JiChuBan.Chapter06.HomeWorkCode;

/**
 * @author ZJH
 */
public class WorkThree {
    public static void main(String[] args) {

        int[] userAge = new int[]{21, 21, 24};

        int sum = 0;
        int num = 0;
        for (int i : userAge) {
            sum += i;
            num += 1;
        }
        System.out.println(sum / num);


        int sum_ = 0;
        int num_ = 0;

        for (int i = 0; i < userAge.length; i++) {
            sum_ += userAge[i];
            num_ += i;
        }

        System.out.println(sum_/num_);
    }
}

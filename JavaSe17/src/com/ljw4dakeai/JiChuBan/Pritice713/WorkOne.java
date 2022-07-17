package com.ljw4dakeai.JiChuBan.Pritice713;

/**
 * @author ZJH
 * 求出1到100之间的既是3的倍数又是5倍数的数字之和.
 */
public class WorkOne {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println(sum);

    }
}

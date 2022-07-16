package com.ljw4dakeai.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZJH
 * @info 水仙花数 A^3 + B^3 + C^ = ABC
 */
public class Test06 {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 100; i < 1000; i++) {
            int g = (i % 10) * (i % 10) * (i % 10);
            int s = (i / 10 % 10) * (i / 10 % 10) * (i / 10 % 10);
            int b = (i / 10 / 10 % 10) * (i / 10 / 10 % 10) * (i / 10 / 10 % 10);
            if (i == g + s + b) {
                if (j % 2 == 0) {
                    System.out.println("水仙花数是:" + i);
                } else {
                    System.out.print("水仙花数是:" + i);
                }
                j++;
            }
        }

        int start = 100;
        int end = 1000;
        while (start < end) {
            int g = (start % 10) * (start % 10) * (start % 10);
            int s = (start / 10 % 10) * (start / 10 % 10) * (start / 10 % 10);
            int b = (start / 10 / 10 % 10) * (start / 10 / 10 % 10) * (start / 10 / 10 % 10);
            if (start == g + s + b) {
                if (j % 2 == 0) {
                    System.out.println("水仙花数是:" + start);
                } else {
                    System.out.print("水仙花数是:" + start);
                }
                j++;
            }
            start++;
        }
    }
}

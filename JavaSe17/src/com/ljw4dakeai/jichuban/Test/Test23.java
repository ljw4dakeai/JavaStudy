package com.ljw4dakeai.jichuban.Test;

import java.util.Arrays;

/**
 * @author ZJH
 * @info 打印数组 StringBuilder实现
 */
public class Test23 {
    public static void main(String[] args) {
        int[] ints = new int[]{100, 20, 40, 50};
        System.out.println(arrToString(ints));
        System.out.println(Arrays.toString(ints));
    }

    public static String arrToString(int[] ints) {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        for (int i = 0; i < ints.length; i++) {
            if (i != ints.length - 1) {
                stringBuilder.append(ints[i]).append(" , ");
            } else {
                stringBuilder.append(ints[i]);
            }
        }
        return stringBuilder.append(" ]").toString();
    }
}

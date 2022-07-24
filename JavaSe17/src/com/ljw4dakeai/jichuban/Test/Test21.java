package com.ljw4dakeai.jichuban.Test;

import java.util.Arrays;

/**
 * @author ZJH
 * @info 统计字符串中的大写字母的个数 ,小写字母的个数,数字的个数
 */
public class Test21 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getWordNum("zoujiahaoAILJW520!!!")));

    }

    public static int[] getWordNum(String string) {
        int[] ints = new int[3];
        for (char c : string.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                ints[0]++;
            } else if (c >= 'A' && c <= 'Z') {
                ints[1]++;
            } else if (c >= '0' && c <= '9') {
                ints[2]++;
            }
        }
        return ints;
    }
}

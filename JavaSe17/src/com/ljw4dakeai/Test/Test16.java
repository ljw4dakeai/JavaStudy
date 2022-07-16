package com.ljw4dakeai.Test;

/**
 * @author ZJH
 * @info 比较两个整数 是不是相等  包含全类型
 */
public class Test16 {
    public static void main(String[] args) {
        System.out.println(isEquals(10, 20));
    }

    public static boolean isEquals(int m, int n) {
        return m == n;
    }

    public static boolean isEquals(short m, short n) {
        return m == n;
    }

    public static boolean isEquals(byte m, byte n) {
        return m == n;
    }

    public static boolean isEquals(long m, long n) {
        return m == n;
    }
}

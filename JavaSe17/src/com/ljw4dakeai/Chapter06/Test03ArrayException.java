package com.ljw4dakeai.Chapter06;

/**
 * @author ZJH
 * @info 数组常见的两个异常
 */
public class Test03ArrayException {
    public static void main(String[] args) {
        int[] ints = {1, 2};
        System.out.println(ints[0]);
        System.out.println(ints[1]);
        //java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(ints[2]);

        //动态获取数组的长度
        // 规避java.lang.ArrayIndexOutOfBoundsException异常
        System.out.println(ints.length);


        ///////////////////////////////////////////////////////////////////////////////////////////////////
        //
        int[] ints1 = {10, 20, 30, 50};

        System.out.println(ints1[1]);

        //java.lang.NullPointerException 空指针异常
        ints1 =  null;
        System.out.println(ints1[1]);

        //解决空指针异常！
        if (ints1 != null){ }


    }
}

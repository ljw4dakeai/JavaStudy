package com.ljw4dakeai.jichuban.Chapter06;


/**
 * @author ZJH
 */
public class Test04ArrayForEach {
    public static void main(String[] args) {
        int[] ints = {1, 2, 4, 5, 6};
        System.out.println(ints[0]);
        System.out.println(ints[1]);
        System.out.println(ints[2]);
        System.out.println(ints[3]);
        System.out.println(ints[4]);


        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        for (int anInt : ints) {
            System.out.println(anInt);
        }

        //White
    }
}

package com.ljw4dakeai.jichuban.Chapter06.HomeWorkCode;

/**
 * @author ZJH
 */
public class WorkOne {
    public static void main(String[] args) {
        int[] userAge = new int[]{21, 24, 23};
        for (int i = 0; i < userAge.length; i++){
            System.out.println(userAge[i]);
        }

        for (int i : userAge){
            System.out.println(i);
        }
    }
}

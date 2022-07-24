package com.ljw4dakeai.jichuban.Chapter07.HomeWorkCode;

import java.util.Random;

/**
 * @author ZJH
 */
public class WorkThree {
    public static void main(String[] args) {
        System.out.println("0-9的 随机数为 :" + returnNum());;


    }

    public  static int returnNum(){
        return new Random().nextInt(10);
    }
}

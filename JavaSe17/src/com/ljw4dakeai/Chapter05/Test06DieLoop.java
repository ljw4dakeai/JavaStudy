package com.ljw4dakeai.Chapter05;

/**
 * @author ZJH
 * @info 死循环
 */
public class Test06DieLoop {
    public static void main(String[] args) {
        //最常用, 可读性  是最好的!
        //一定要写出口.
        while (true) {
            System.out.println("我停不下来了!");
        }

//        for (; ; ) {
//            System.out.println("我听不下来了!");
//        }


//        do {
//            System.out.println("我停不下来了");
//        }while (true);
    }
}

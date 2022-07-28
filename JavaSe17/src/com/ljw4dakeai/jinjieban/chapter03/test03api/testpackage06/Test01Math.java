package com.ljw4dakeai.jinjieban.chapter03.test03api.testpackage06;

/**
 * @author ZJH
 */
public class Test01Math {
    public static void main(String[] args) {
        //求绝对值
        int abs = Math.abs(-3);
        System.out.println(abs);
        //结果3

        //求最大值
        double max = Math.max(20.0, 10);
        System.out.println(max);

        //求最小值
        double min = Math.min(6.88, 9.66);
        System.out.println(min);

        //前一个数的后面数的次幂
        double pow = Math.pow(2, 3);
        System.out.println(pow);


        //对一个数四舍五入
        long roundOne = Math.round(3.8);
        System.out.println(roundOne);
        long roundTwo = Math.round(3.3);
        System.out.println(roundTwo);

        //对一个数开方
        double sqrt = Math.sqrt(4);
        System.out.println(sqrt);

        //对一个数向上取整数
        double ceilOne = Math.ceil(3.1);
        double ceilTwo = Math.ceil(3.0);
        double ceilThree = Math.ceil(3.6);
        System.out.println(ceilOne);
        System.out.println(ceilTwo);
        System.out.println(ceilThree);

        //对一个数向下取整
        double floorOne = Math.floor(3.1);
        double floorTwo = Math.ceil(3.0);
        double floorThree = Math.ceil(3.6);
        System.out.println(floorOne);
        System.out.println(floorTwo);
        System.out.println(floorThree);

        //生成一个随机数[0.0-1.0)
        double randomOne = Math.random();
        System.out.println(randomOne);

        //生成一个随机整数
        int randomTwo = (int) (Math.random() * 100);
        System.out.println(randomTwo);


    }
}

package com.ljw4dakeai.jinjieban.chapter01.test03static;

/**
 * @author ZJH
 * @info 静态方法的使用
 * 工具类
 * 1、类中的方法都是静态的， 不需要创建对象，拿着直接用类.方法调用!
 */
public class Test02StaticMethod {
    public static void main(String[] args) {
        ArrayUtils.arrPrint(new int[]{10, 20, 40, 70});
        System.out.println(ArrayUtils.getMaxInArr(new int[]{10, 220, 80, 16}));
        System.out.println(ArrayUtils.getMinInArr(new int[]{10, 220, 80, 16}));

        ArrayUtils.arrPrint(new int[]{10, 9, 8, 7, 6});
    }
}

class ArrayUtils {
    public static void arrPrint(int[] ints) {
        System.out.print("[ ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(i == ints.length - 1 ? ints[i] + " ] \n" : ints[i] + " , ");
        }
    }

    public static int getMaxInArr(int[] ints){
        int max = ints[0];
        for (int anInt : ints) {
            max = max > anInt ? max : anInt;
        }

        return max;
    }

    public static int getMinInArr(int[] ints){
        int min = ints[0];
        for (int anInt : ints) {
            min = min < anInt ? min : anInt;
        }

        return min;
    }
}

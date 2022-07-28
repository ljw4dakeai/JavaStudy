package com.ljw4dakeai.jinjieban.chapter04.test05lambda.testpackage01;

import java.util.Arrays;

/**
 * @author ZJH
 */
public class Test01TestLambda {
    public static void main(String[] args) {
        Integer[] integers = {80, 10, 20, 30, 50, 40, 70};
        Arrays.sort(integers, (o1, o2) -> o1 - o2);
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, (Integer o1, Integer o2) -> {return o2 - o1;});
        System.out.println(Arrays.toString(integers));
    }
}

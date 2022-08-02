package com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01;

import java.util.Scanner;
import java.util.UUID;

/**
 * @author ZJH
 */
public class Test07TestUserDefineException {
    public static void main(String[] args) throws NumberOverSizeException {
//        try {
//            printEvenNumber(new Scanner(System.in).nextInt());
//        } catch (NumberOverSizeException e) {
//            e.printStackTrace();
//        }
//
        System.out.println("请输入一个整数!");
        printEvenNumber(new Scanner(System.in).nextInt());
    }


    /**
     * 打印 1到n 之间的偶数
     * @param n 最大值
     */
    public static void printEvenNumber(int n) throws NumberOverSizeException {
        if (n <= 0 || n > Short.MAX_VALUE) {
            throw new NumberOverSizeException("数据过大或者过小");
        }
        System.out.println("数据" + n + "合法");
        for (int i = 0; i < n; i++) {

            System.out.print(i % 2 == 0 ? i : " ");
        }
        System.out.println();
    }
}


/**
 * 自定义异常类 , 数据过大异常, 编译时异常
 */
class NumberOverSizeException extends Exception {
    public NumberOverSizeException() {
    }

    /**
     * 创建异常对象时候赋值的异常信息
     *
     * @param message 异常信息
     */
    public NumberOverSizeException(String message) {
        super(message);
    }
}
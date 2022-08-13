package com.ljw4dakeai.jinjieban.chapter13.test08annotation.testpackage02;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * @author ZJH
 * @info
 * 注解解释
 */
public class Test01TestExplainAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //获取类上的注解
        Class<?> aClass = Class.forName("com.ljw4dakeai.jinjieban.chapter13.test08annotation.testpackage02.BookStore");
        Book annotation = aClass.getAnnotation(Book.class);
        System.out.println(annotation.value());
        System.out.println(annotation.price());
        System.out.println(Arrays.toString(annotation.authors()));


        System.out.println("-------------------------------------------------------------------------");
        Book buyBookAnnotation = aClass.getMethod("buyBook").getAnnotation(Book.class);
        System.out.println(buyBookAnnotation.value());
        System.out.println(buyBookAnnotation.price());
        System.out.println(Arrays.toString(buyBookAnnotation.authors()));

    }
}

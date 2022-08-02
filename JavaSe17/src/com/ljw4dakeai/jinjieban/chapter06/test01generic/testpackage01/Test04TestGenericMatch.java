package com.ljw4dakeai.jinjieban.chapter06.test01generic.testpackage01;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author ZJH
 * @info
 *     //<?>表示通配所有泛型
 *     //<? extends 类型> 表示可以传入所有类型的子类型
 *     //<? super 类型> 表示可以传入所有类型的父类型
 */
public class Test04TestGenericMatch {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>(Arrays.stream(new Integer[]{10, 20, 30}).toList());
        forEach(integers);
    }

    //<?>表示通配所有泛型
    //<? extends 类型> 表示可以传入所有类型的子类型
    //<? super 类型> 表示可以传入所有类型的父类型
    public static void forEach(Collection<?> collection) {
        collection.forEach(System.out::println);
    }
}

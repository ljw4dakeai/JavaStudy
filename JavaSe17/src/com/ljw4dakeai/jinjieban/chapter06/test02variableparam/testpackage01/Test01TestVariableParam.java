package com.ljw4dakeai.jinjieban.chapter06.test02variableparam.testpackage01;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author ZJH
 * 方法(参数类型... 变量名)
 * 接受多个相同类型的参数
 * 本质上还是一个数组
 *
 * 可变参数后面不可以再添加任何参数, 只能放在前面
 */
public class Test01TestVariableParam {

    public static void main(String[] args) {
        add(1, 2, 3, 4, 5, 6, 7);

        Collection<Integer> collectionVar = addElmToCollectionVariableParma(new LinkedList<Integer>(), 10, 20 ,30, 40, 50, 60);
        System.out.println(collectionVar);

    }

    public static void add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.println(sum);
    }


    public static void multiply(int value, int... arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum *value);
    }

    @SafeVarargs
    public static <T> Collection<T> addElmToCollectionVariableParma(Collection<T> collection, T... Ts) {
        collection.addAll(Arrays.stream(Ts).map(val -> (T) val).toList());
        return collection;
    }
}

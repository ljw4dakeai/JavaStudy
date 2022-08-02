package com.ljw4dakeai.jinjieban.chapter06.test01generic.testpackage01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author ZJH
 * @info 方法类型泛型的创建
 */
public class Test03TestGenericFuncCreate {
    public static void main(String[] args) {
        Collection<String> collection = addElmToCollection(new ArrayList<String>(), "aa", "b", "c");
        System.out.println(collection);
        Collection<Integer> collectionVar = addElmToCollectionVariableParma(new LinkedList<Integer>(), 10, 20 ,30, 40, 50, 60);
        System.out.println(collectionVar);
    }

    public static <T> Collection<T> addElmToCollection(Collection<T> collection, T t1, T t2, T t3) {
       collection.addAll(Arrays.stream(new Object[]{t1, t2, t3}).map(val -> (T) val).toList());
       return collection;
    }
    public static <T> Collection<T> addElmToCollectionVariableParma(Collection<T> collection, T... Ts) {
       collection.addAll(Arrays.stream(Ts).map(val -> (T) val).toList());
       return collection;
    }
}

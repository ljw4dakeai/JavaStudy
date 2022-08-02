package com.ljw4dakeai.jinjieban.chapter07.test01immutablecollection.testpackage01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ZJH
 * @info
 * 不可变集合之不可变列表
 * jdk9以后才有, jdk8没有, 而以后开发就使用的是jdk8
 *
 * 因为有时候,我们仅需要获取元素,而不需要修改元素(以前会导致线程不安全)
 */
public class Test01TestImmutableList {
    public static void main(String[] args) {

        List<String> immutableStringsList = List.of("张三", "李四", "赵四", "王五");
        System.out.println(immutableStringsList);

        Set<String> immutableStringsSet = Set.of("张三", "李四", "赵四", "王五");
        System.out.println(immutableStringsList);


        Map<String, String> immutableStringsMap = Map.of("张三", "湖北", "李四", "江西");
        System.out.println(immutableStringsMap);





    }
}

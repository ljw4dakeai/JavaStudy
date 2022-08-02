package com.ljw4dakeai.jinjieban.chapter07.HomeWorkMD.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        //准备好一个集合
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"金毛狮王","周芷若", "周芷若","张无忌","灭绝师太","灭绝师太","张三丰", "张翠山", "小昭", "赵敏");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"杨过","小龙女","张三丰", "张翠山", "小昭", "赵敏");

        //1.获取两个集合的流
        //2.将两个流合并为一个流
        Stream<String> stream = Stream.concat(list1.stream(), list2.stream());

        //3.过滤姓名长度大于2的元素、截取前面8个、跳过前面1个、去重重复元素，打印剩余元素
        stream.filter(s->s.length()>2).limit(8).skip(1).distinct().forEach(s-> System.out.println(s));
    }
}

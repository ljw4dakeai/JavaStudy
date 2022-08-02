package com.itheima.d4_homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 创建5个人放到ArrayList 中.使用迭代器获取每个人的信息.找出最高的人,最矮的人并输出最高人和最矮人的信息.打印格式如下:最高的人是张 三,身高1.80. 最矮的人是李四,身高1.60
 */
public class Test7 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小明",20,165));
        list.add(new Person("小强",22,170));
        list.add(new Person("小飞",18,172));
        list.add(new Person("小刚",25,160));
        list.add(new Person("小黄",22,163));

        //最高的人，最矮的人
        Person max = list.get(0);
        Person min = list.get(0);

        Iterator<Person> it = list.iterator();
        while (it.hasNext()){
            Person p = it.next();
            if(p.getHigh()>max.getHigh()){
                max = p;
            }

            if(p.getHigh()<min.getHigh()){
                min = p;
            }
        }

        System.out.println("最高的人："+max);
        System.out.println("最矮的人："+min);
    }
}

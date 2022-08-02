package com.ljw4dakeai.jinjieban.chapter07.HomeWorkMD.homework;

import java.util.ArrayList;

/*
1.创建一个Student类，有name和age两个属性
2.创建一个ArrayList集合，往集合中添加10个Student对象
3.使用Stream流过滤集合中年龄>20的元素
4.截取前面的8个元素
5.跳过前面的2个元素
6.把Stream流中剩余的元素打印

学习小技巧：学习小技巧：调用完一个方法之后使用forEach测试一下，看是否和目标项目，这样可以加深印象。
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("张三",20));
        list.add(new Student("李四",18));
        list.add(new Student("王五",19));
        list.add(new Student("赵六",25));
        list.add(new Student("前妻",27));
        list.add(new Student("王炸",28));
        list.add(new Student("小王",26));
        list.add(new Student("大王",24));
        list.add(new Student("蘑菇头",23));
        list.add(new Student("妹爷",29));
        list.add(new Student("老王",30));
        list.add(new Student("老李",22));

        list.stream().filter(s->s.getAge()>20).limit(8).skip(2).forEach(s-> System.out.println(s));
    }
}

package com.ljw4dakeai.jinjieban.practice.practice0802;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author ZJH
 * @info 1.创建一个Student类，有name和age两个属性
 * 2.创建一个ArrayList集合，往集合中添加10个Student对象
 * 3.截取前面的8个元素
 * 4.使用Stream流过滤保留集合中年龄>18的元素
 * 5.跳过前面的2个元素
 * 6.对流中的元素按照年龄的升序排列
 * 7.再获取最大年龄的学生对象
 * 8.打印最大年龄的学生姓名和年龄
 */
public class PracticeFive {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        Collections.addAll(students,
                new Students("张三", 20),
                new Students("李四", 18),
                new Students("王五", 19),
                new Students("赵六", 25),
                new Students("王炸", 28),
                new Students("小王", 26),
                new Students("大王", 24),
                new Students("蘑菇头", 23),
                new Students("妹爷", 29),
                new Students("老王", 30)
        );
        Students[] filterStudents =
                students
                        .stream()
                        // * 3.截取前面的8个元素
                        .limit(8)
                        // * 4.使用Stream流过滤保留集合中年龄>18的元素
                        .filter(val -> val.getAge() > 18)
                        // * 5.跳过前面的2个元素
                        .skip(2)
                        // * 6.对流中的元素按照年龄的升序排列
                        .sorted(Comparator.comparingInt(Students::getAge))
                        // * 7.再获取最大年龄的学生对象
                        .toArray(Students[]::new);
        // * 8.打印最大年龄的学生姓名和年龄
        System.out.println(filterStudents[filterStudents.length - 1]);

    }
}

class Students {
    private String name;
    private int age;

    public Students() {
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



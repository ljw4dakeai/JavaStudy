package com.ljw4dakeai.jinjieban.chapter07.HomeWorkCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 * @author ZJH
 */
public class WorkThree {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,
                new Student("张三", 20),
                new Student("李四", 18),
                new Student("王五", 19),
                new Student("赵六", 25),
                new Student("前妻", 27),
                new Student("王炸", 28),
                new Student("小王", 26),
                new Student("大王", 24),
                new Student("蘑菇头", 23),
                new Student("妹爷", 29),
                new Student("老王", 30),
                new Student("老李", 22)
        );
        list
                .stream()
                //3.使用Stream流过滤集合中年龄>20的元素
                .filter(val -> val.getAge() > 20)
                //4.截取前面的8个元素
                .limit(8)
                //5.跳过前面的2个元素
                .skip(2)
                //6.把Stream流中剩余的元素打印
                .forEach(System.out::println);
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student student)) {
            return false;
        }
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
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

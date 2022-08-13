package com.ljw4dakeai.jinjieban.practice.practice0802;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author ZJH
 * @info 假设一个班级有2间宿舍，一个宿舍可以住4个学生，
 * 每个学生有姓名和年龄两个属性，每间宿舍有一个宿舍号，
 * 要求：创建一个HashMap集合，键是宿舍号，值是宿舍里住的4学生，并遍历Map集合，打印输出每一个宿舍，住了那些学生。
 */
public class PracticeFour {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Student>> arrayListHashMap = new HashMap<Integer, ArrayList<Student>>();
        ArrayList<Student> studentsOne = new ArrayList<>();
        ArrayList<Student> studentsTwo = new ArrayList<>();

        Collections.addAll(studentsOne,
                new Student("张三", 20),
                new Student("李四", 18),
                new Student("赵四", 21),
                new Student("王五", 22)
        );

        Collections.addAll(studentsTwo,
                new Student("宋江", 1000),
                new Student("吴用", 1010),
                new Student("武松", 1008),
                new Student("李逵", 1011)
        );


        arrayListHashMap.put(1, studentsOne);
        arrayListHashMap.put(2, studentsTwo);

        arrayListHashMap.forEach((key, value) -> {
            System.out.println("宿舍号是" + key);
            System.out.println("宿舍住的学生是");
            value.forEach(System.out::println);
            System.out.println("----------------------");
        });

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

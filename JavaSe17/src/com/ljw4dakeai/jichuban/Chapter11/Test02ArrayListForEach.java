package com.ljw4dakeai.jichuban.Chapter11;

import java.util.ArrayList;

/**
 * @author ZJH
 * @info 集合的遍历
 */
public class Test02ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("zoujiahao");
        strings.add("lijingwen");
        strings.add("heiheihei");
        strings.add("ikun");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("============================");


        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("============================");

        strings.forEach(System.out::println);

        System.out.println("=====================================================");

        //集合中只能存储引用数据类型, 不能存储基本数据类型
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(20);
        ints.add(30);
        ints.add(40);


        for (int i = 0; i < ints.size(); i++) {
            System.out.println(ints.get(i));
        }
        System.out.println("============================");


        for (Integer anInt : ints) {
            System.out.println(anInt);
        }
        System.out.println("============================");

        ints.forEach(System.out::println);

        System.out.println("=====================================================");


        ArrayList<Student> students = new ArrayList<>();

        Student zoujiahao = new Student("zoujiahao", 1905140016);
        Student lijingwen = new Student("lijingwen", 1905140017);
        Student ljw4dakeai = new Student("ljw4dakeai", 1905140018);


        //添加对象到集合中 , 其实是添加对象的地址值
        students.add(zoujiahao);
        students.add(lijingwen);
        students.add(ljw4dakeai);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("============================");

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("============================");

        students.forEach(System.out::println);


    }
}


class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

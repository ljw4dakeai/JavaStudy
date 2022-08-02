package com.ljw4dakeai.jinjieban.chapter05.test03set.testpackage03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author ZJH
 * @info 相对hashSet 多了一个双向链表记录索引值
 * linkedHashSet 和hashSet存储数据的底层数据结构是一样的,
 * 只是linkedHashCode相对hashSet 多了一个双向链表记录索引值
 */
public class Test01LinkedHashSet {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("张三", 20));
        students.add(new Student("李四", 23));
        students.add(new Student("王五", 21));
        students.add(new Student("张三", 20));

        for (Student student : students) {
            System.out.println(student);
        }


        LinkedHashSet<Student> studentsLinked = new LinkedHashSet<>();
        studentsLinked.add(new Student("张三", 20));
        studentsLinked.add(new Student("李四", 23));
        studentsLinked.add(new Student("王五", 21));
        studentsLinked.add(new Student("张三", 20));

        for (Student student : studentsLinked) {
            System.out.println(student);
        }



    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student student)) {
            return false;
        }
        return getAge() == student.getAge() && getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
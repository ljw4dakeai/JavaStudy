package com.ljw4dakeai.jinjieban.chapter04.HomeWorkCode;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author ZJH
 * @info
 * 需求：按照下面要求，使用Arrays的sort方法和Lamdba表达式完成自定义对象的排序
 *
 * - 定义一个Student类，有姓名和年龄两个属性，并提供get和set以及toString方法
 * - 创建4个Student对象，并添加到数组中
 * - 使用Arrays的sort方法对学生对象按照年龄的升序排列，排列规则用Lamdba表达式来写。
 * - 遍历打印数组中的每一个学生对象的姓名和年龄
 * - 【注意：排序规则是两个对象的年龄相减，不是两个对象相减】
 */
public class WorkTwo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student zoujiahao = new Student("zoujiahao", 21);
        Student xiaobai = new Student("xiaobai", 22);
        Student xiaohong = new Student("xiaohong", 18);
        Student lijingwen = new Student("lijingwen", 20);

       students.add(zoujiahao);
       students.add(xiaobai);
       students.add(xiaohong);
       students.add(lijingwen);

        students.sort((studentOne, studentTwo) -> studentOne.getAge() - studentTwo.getAge());

        students.forEach(System.out :: println);
        System.out.println(students);

    }
}

class  Student{
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
        return getAge() == student.getAge() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
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

package com.ljw4dakeai.jinjieban.chapter05.test03set.testpackage02;

import java.util.Objects;

/**
 * @author ZJH
 * @info 底层使用
 * jdk8 后 数组加上链表和红黑数实现 (链表长度大于8 链表转换为红黑树) 尾插法
 * jdk8 前 数组加上链表实现      头插法
 *不复写hashCode方法 每个对象的hashCode都不一样
 * 复写hashCode方法 属性值一样 hashCode值一样
 */
public class Test01TestHashCode {
    public static void main(String[] args) {
        Student studentOne = new Student("邹家豪", 21);
        Student studentTwo = new Student("邹家豪", 21);
//        没有复写hashCode
//        System.out.println(studentOne);
//        System.out.println(studentOne.hashCode());
//        //com.ljw4dakeai.jinjieban.chapter05.test03set.testpackage02.Student@4eec7777
//        //1324119927
//        System.out.println(studentTwo);
//        System.out.println(studentTwo.hashCode());
//        //com.ljw4dakeai.jinjieban.chapter05.test03set.testpackage02.Student@3b07d329
//        //990368553 -> 十六进制 3B07 D329
//        有复写hashCode
        System.out.println(studentOne);
        System.out.println(studentOne.hashCode());
        //com.ljw4dakeai.jinjieban.chapter05.test03set.testpackage02.Student@4332d389
        //1127404425
        System.out.println(studentTwo);
        System.out.println(studentTwo.hashCode());
        //com.ljw4dakeai.jinjieban.chapter05.test03set.testpackage02.Student@4332d389
        //1127404425

    }
}
class Student{
    private String name;
    private int age;

    public Student() {
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
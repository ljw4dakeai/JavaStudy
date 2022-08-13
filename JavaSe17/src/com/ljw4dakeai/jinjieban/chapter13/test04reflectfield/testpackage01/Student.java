package com.ljw4dakeai.jinjieban.chapter13.test04reflectfield.testpackage01;

import java.util.Date;
import java.util.Objects;

public class Student {
    public static String country = "china";
    public String sex;
    protected Date createDate;
    private String name;
    private int age;

    private Student() {
        System.out.println("无参构造方法触发");
    }

    public Student(String name, int age) {
        System.out.println("有参数构造方法触发");
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

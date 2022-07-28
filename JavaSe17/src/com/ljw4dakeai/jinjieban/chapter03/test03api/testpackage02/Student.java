package com.ljw4dakeai.jinjieban.chapter03.test03api.testpackage02;

import java.util.Objects;

/**
 * @author ZJH
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
//      重写父类的toString方法
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
//父类使用的toString方法
//public String toString() {
//    return getClass().getName() + "@" + Integer.toHexString(hashCode());
//}

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

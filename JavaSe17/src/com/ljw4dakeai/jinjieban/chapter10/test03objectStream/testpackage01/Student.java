package com.ljw4dakeai.jinjieban.chapter10.test03objectStream.testpackage01;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author ZJH
 */
public class Student implements Serializable {
    private String name;
    private int age;

    /**
     * 写死序列化,修改源代码后还是可以被反序列化
     */
    @Serial
    private static final long serialVersionUID = -6891243404454667710L;

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

package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage04;

/**
 * @author ZJH
 */
public abstract class Student {
    private String name;
    private int num;

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    /**
     * 为所有学生实现抽象学习方法
     */
    public abstract void study();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

package com.itheima.d4_homework;

public class Person {
    //姓名,年龄,身高属性
    private String name;
    private int age;
    private int high;

    public Person() {
    }

    public Person(String name, int age, int high) {
        this.name = name;
        this.age = age;
        this.high = high;
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

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
                '}';
    }
}

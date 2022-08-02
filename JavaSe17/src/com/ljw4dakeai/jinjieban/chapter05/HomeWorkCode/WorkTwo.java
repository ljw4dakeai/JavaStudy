package com.ljw4dakeai.jinjieban.chapter05.HomeWorkCode;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author ZJH
 * @info
 * 需求 : 自定义人类:包含姓名,年龄,身高属性.私有成员变量,生成无参,有参构造方法,生成get/set方法
 * 创建5个人放到ArrayList 中，找出最高的人，最矮的人并输出最高人和最矮人的信息
 */
public class WorkTwo {
    public static void main(String[] args) {
        ArrayList<Person> peoples = new ArrayList<>();
        peoples.add(new Person("邹家豪", 20 , 175.5));
        peoples.add(new Person("邹家豪", 21 , 170.3));
        peoples.add(new Person("邹家豪", 23 , 182.5));
        peoples.add(new Person("邹家豪", 25 , 159.5));
        peoples.sort((val1, val2) -> (int) (val1.getHigh() - val2.getHigh()));
        System.out.println(peoples.get(1));
        System.out.println(peoples.get(peoples.size()-1));
    }
}

class Person{
    private String name;
    private int  age;
    private  double high;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person person)) {
            return false;
        }
        return getAge() == person.getAge() && Double.compare(person.getHigh(), getHigh()) == 0 && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHigh());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
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

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Person() {
    }

    public Person(String name, int age, double high) {
        this.name = name;
        this.age = age;
        this.high = high;
    }
}


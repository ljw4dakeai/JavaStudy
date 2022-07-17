package com.ljw4dakeai.JiChuBan.Chapter09;

/**
 * @author ZJH
 * @info 类和对象
 * 面向对象
 */
public class Test01ObjectFengZhuang {

    //测试类  小案例
    public static void main(String[] args) {
        Person zoujiahaao = new Person("邹家豪", 21);
        Person lijingwen = new Person("李静雯", 21);

        zoujiahaao.eat();
        lijingwen.eat();


    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
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


    public void eat(){
        System.out.println( this.name+ "可以吃饭");
    }
}

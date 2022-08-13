package com.ljw4dakeai.jinjieban.chapter13.test07reflectfarmwork.testpackage01;

/**
 * @author ZJH
 */
public class Student {
    private String name;
    private int age;
    private String school;
    private String sex;

    public Student() {
    }

    public void  study(){
        System.out.println("学生正在努力学习!~~~~~");
    }

    public Student(String name, int age, String school, String sex) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", sex='" + sex + '\'' +
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

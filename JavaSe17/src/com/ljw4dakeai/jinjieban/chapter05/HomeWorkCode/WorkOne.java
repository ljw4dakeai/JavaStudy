package com.ljw4dakeai.jinjieban.chapter05.HomeWorkCode;

import java.util.ArrayList;

/**
 * @author ZJH
 * @info
 * 需求 : 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
 * 创建5个学生放到 ArrayList中。获取每个学生信息，统计总分，平均分，最高分，最低分并输出
 */
public class WorkOne {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("zoujiahao", 20, 90));
        students.add(new Student("zoujiahao", 18, 70));
        students.add(new Student("zoujiahao", 27, 98.5));
        students.add(new Student("zoujiahao", 20, 76.5));
        students.add(new Student("zoujiahao", 18, 65.0));

        double  max = students.get(1).getScore();
        double  min = students.get(1).getScore();
        double sum = 0;
        int num = 0;

        for (Student student : students) {
            max = Math.max(max, student.getScore());
            min = Math.min(max, student.getScore());
            num ++;
            sum += student.getScore();
        }

        double avg = sum / (double)  num;

        System.out.println("最高分 Max : " + max);
        System.out.println("最低分 Min : " + min);
        System.out.println("平均分 Avg : " + avg);
        System.out.println("平均分 Sum : " + sum);
    }
}
class Student{
    private String name;
    private  int age;
    private  double score;

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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
package com.ljw4dakeai.JiChuBan.Chapter10;

import java.util.Scanner;

/**
 *
 * @author ZJH
 * split 切割字符串 创建对象!
 */
public class Test08StringSplit {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串包括姓名和学号 , 分割!");
        String[] strings = new Scanner(System.in)
                .nextLine()
                .split(",");
        System.out.println(new Student(strings[0], Integer.parseInt(strings[1])));

    }
}

class Student {
    private String name;
    private int studentNum;

    public Student() {
    }

    public Student(String name, int studentNum) {
        this.name = name;
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentNum=" + studentNum +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
}
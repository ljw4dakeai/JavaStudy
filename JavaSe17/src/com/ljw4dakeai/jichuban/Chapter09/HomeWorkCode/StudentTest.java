package com.ljw4dakeai.jichuban.Chapter09.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 * @info - 编写一个学生类
 * <p>
 * - 要求有四个属性( 学号,姓名,年龄,生日)
 * <p>
 * - 写出空参和全参构造方法
 * <p>
 * - 写出gettersetter方法
 * <p>
 * - 写出toString 方法
 * <p>
 * - 键盘录入学生的 学号,姓名,年龄 生日
 * <p>
 * - 并将数据存储到学生对象中 (使用set方法赋值)
 * <p>
 * - 打印学生对象
 * <p>
 * - 键盘录入学生的 学号,姓名,年龄 生日
 * <p>
 * - 并将数据存储到学生对象中 (使用全参构造方法赋值)
 * <p>
 * - 打印对象
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("请输入学生学号!");
        int studentNum = scanner.nextInt();
        System.out.println("请输入学生名字!");
        String name = scanner.next();
        System.out.println("请输入学生年纪");
        int age = scanner.nextInt();
        System.out.println("请输入学生生日!");
        String birthDay = scanner.next();
        student.setStudentNum(studentNum);
        student.setName(name);
        student.setAge(age);
        student.setBirthDay(birthDay);


        System.out.println(student);

        Student zoujiahao = input();

        System.out.println(zoujiahao);


    }

    public static Student input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生学号!");
        int studentNum = scanner.nextInt();
        System.out.println("请输入学生名字!");
        String name = scanner.next();
        System.out.println("请输入学生年纪");
        int age = scanner.nextInt();
        System.out.println("请输入学生生日!");
        String birthDay = scanner.next();

        return new Student(studentNum, name, age, birthDay);
    }

}

class Student {
    private int studentNum;
    private String name;
    private int age;
    private String birthDay;


    @Override
    public String toString() {
        return "Student[" +
                "studentNum=" + studentNum +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDay='" + birthDay + '\'' +
                ']';
    }

    public Student(int studentNum, String name, int age, String birthDay) {
        this.studentNum = studentNum;
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
    }

    public Student() {
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}

package com.ljw4dakeai.manager;

import com.ljw4dakeai.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ZJH
 */
public class StudentManager {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("欢迎来到学生管理系统!");
            System.out.println("请输入1进入添加界面!");
            System.out.println("请输入2进入删除界面!");
            System.out.println("请输入3进入修改界面!");
            System.out.println("请输入4进入查询界面!");
            System.out.println("请输入5会退出程序!");
            System.out.println("请输入你的选择!");
            System.out.println("=======================================");
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("你当前进入的是学生添加界面!");
                    studentAdd();
                }
                case 2 -> {
                    System.out.println("你当前进入的是学生删除界面!");
                    studentDel();
                }
                case 3 -> {
                    System.out.println("你当前进入的是学生修改界面!");
                    studentUpdate();
                }
                case 4 -> {
                    System.out.println("你当前进入的是学生查询界面!");
                    studentFind();
                }
                case 5 -> {
                    System.out.println("你当前进入的退出界面!");
                    System.out.println("欢迎你的下次使用!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("哎呀,输入错误 !请重新输入!");
                }
            }

        }
    }

    private static void studentUpdate() {
        if (studentList.isEmpty()) {
            System.out.println("当前系统中没有学生,无法修改学生!");
        } else {
            int num = inputNum(scanner);
            boolean flag = false;
            for (Student student : studentList) {
                if (student.getNumber() == num) {
                    flag = true;
                    Student newStudent = input(scanner);
                    student.setName(newStudent.getName());
                    student.setGander(newStudent.getGander());
                    student.setBirthday(newStudent.getBirthday());
                    break;
                }
            }
            if (flag) {
                System.out.println("学生修改成功!");
            } else {
                System.out.println("系统中不存在ID为" + num + "的学生! 请重新输入!");
            }
        }
    }

    //删除
    private static void studentDel() {
        if (studentList.isEmpty()) {
            System.out.println("当前系统中没有学生,无法删除学生!");
        } else {
            int num = inputNum(scanner);
            boolean removeIf = studentList.removeIf(value -> value.getNumber() == num);
            if (removeIf) {
                System.out.println("学号为" + num + "的学生删除成功!");
            } else {
                System.out.println("系统中不存在ID为" + num + "的学生! 请重新输入!");
            }
        }
    }

    //查看
    private static void studentFind() {
        if (studentList.isEmpty()) {
            System.out.println("当前系统中没有学生,无法列出学生!");
        } else {
            studentList.forEach(System.out::println);
        }
    }

    //增加
    private static void studentAdd() {
        Student[] studentArr = new Student[1];
        if (studentList.isEmpty()) {
            studentArr[0] = input(scanner);
            studentList.add(studentArr[0]);
        } else {
            boolean flag = false;
            for (Student student : studentList) {
                if (student.getNumber() == studentArr[0].getNumber()) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("无法添加相同学号的学生,请重新输入学生信息!");
            } else {
                studentList.add(studentArr[0]);
                System.out.println(studentArr[0] + "添加成功!");
            }
        }
    }


    public static Student input(Scanner scanner) {
        System.out.println("请输入学生学号!");
        int itStudentNum = scanner.nextInt();
        System.out.println("请输入学生姓名!");
        String itStudentName = scanner.next();
        System.out.println("请输入学生性别!");
        String itStudentGarden = scanner.next();
        System.out.println("请输入学生生日!");
        String itStudentBirthday = scanner.next();
        return new Student(itStudentNum, itStudentName, itStudentGarden, itStudentBirthday);
    }

    public static int inputNum(Scanner scanner) {
        System.out.println("请输入学生学号!");
        return scanner.nextInt();
    }


}

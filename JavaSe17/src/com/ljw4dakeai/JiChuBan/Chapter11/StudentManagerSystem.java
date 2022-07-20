package com.ljw4dakeai.JiChuBan.Chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ZJH
 *
 * @info  javaBean类
 *
 * 1、私有化成员变量
 * 2、空参构造
 * 3、get 和 set方法
 */
public class StudentManagerSystem {

    static ItStudentManager  itStudentManager = new ItStudentManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("欢迎来到学生管理系统!");
            System.out.println("请输入1进入添加界面!");
            System.out.println("请输入2进入删除界面!");
            System.out.println("请输入3进入修改界面!");
            System.out.println("请输入4进入查询界面!");
            System.out.println("请输入5会退出程序!");
            System.out.println("请输入你的选择!");
            System.out.println("=======================================");
            int input = scanner.nextInt();
            switch (input){
                case 1 -> {
                    System.out.println("你当前进入的是学生添加界面!");
                    addStudent(scanner);
                }
                case 2 -> {
                    System.out.println("你当前进入的是学生删除界面!");
                    delStudent(scanner);
                }
                case 3 -> {
                    System.out.println("你当前进入的是学生修改界面!");
                    updateStudent(scanner);
                }
                case 4 -> {
                    System.out.println("你当前进入的是学生查询界面!");
                    findStudent();
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

    public static ItStudent input(Scanner scanner){
        System.out.println("请输入学生学号!");
        int itStudentNum = scanner.nextInt();
        System.out.println("请输入学生姓名!");
        String itStudentName = scanner.next();
        System.out.println("请输入学生性别!");
        String itStudentGarden = scanner.next();
        System.out.println("请输入学生生日!");
        String itStudentBirthday = scanner.next();
        return new ItStudent(itStudentNum, itStudentName, itStudentGarden, itStudentBirthday);
    }

    public static void addStudent(Scanner scanner){
        itStudentManager.itStudentAdd(input(scanner));
    }
    public static void delStudent(Scanner scanner){
        itStudentManager.itStudentDel(input(scanner));
    }
    public static void updateStudent(Scanner scanner){
        itStudentManager.itStudentUpdate(input(scanner));
    }
    public static void findStudent( ){
        itStudentManager.itStudentList();
    }



}

class ItStudentManager {
     static List<ItStudent> ItStudentManager = new ArrayList<>();

    //列出所有学生
    public void itStudentList(){
        if(ItStudentManager.isEmpty()){
            System.out.println("当前系统中没有学生,无法列出学生!");
        }else {
            ItStudentManager.forEach(System.out :: println);
        }
    }


    //增加
    public void itStudentAdd(ItStudent itStudent) {
        if (ItStudentManager.isEmpty()) {
            ItStudentManager.add(itStudent);
            System.out.println(itStudent + "添加成功!");
        } else {
            boolean flag = false;
            for (ItStudent student : ItStudentManager) {
                if(student.getNumber() == itStudent.getNumber()){
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("无法添加相同学号的学生,请重新输入学生信息!");
            } else {
                ItStudentManager.add(itStudent);
                System.out.println(itStudent + "添加成功!");
            }
        }
    }

    //删除
    public void itStudentDel(ItStudent  itStudent){
        if(ItStudentManager.isEmpty()){
            System.out.println("当前系统中没有学生,无法删除学生!");
        }else {
            boolean flag = ItStudentManager.removeIf(value -> value.getNumber() == itStudent.getNumber());
            if(flag){
                System.out.println(itStudent + "删除成功!");
            }else {
                System.out.println("删除失败,没有这个学生!");
            }
        }
    }
    //修改
    public void itStudentUpdate(ItStudent itStudent){
        if(ItStudentManager.isEmpty()){
            System.out.println("当前系统中没有学生,无法删除学生!");
        }else {
            for (ItStudent student : ItStudentManager) {
                if (itStudent.getNumber() == student.getNumber()){
                    student.setName(itStudent.getName());
                    student.setGender(itStudent.getGender());
                    student.setBirthDay(itStudent.getBirthDay());
                    System.out.println("学号为" + itStudent.getNumber() + "的学生修改成功!");
                }else {
                    System.out.println("没有学号为" + itStudent.getNumber() + "的学生,无法修改学生!");
                }
            }
        }
    }

}

class ItStudent {
    private int number;
    private String name;
    private String gender;
    private String birthDay;

    public ItStudent() {
    }

    public ItStudent(int number, String name, String gender, String birthDay) {
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
    }




    @Override
    public String toString() {
        return "ItStudent{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}

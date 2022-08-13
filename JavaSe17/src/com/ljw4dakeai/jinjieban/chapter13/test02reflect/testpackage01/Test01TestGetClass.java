package com.ljw4dakeai.jinjieban.chapter13.test02reflect.testpackage01;

/**
 * @author ZJH
 * @info 获取字节码文件
 */
public class Test01TestGetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取字节码方式1 : Class.formName("全类名");
        Class<?> aStudentClassOne = Class.forName("com.ljw4dakeai.jinjieban.chapter13.test02reflect.testpackage01.Student");

        //获取字节码方式2 : 类名.class
        Class<Student> aStudentClassTwo = Student.class;

        //获取字节码方式3 : 对象.getClass();
        Student student = new Student();
        Class<? extends Student> aStudentClassThree = student.getClass();


        //自要类一样, 字节码就一样
        System.out.println(aStudentClassOne == aStudentClassTwo && aStudentClassOne == aStudentClassThree);


        //获取全类名
        System.out.println(student.getClass().getName());

        //获取简单类名
        System.out.println(student.getClass().getSimpleName());
    }
}


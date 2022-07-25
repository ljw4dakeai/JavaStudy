package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage04;

/**
 * @author ZJH
 * @info 课程,学生老师 老师教学生实现
 */
public class Test01TeachStudent {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("王老师");

        UIStudent uiStudentOne = new UIStudent("邹家豪", 1905140016);
        UIStudent uiStudentTwo = new UIStudent("zoujiahao", 1905140017);
        UIStudent uiStudentThree = new UIStudent("zjh", 1905140018);

        JavaStudent javaStudentOne = new JavaStudent("李静雯", 1905140019);
        JavaStudent javaStudentTwo = new JavaStudent("lijingwen", 1905140020);
        JavaStudent javaStudentThree = new JavaStudent("ljw", 1905140021);

        teacher.teachStudent(uiStudentOne);
        System.out.println("-------------------------------");
        teacher.teachStudent(javaStudentOne);
        System.out.println("-------------------------------");


        Teacher.STUDENT_LIST.add(uiStudentTwo);
        Teacher.STUDENT_LIST.add(uiStudentThree);
        Teacher.STUDENT_LIST.add(javaStudentThree);
        Teacher.STUDENT_LIST.add(javaStudentThree);

        teacher.teachStudents(Teacher.STUDENT_LIST);






    }
}

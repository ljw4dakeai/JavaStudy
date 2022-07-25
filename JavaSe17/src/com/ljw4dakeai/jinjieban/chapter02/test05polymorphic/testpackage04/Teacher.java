package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage04;

import java.util.ArrayList;

/**
 * @author ZJH
 * @info 老师可以教一个学生, 亦可以一次教一群学生
 */
public class Teacher {
    public static final ArrayList<Student> STUDENT_LIST = new ArrayList<>();
    private String name;

    public Teacher() {
    }


    public void teachStudent(Student student){
        student.study();
        if(student instanceof JavaStudent){
            ((JavaStudent) student).studyJs();
        }
    }
    public void teachStudents(ArrayList<Student> students){
        students.forEach(this::teachStudent);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

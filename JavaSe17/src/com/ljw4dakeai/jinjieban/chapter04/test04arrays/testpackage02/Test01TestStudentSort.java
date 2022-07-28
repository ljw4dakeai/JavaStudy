package com.ljw4dakeai.jinjieban.chapter04.test04arrays.testpackage02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * @author ZJH
 */
public class Test01TestStudentSort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("zih", 20));
        students.add(new Student("ljw", 20));
        students.add(new Student("zoujiahao", 18));
        students.add(new Student("lijingwen", 19));
        students.add(new Student("邹家豪", 24));
        students.add(new Student("李静雯", 26));
        students.add(new Student("ljw4dakeai", 18));
        students.add(new Student("LJW4DAKEAI", 17));
        students.sort((value1, value2) -> value1.getAge() - value2.getAge());
        students.forEach(System.out::println);

        System.out.println("-----------------------------------------");
        Student[] studentsArr = new Student[8];
        for (int i = 0; i < studentsArr.length; i++) {
            studentsArr[i] = students.get(i);
        }

        Arrays.sort(studentsArr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        Arrays.stream(studentsArr).forEach(System.out::println);


    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student student)) {
            return false;
        }
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
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
}

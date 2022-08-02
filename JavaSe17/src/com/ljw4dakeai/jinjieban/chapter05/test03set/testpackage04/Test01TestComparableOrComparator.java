package com.ljw4dakeai.jinjieban.chapter05.test03set.testpackage04;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author ZJH
 */
public class Test01TestComparableOrComparator {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("aaa");
        strings.add("eee");
        strings.add("ddd");
        strings.add("ccc");
        strings.add("bbb");
        System.out.println(strings);


        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(100);
        integers.add(90);
        integers.add(120);
        integers.add(80);
        System.out.println(integers);


        //继承Comparable接口
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("张三", 20));
        students.add(new Student("李四", 23));
        students.add(new Student("王五", 21));
        students.add(new Student("赵四", 20));

        System.out.println(students);


        //两种都存在  会优先使用Comparator
        TreeSet<Student> studentsComparator = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i= o2.getAge() -o1.getAge();
                if(i == 0){
                    i = o2.getName().compareTo(o1.getName());
                }
                return i;
            }
        });

        studentsComparator.add(new Student("张三", 20));
        studentsComparator.add(new Student("李四", 23));
        studentsComparator.add(new Student("王五", 21));
        studentsComparator.add(new Student("赵四", 20));


        System.out.println(studentsComparator);

    }
}


class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student student)) {
            return false;
        }
        return getAge() == student.getAge() && getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(Student o) {
        int i = this.getAge() - o.getAge();
        if(i == 0){
            i = this.getName().compareTo(o.getName());
        }
        return  i;
    }
}

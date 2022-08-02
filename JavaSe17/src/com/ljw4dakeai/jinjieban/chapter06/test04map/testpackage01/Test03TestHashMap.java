package com.ljw4dakeai.jinjieban.chapter06.test04map.testpackage01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author ZJH
 */
public class Test03TestHashMap {
    public static void main(String[] args) {
        HashSet<Student> studentsSet = new HashSet<>();
        HashMap<Student, Integer> studentIntegerHashMap = new HashMap<>();
        studentsSet.add(new Student("张三", "湖南"));
        studentsSet.add(new Student("李四", "山东"));
        studentsSet.add(new Student("赵四", "东北"));
        studentsSet.add(new Student("王五", "湖北"));

        studentsSet.forEach(System.out::println);

        studentIntegerHashMap.put(new Student("张三", "湖南"), 40);
        studentIntegerHashMap.put(new Student("李四", "山东"), 28);
        studentIntegerHashMap.put(new Student("赵四", "东北"), 27);
        studentIntegerHashMap.put(new Student("王五", "湖北"), 20);
        studentIntegerHashMap.forEach((k,v) -> System.out.println(k + "->" + v));
    }
}

class Student {
    private String name;
    private String province;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student student)) {
            return false;
        }
        return Objects.equals(name, student.name) && Objects.equals(province, student.province);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, province);
    }

    public Student(String name, String province) {
        this.name = name;
        this.province = province;
    }
}
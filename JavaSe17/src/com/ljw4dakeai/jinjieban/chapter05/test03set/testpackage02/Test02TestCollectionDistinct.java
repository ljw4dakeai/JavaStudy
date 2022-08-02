package com.ljw4dakeai.jinjieban.chapter05.test03set.testpackage02;

import java.util.HashSet;

/**
 * @author ZJH
 * @info 保证唯一性的方法  复写对象hashCode方法和equals方法
 * 扩展 :
 *      Strings 本身就复写了hashCode和equals方法
 *      Integer 也复写了hashCode和equals方法
 *      建议自己写的类作为数据时候 也复写一下hashCod和equals方法!
 */
public class Test02TestCollectionDistinct {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("张三", 20));
        students.add(new Student("李四", 23));
        students.add(new Student("王五", 21));
        students.add(new Student("张三", 20));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

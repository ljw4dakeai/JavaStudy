package com.ljw4dakeai.jinjieban.chapter03.test03api.testpackage02;

import java.util.ArrayList;

/**
 * @author ZJH
 */
public class Test01ObjectTOString {
    public static void main(String[] args) {
        Student student = new Student("邹家豪", 21);
        System.out.println(student.toString());
        //打印一个对象自动调用toString方法
        System.out.println(student);

        System.out.println("-------------------------------------------");
        //在很多API中有很多类复写了toString方法
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("邹家豪");
        stringBuilder.append("李静雯");
        System.out.println(stringBuilder);
//        StringBuilder
//        public String toString() {
//            // Create a copy, don't share the array
//            return isLatin1() ? StringLatin1.newString(value, 0, count)
//                    : StringUTF16.newString(value, 0, count);
//        }

        ArrayList<String> strings = new ArrayList<>();
        strings.add("邹家豪");
        strings.add("李静雯");
        System.out.println(strings);


    }
}

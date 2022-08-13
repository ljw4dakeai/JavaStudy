package com.ljw4dakeai.jinjieban.practice.practice0802;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author ZJH
 */
public class PracticeOne {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        Collections.addAll(strings, "aaa", "aab", "ccc","aca");

        Collections.sort(strings, Comparator.naturalOrder());
        System.out.println(strings);

        Collections.sort(strings, Comparator.reverseOrder());
        System.out.println(strings);

        Integer[] integers = {10, 20, 40, 30};
        Arrays.sort(integers, Comparator.naturalOrder());
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(integers));



        int[] ints = {10, 20, 30, 40, 50};

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM-dd HH:mm:ss");
        Date date = new Date();
        String format = simpleDateFormat.format(date.getTime());


    }
}
//class Student{
//    private String name;
//
//    public static void test1(){
//        System.out.println(name);
//        test2()
//    }
//
//    public void test2(){}
//}

class Student_{
    private String name;
    private int age;
    private Date birthday;

    @Override
    public String toString() {
        return "Student_{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + new SimpleDateFormat("yyyy-MM-dd").format(birthday) +
                '}';
    }
}
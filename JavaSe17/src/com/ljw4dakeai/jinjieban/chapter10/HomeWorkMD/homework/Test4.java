package com.ljw4dakeai.jinjieban.chapter10.HomeWorkMD.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) throws IOException {

        List<Student> list = new ArrayList<>();

        //使用BUfferedReader读取test2文件中的每一行，切割，封装为Student对象，存储到集合中
        BufferedReader br = new BufferedReader(new FileReader("day10_io_properties\\test2.txt"));
        //下面是一行一行读取的代码
        String line;
        while ((line = br.readLine()) != null) {
            //如：line = “迪丽热巴,18,女,99”
            //可以使用","进行切割，得到一个字符串数组；
            String[] array = line.split(",");

            //创建一个Student对象，并且将姓名、性别、年龄、分数设置给对象
            Student stu = new Student();
            stu.setName(array[0]);
            stu.setAge(Integer.parseInt(array[1]));
            stu.setSex(array[2]);
            stu.setScore(Integer.parseInt(array[3]));

            //将对象添加到集合中
            list.add(stu);
        }
        //关闭流
        br.close();

        for (Student student : list) {
            System.out.println(student);
        }
    }
}

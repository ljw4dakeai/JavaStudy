package com.ljw4dakeai.jinjieban.chapter10.HomeWorkMD.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws IOException {
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("迪丽热巴","女",18,99));
        stuList.add(new Student("古力娜扎","女",19,98));
        stuList.add(new Student("周杰伦","男",20,88));
        stuList.add(new Student("蔡徐坤","男",19,78));

        //使用BufferedWriter往文件中写入集合中的学生信息
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_io_properties\\test2.txt"));
        for (Student stu : stuList) {
            bw.write(stu.getName()+","+stu.getAge()+","+stu.getSex()+","+stu.getScore());
            bw.newLine();
        }
        bw.close();
    }
}

package com.ljw4dakeai.jinjieban.chapter10.HomeWorkCode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZJH
 * @info
 * 定义main()方法，定义一个存储Student的集合，并初始化一些数据：
 */
public class WorkThree {
    public static void main(String[] args) throws IOException {
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("迪丽热巴","女",18,99));
        stuList.add(new Student("古力娜扎","女",19,98));
        stuList.add(new Student("周杰伦","男",20,88));
        stuList.add(new Student("蔡徐坤","男",19,78));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkCode/Students.txt"));

        stuList.forEach(val -> {
            try {
                bufferedWriter.write(val.toString());
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bufferedWriter.close();
    }
}

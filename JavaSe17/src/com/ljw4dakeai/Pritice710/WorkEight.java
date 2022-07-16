package com.ljw4dakeai.Pritice710;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

/**
 * @author ZJH
 * @info 分析一下需求，并用代码实现
 * 1.键盘录入学员张浩的3门课程(Java、SQL、Web)的成绩
 * 2.编写程序实现：
 * (1)Java课程和SQL课程的分数差
 * (2)3门课程的平均分
 * 分析：
 * 1.创建键盘录入对象
 * 2.定义三个变量用于存储三门课程的成绩
 * 3.使用nextInt()方法给三门课程的变量赋值
 * 4.定义存储差值及平均值的变量
 * 5.求差值和平均值
 * 6.打印最终结果
 */
public class WorkEight {
    public static void main(String[] args) {
        System.out.println("请输入三门课程的成绩!(空格分开)");
        String[] scores = new Scanner(System.in).nextLine().split(" ");
        int Java = Integer.parseInt(scores[0]);
        int SQL = Integer.parseInt(scores[1]);
        int Web = Integer.parseInt(scores[2]);
        System.out.println("Java和SQL的分数差: " + (Java - SQL));
        int sum = 0;
        int num = 0;
        for (String score : scores) {
            sum += Integer.parseInt(score);
            num += 1;
        }
        System.out.println("平均分数:" + sum / num);
        Optional<Integer> reduce = Arrays.stream(scores).map(Integer::parseInt).reduce(Integer::sum);
        Optional<Integer> reduce_ = Arrays.stream(scores).map(value -> Integer.parseInt(value)).reduce((value1, value2) -> value1 + value2);


    }
}

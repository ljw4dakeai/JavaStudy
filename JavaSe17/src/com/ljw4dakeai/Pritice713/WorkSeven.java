package com.ljw4dakeai.Pritice713;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ZJH
 * @info 循环录入学员Java课程的成绩（学员数量由键盘录入），统计分数大于等于80分的学生的比例。
 * 操作步骤描述
 * <p>
 * 分析：（此题目采用if和switch都可以，在这里采用switch）
 * 1.创建键盘录入对象
 * 2.定义int类型的变量score(学员成绩)、total(学员数量)、count(>=80分的学员数量)
 * 3.通过键盘录入操作给total变量赋值
 * 4.利用for循环(循环次数为total)，循环录入学员成绩
 * (1)获取当前键盘录入的成绩
 * (2)判断该成绩如果<80,continue继续进行下次录入
 * (3)否则如果改成绩>=80,count++
 * 5.定义double类型的rate，并计算80分以上的比例，赋值给rate
 * 6.打印最终的 计算结果
 */
public class WorkSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学员人数");
        int[] scores = new int[scanner.nextInt()];
        int sum = 0;
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入学生成绩!");
            int score = scanner.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                switch (score) {
                    case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
                            90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> {
                        sum++;
                    }
                    default -> System.out.println("这个不优秀的分数是" + score);
                }
                i++;
            } else {
                System.out.println("请重新输入成绩!");
            }
        }
        System.out.println(Arrays.toString(scores));
        System.out.println(sum);
        System.out.println("优秀率为 : " + (double) sum / (double) scores.length);
    }
}

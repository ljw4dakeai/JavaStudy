package com.itheima.d4_homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
需求 : 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.

- 创建5个学生放到 ArrayList中.使用迭代器获取每个学生信息.统计总分,平均分,最高分,最低分并输出
 */
public class Test6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("小明",20,100));
        list.add(new Student("小强",22,98));
        list.add(new Student("小刚",18,99));
        list.add(new Student("小黄",19,97));
        list.add(new Student("小飞",21,95));

        int sum=0; //求和变量
        //定义一个最大值的变量，和最小值的变量
        int max=list.get(0).getScore();
        int min=list.get(0).getScore();

        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            //找到一个学生，就把学生的成绩和sum累加
            sum+=s.getScore();
            System.out.println(s);

            //如果s的成绩比max大，就把s的成绩赋值给max
            if(s.getScore()>max){
                max = s.getScore();
            }

            //如果s的成绩比min小，就把s的成绩赋值给min
            if(s.getScore()<min){
                min = s.getScore();
            }
        }
        System.out.println("总分是："+sum);
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);

        //求平均分
        int avg = sum/list.size();
        System.out.println("平均分是："+avg);
    }
}

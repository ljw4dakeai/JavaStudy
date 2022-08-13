package com.ljw4dakeai.jinjieban.chapter10.HomeWorkMD.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test6 {
    public static void main(String[] args) throws IOException {
        //1.定义一个缓冲字符输入流BufferedIputStream与源文件csb.txt关联
        BufferedReader br = new BufferedReader(new FileReader("day10_io_properties\\csb.txt"));

        //2.创建List集合
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine())!=null){
            //3.循环读取文件中的每一行，并添加到List集合中
            list.add(line);
        }
        //3.释放资源
        br.close();

        //将汉字按照先后顺序存储到集合中，方便后面通过元素找索引
        List<String> orders = List.of("一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");

        //4.对List集合中元素按照首字母升序排序,自定义比较器
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1和o2表示需要比较的两个字符串
                //假设o1: 一.先帝创业未半而中道崩殂
                //假设o2: 四.将军向宠，性行淑均，晓畅军事
                //获取字符串中”.“前面的字符
                String first1 = o1.split("\\.")[0];  //"一"
                String first2 = o2.split("\\.")[0];  //"四"

                //比较first1和first2
                //获取汉字数字元素，在orders集合中的索引
                int index1 = orders.indexOf(first1);
                int index2 = orders.indexOf(first2);

                return index1 - index2;
            }
        });

        //5.创建字符缓冲输出流BufferedWriter，关联目标csb2.txt文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_io_properties\\csb2.txt"));
        //6.遍历排好序的集合往目标文件中写
        for (String s : list) {
            bw.write(s);
            bw.newLine(); //换行
        }
        bw.close();
    }
}

package com.ljw4dakeai.Pritice713;

/**
 * @author ZJH
 * @info
 * 按要求打印数据
 * 1.打印1到100之内的整数，但数字中包含9的要跳过
 * 2.每行输出5个满足条件的数，之间用空格分隔
 * 3.如：1 2 3 4 5
 *           6 7 8 9 10
 */
public class WorkSix {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 9 &&  i / 10 % 10 !=9){
                count ++;
                if (count % 5 == 0){
                    System.out.println(i);
                }else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}


package com.ljw4dakeai.jichuban.Chapter08.HomeWorkCode;

/**
 * @author ZJH
 * @info 我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
 * 百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 * <p>
 * ### 操作步骤
 * <p>
 * 1. 第1层循环，用于表示鸡翁的范围，初始化表达式的变量定义为 x=0，判断条件是x<=20
 * 2. 第2层循环，用于表示鸡母的范围，初始化表达式的变量定义为 y=0，判断条件是y<=33
 * 3. 这个时候，用于表示鸡雏的变量 z = 100 – x – y
 * . 判断表达式 z%3==0 和表达式 5*x + 3*y + z/3 = 100 是否同时成立，如果成立，输出对应的 x，y，z 的值，		就是对应的鸡翁，鸡母，鸡雏的值
 */
public class PracticeFour {
    public static void main(String[] args) {
        int gNumMax = 20;
        int mNumMax = 33;
        for (int gNum = 0; gNum <= gNumMax; gNum++){
            for(int mNum = 0; mNum <= mNumMax; mNum ++){
                int cNum = 100 - gNum - mNum;
                if(cNum  %  3 == 0 && 5*gNum + 3 * mNum +  cNum /3 == 100){
                    System.out.println("鸡翁 = " + gNum + "鸡母 = " + mNum + "鸡雏 = " + cNum);
                }

            }
        }


    }
}

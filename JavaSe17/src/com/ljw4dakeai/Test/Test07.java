package com.ljw4dakeai.Test;

/**
 * @author ZJH
 * @info 一张0.1mm的纸张叠多少次能超过珠穆拉玛峰 8848.860m
 */
public class Test07 {
    public static void main(String[] args) {
        double paper = 0.1;
        double mountain = 8840.860 * 1000;
        int num = 0;
        while (paper < mountain) {
            paper *= 2;
            System.out.println(paper);
            num++;
        }

        System.out.println("所需要的次数 : " + num);


        int num_ = 0;
        for (double paper_ = 0.1; paper_ < mountain; paper_ *= 2) {
            System.out.println(paper_);
            num_++;
        }
        System.out.println("所需要的次数 : " + num_);

    }
}

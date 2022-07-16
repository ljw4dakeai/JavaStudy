package com.ljw4dakeai.Search;

import java.util.ArrayList;
import java.util.List;

public class Seq_Search {
    public static void main(String[] args) {
        int[] array = {1, 4, 4, -1, 7, 9, -20}; //无序数组
//        int Index = seq_Search(array, 11);
//        if (Index == -1) {
//            System.out.println("没有找到该值");
//        } else {
//            System.out.println("找到了，下标为：" + Index);
//        }

        List<Integer> IndexList = seq_Search_(array,4);
        if (IndexList.isEmpty()){
            System.out.println("没有找到该值");
        }else {
            System.out.println("找到了，索引值为：" + IndexList);
        }

    }

    //线性查找，找到一个的，
    public static int seq_Search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> seq_Search_(int[] array, int value){
        ArrayList<Integer> Index = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                Index.add(i);
            }
        }
        if (Index.isEmpty()){
            return new ArrayList<>();
        }else {
            return Index;
        }
    }
}

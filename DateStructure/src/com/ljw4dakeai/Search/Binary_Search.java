package com.ljw4dakeai.Search;

import java.util.ArrayList;
import java.util.List;

public class Binary_Search {
    //必须是有序数组才能使用有序数组
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8};

//        int resIndex = binary_Search(array,0, array.length - 1, 6);
//        if (resIndex == -1) {
//            System.out.println("没有找到该值");
//        } else {
//            System.out.println("找到了，下标为：" + resIndex);
//        }
        List<Integer> resIndexList = binary_Search_(array,0,array.length - 1,8);

        if (resIndexList.isEmpty()){
            System.out.println("没有找到");
        }else {
            System.out.println("索引值为：" + resIndexList);
        }

    }

    public static int binary_Search(int[] array, int left, int right, int findValue){
        int mind = (left + right) / 2;
        int mindValue = array[mind];

        if (left > right){
            return -1;
        }

        if (findValue > mindValue){
            return binary_Search(array, mind + 1,right,findValue);
        }else if(findValue < mindValue){
            return binary_Search(array, left, mind - 1, findValue);
        }else {
            return mind;
        }
    }


    //1,找到了索引值后不要马上返回；
    //2,向索引值的扫描的方向接着扫描，把该元素的所有索引值加入到一个集合ArrayList中

    public static ArrayList<Integer> binary_Search_ (int[] array, int left, int right, int findValue){
        int mind = (left + right) / 2;
        int mindValue = array[mind];

        if (left > right){
            return new ArrayList<Integer>();
        }

        if (findValue > mindValue){
            return binary_Search_(array, mind + 1,right,findValue);
        }else if(findValue < mindValue){
            return binary_Search_(array, left, mind - 1, findValue);
        }else {
            ArrayList<Integer> resIndex =new ArrayList<Integer>();

            //向左
            int temp = mind - 1;
            while (temp >= 0 && array[temp] == findValue) {
                resIndex.add(temp);
                temp -= 1;
            }
            resIndex.add(mind);

            temp = mind + 1;
            while (temp <= array.length - 1 && array[temp] == findValue) {
                resIndex.add(temp);
                temp += 1;
            }
            return resIndex;
        }
    }
}

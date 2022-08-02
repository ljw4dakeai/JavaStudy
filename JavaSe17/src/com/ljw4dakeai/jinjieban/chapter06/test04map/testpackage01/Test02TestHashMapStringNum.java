package com.ljw4dakeai.jinjieban.chapter06.test04map.testpackage01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ZJH
 * @info 字符串出现的次数
 */
public class Test02TestHashMapStringNum {
    public static void main(String[] args) {
        System.out.println("请输入一行字符号");
        String s = new Scanner(System.in).nextLine();
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(characterIntegerHashMap.containsKey(s.charAt(i))){
                characterIntegerHashMap.put(s.charAt(i), characterIntegerHashMap.get(s.charAt(i)) + 1);
            }else {
                characterIntegerHashMap.put(s.charAt(i), 1);
            }
        }

        System.out.println(characterIntegerHashMap);



    }
}

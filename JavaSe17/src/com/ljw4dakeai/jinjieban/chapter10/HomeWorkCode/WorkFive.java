package com.ljw4dakeai.jinjieban.chapter10.HomeWorkCode;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author ZJH
 */
public class WorkFive {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkCode/csb.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkCode/csbCopy.txt"));
        ArrayList<String> strings = new ArrayList<>();
        List<String> orders = List.of("一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");

        String line;
        while ((line = bufferedReader.readLine()) != null){
            strings.add(line);
        }
        strings.sort(Comparator.comparingInt(value -> orders.indexOf(value.split("\\.")[0])));
        for (String string : strings) {
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

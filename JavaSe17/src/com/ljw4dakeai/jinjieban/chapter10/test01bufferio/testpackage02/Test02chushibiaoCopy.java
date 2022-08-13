package com.ljw4dakeai.jinjieban.chapter10.test01bufferio.testpackage02;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author ZJH
 */
public class Test02chushibiaoCopy {
    public static void main(String[] args) throws IOException {
        copyChushibiao(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test01bufferio/csb.txt"),
                new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test01bufferio/csbCopy.txt"));
    }

    public static void copyChushibiao(File copyFile, File toFile) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(copyFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFile));

        String line;
        ArrayList<String> lines = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }

        List<String> order = List.of("一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");
//        lines.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return order.indexOf(o1.split("\\.")[0]) -  order.indexOf(o2.split("\\.")[0])
//            }
//        });
        lines.sort(Comparator.comparingInt(o -> order.indexOf(o.split("\\.")[0])));
        lines.forEach(System.out::println);

        lines.forEach(val -> {
            try {
                bufferedWriter.write(val);
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

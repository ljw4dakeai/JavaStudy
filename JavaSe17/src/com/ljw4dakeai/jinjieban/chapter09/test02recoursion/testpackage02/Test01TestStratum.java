package com.ljw4dakeai.jinjieban.chapter09.test02recoursion.testpackage02;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author ZJH
 */
public class Test01TestStratum {
    public static void main(String[] args) {

        fileSearch(
                new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test02recoursion/testpackage02/searchFile/美女照片文件夹"),
                "女");
//        delDirectory(
//                new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test02recoursion/test" +
//                        "package02/fileDel")
//        );
    }

    public static int stratum(int n) {
        return n == 1 ? 1 : stratum(n - 1) * n;
    }

    public static int sum(int n) {
        return n == 1 ? 1 : sum(n - 1) + n;
    }

    public static int fbSum(int n) {
        return n == 1 || n == 2 ? 1 : fbSum(n - 1) + fbSum(n - 2);
/*        int result ;
        switch (n){
            case 1, 2 -> result = 1;
            default -> result = fbSum(n- 1) + fbSum(n -2);
        }
        return result;*/
    }


    public static int monkeyEatTaoTao(int day) {
        return day == 10 ? 1 : (monkeyEatTaoTao(day + 1) + 1) * 2;
    }


    /**
     * 文件搜索
     */
    public static void fileSearch(File directory, String searchValue) {
        Arrays.stream(Objects.requireNonNull(directory.listFiles())).forEach(
                file -> {
                    if (file.isFile()) {
                        if (file.getName().contains(searchValue)) {
                            System.out.println(file.getName());
                        }
                    } else {
                        fileSearch(file, searchValue);
                    }
                }
        );
    }


    public static void delDirectory(File directory) {
        Arrays.stream(Objects.requireNonNull(directory.listFiles())).forEach(
                file -> {
                    if (file.isFile()) {
                        boolean delete = file.delete();
                    } else {
                        delDirectory(file);
                    }
                }
        );
        boolean delete = directory.delete();
    }

}

package com.ljw4dakeai.JiChuBan.Chapter10;

/**
 * @author ZJH
 */
public class Test11StringBuilderReverse {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("zoujiahao AI ljw");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        String string = new String(" zoujiahao ai lijingwen");

        StringBuilder stringToBuilder = new StringBuilder(string);
        String builderToString = stringToBuilder.toString();


    }

}

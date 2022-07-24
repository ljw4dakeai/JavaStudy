package com.ljw4dakeai.jichuban.Chapter10;

/**
 * @author ZJH
 * @info replace的使用
 */
public class Test07StringReplace {
    public static void main(String[] args) {
        String string = "你是TMD是真的TMD小可爱, 你真是一个傻逼, 操 sb!";
//        System.out.println(string.replaceAll("TMD", "***"))



        String[] strings = new String[]{"TMD", "草", "tmd","sb", "SB", "傻逼", "你妈", "操"};
        for (String s : strings) {
            string = string.replaceAll(s, "***");
        }


        System.out.println(string);
    }
}

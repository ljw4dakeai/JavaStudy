package com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author ZJH
 * @info
 * 不管是不是真的有异常,  只要有风险就会报异常, 目的是提醒程序员不要写错
 */
public class Test03TestCompilingException {

    public static void main(String[] args) throws ParseException, FileNotFoundException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入一个日期!");
        simpleDateFormat.parse(new Scanner(System.in).nextLine());

        //对文件进行操作的异常
        //java: 未报告的异常错误java.io.FileNotFoundException; 必须对其进行捕获或声明以便抛出
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\software\\code\\java\\JavaStudy\\JavaSe17\\src\\com\\ljw4dakeai\\jinjieban\\chapter07\\test03exception\\testpackage01\\Test01TestRunTimeException.java");

    }
}

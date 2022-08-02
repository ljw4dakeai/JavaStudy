package com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01;

import java.util.Scanner;

/**
 * @author ZJH
 * @info
 * 运行时异常 : 直接改代码就可以
 * 如果改代码无法解决 使用 try {
 *      产生异常的代码
 * }  catch(异常类 e){
 *     处理异常代码
 * }
 *
 * 如果出现异常 , 处理之后还可以运行
 */
public class Test05TestDisposeExceptionRunning {
    public static void main(String[] args) {
        //环绕代码段 ctrl + alt + T
        //自定义 ctrl + alt + /
        while (true) {
            int price = 0;
            try {
                System.out.println("请输入苹果价格, 是一个整数!");
                Scanner scanner = new Scanner(System.in); //Scanner不要写在try外面
                price = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("你录入的数据格式不正确");
            }

            if(price >0 ){
                System.out.println("价格合法!");
                break;
            }else {
                System.out.println("价格不合法");
            }
        }

    }
}

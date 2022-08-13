package com.ljw4dakeai.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PolandNotation_Stack {
    public static void main(String[] args) {
        //先定义一个PolandNotation
        //（3+4）x 5 -6 = 3 4 + 5 * 6 -
        //为了方便，数字和符号使用空格隔开
        String suffixExpersion = "3 4 + 5 * 6 -";
        System.out.printf("后缀表达式: %s = %d\n", suffixExpersion, calulate(GetListString(suffixExpersion)));
        //1.将字符串放入一个数组中
        //2.将数组传给一个方法，这个方法配合栈，完成计算，对字符串一个一个操纵太慢了
    }

    //将后缀表达式，依次将数据和运算符放到数组中
    public static List<String> GetListString(String suffixExpersion){
        //将字符串分割
        String[] Split = suffixExpersion.split(" ");
        List<String> ArrayList = new ArrayList<String>();
        for (String ele : Split){
            ArrayList.add(ele);
        }
        return ArrayList;
    }

    //运算
    public  static int calulate(List<String> LS){
        //只需要一个栈
        Stack<String> stack = new Stack<String>();
        //遍历LS
        for(String item: LS){
            //正则表达式取出数据
            if(item.matches("\\d+")){
                //匹配的多位数
                stack.push(item);
            }else{
                //如果不是多位数。pop两个多位数再入栈
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                int res;
                if (item.equals("+")){
                    res = num1 + num2;
                }else if (item.equals("-")){
                    res = num2 - num1;
                }else if(item.equals("*")){
                    res = num1 * num2;
                }else if (item.equals("/")){
                    res = num2 / num1;
                }else {
                    throw new RuntimeException("运算符号有误");
                }
                //把res入栈
                stack.push(res + "");
            }
        }
        return Integer.parseInt(stack.pop());
    }
}

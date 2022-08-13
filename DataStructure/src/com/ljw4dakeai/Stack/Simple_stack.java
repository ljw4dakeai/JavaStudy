
//栈的使用规则

package com.ljw4dakeai.Stack;

import java.util.Stack;

public class Simple_stack {
    public static void main(String[] args) {
        //建立一个栈
        Stack<String> stack = new Stack();
        //入栈
        stack.add("jack");
        stack.add("tom");
        stack.add("smith");
        //出栈
        while (stack.size() > 0){
            System.out.println(stack.pop());
        }
    }
}

//栈的常用使用场景
//1.子程序的调用，相当有return
//2.处理递归调用
//3.表达式的转换，前缀表达式-中缀表达式
//4.二叉树的遍历
//5.深度优先算法 depth-first搜索法（图中）


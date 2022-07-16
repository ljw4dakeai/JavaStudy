package com.ljw4dakeai.Stack;

import java.util.Scanner;

public class Array_Stack {
    public static void main(String[] args) {
        //新建一个栈
        ArrayStack arrayStack = new ArrayStack(5);
        //做一个菜单
        String key = "";
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.println("show：显示栈");
            System.out.println("exit：退出栈");
            System.out.println("push：入栈");
            System.out.println("pop：出栈");
            System.out.println("请输入你的选择！");
            key = scanner.next();
            switch (key){
                case "show":
                    arrayStack.show();
                    break;
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                case "push":
                    System.out.println("请输入你要添加的值！");
                    int  value = scanner.nextInt();
                    arrayStack.push(value);
                    break;
                case "pop":
                    try {
                        int res = arrayStack.pop();
                        System.out.printf("出栈的数据为%d\n", res);
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");

    }
}
class ArrayStack{
    private int maxsize;//栈的大小
    private int[] stack;//数组模拟栈,数据放在该数组中
    private int top = -1;//栈顶，初始没有数据为-1
    //构造
    public ArrayStack(int maxsize){
        this.maxsize = maxsize;
        stack = new int[this.maxsize];
    }
    //栈满
    public boolean isFull(){
        return top == maxsize - 1;
    }
    //栈空
    public boolean isEmpty(){
        return top == -1;
    }

    //入栈push
    public void push(int value){
        //先判断栈是否为满
        if(isFull()){
            System.out.println("栈满，无法加入数据！");
            return;
        }
        top++;
        stack[top] = value;
    }

    //出栈
    public int pop(){
        //先判断栈是否为空
        if(isEmpty()){
            //有返回值，抛出异常
            throw new RuntimeException("栈空，无法取出数据");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //遍历栈
    //遍历时需要从栈顶开始显示
    public void show(){
        if(isEmpty()){
            System.out.println("栈空，无法显示数据");
            return;
        }
        for (int i = top; i>=0 ; i--){
            System.out.printf("stack[%d]=%d\n", i, stack[i] );
        }
    }
}

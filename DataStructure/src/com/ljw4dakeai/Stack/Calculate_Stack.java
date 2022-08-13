package com.ljw4dakeai.Stack;
//中缀表达式

//不好识别括号，不好使用，一般会转换成后缀表达式

import java.util.Scanner;

public class Calculate_Stack {
    public static void main(String[] args) {
        //菜单
        System.out.println("计算器");
        Scanner scanner = new Scanner(System.in);
        String key = "";//接受用户输入
        String Expersion = "";
        boolean loop = true;
        while (loop) {
            System.out.println("start:开始");
            System.out.println("exit:结束");
            key = scanner.next();
            switch (key) {
                case "start":
                    System.out.println("请输入表达式（中缀表达式，不可以使用括号）");
                    String value = scanner.next();
                    Expersion = value;
                    System.out.printf("表达式%s = %d\n",Expersion,show(Expersion));
                    System.out.println();
                    break;
                case "exit":
                    loop = false;
                    scanner.close();
                    System.out.println("本次计算机结束，谢谢使用");
                    break;
                default:
                    break;
            }
        }
    }

    //显示结果
    public static int show(String Expersion){
        //完成表达式的运算
        //创建栈
        //数据栈
        CalculateStack numStack = new CalculateStack(10);
        //符号栈
        CalculateStack operStack = new CalculateStack(10);
        //用于扫描
        int index = 0; //扫描运算式
        int num1;
        int num2;
        int oper;
        int res;
        char  ch = ' '; //每次扫面的字符保存到ch里
        String keepnumber = ""; //用于拼接多位数的
        //while扫面Expersion
        while(true){
            //拿到字符
            ch = Expersion.substring(index,index + 1).charAt(0);
            //判断ch是什么
            if (operStack.isOper(ch)){
                //判断当前符号栈是不是空
                if(!operStack.isEmpty()){
                    //比较优先级
                    //如何优先级大于原来栈中的优先级，则入栈
                    //如果优先级小于或等于栈中的优先级，则从数栈中pop出两个数字，再从符号栈中pop一个运算符进行运算
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())){
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1, num2, oper);
                        //运算结果入栈
                        numStack.push(res);
                        //把当前运算符号入栈
                        operStack.push(ch);
                    }else {
                        //入栈
                        operStack.push(ch);
                    }
                }else {
                    operStack.push(ch);
                }
                }else {
                //numStack.push(ch - 48); //ASCII字符1和数字1相差48，不能直接压入字符
                //1.当处理一个数时，不能直接入栈，因为可能是多位数
                //2.再处理数，需要向Expersion表达式的index再多看一位，如果是数就扫描，如果是符号就入栈
                //3.定义一个字符串变量，用于拼接

                //处理多位数
                keepnumber += ch;

                //如果ch是表达式的最后以为则直接入栈
                if(index == Expersion.length()-1){
                    numStack.push(Integer.parseInt(keepnumber));
                }else {

                    //判断下一个是不是数字，如果是数字继续扫描，如果是运算符就入栈
                    if (operStack.isOper(Expersion.substring(index + 1, index + 2).charAt(0))) {
                        //后一位是操作符，入栈
                        numStack.push(Integer.parseInt(keepnumber));
                        //注意清空keepnumber，不然会在原来基础上添加
                        keepnumber = "";
                    }
                }
            }
            //index+1，并且判断是否扫描到Expersion最后
            index++;
            if (index >= Expersion.length()){
                break;
            }
        }
        //扫描完毕，顺序pop出数栈和符号栈中的数据运算，最后运算的结果放入数栈
        while(true){
            //如果为空，运算结束，数栈中只有一个数
            if (operStack.isEmpty()){
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);//入栈
        }
        int i = numStack.pop();
        return i;
    }
}

//先创建一个栈，使用前面创建好的
class CalculateStack{
    private int maxsize;//栈的大小
    private int[] stack;//数组模拟栈,数据放在该数组中
    private int top = -1;//栈顶，初始没有数据为-1
    //构造
    public CalculateStack(int maxsize){
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
    //显示栈顶,不出栈
    public int peek(){
        return stack[top];
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

    //返回运算符的优先级，根据我们自己来确定
    //优先级使用数字表示，数字越大，优先级越高
    public int priority(int oper){
        //假设只有加减乘除
        if (oper == '*' || oper == '/'){
            return 1;
        }else if (oper == '+' || oper == '-'){
            return 0;
        }else {
            return -1;
        }
    }

    //判断是不是一个运算符
    public boolean isOper(char val){
        return val == '*' || val == '/' || val == '+' || val == '-';
    }

    //运算方法
    public int cal(int num1, int num2, int oper){
        //用于存放数据结果
        int res = 0;
        switch (oper) {
            case '+' :
                res = num1 + num2;
                break;
            case '-' :
                res = num2 - num1;
                break;
            case '*' :
                res = num1 * num2;
                break;
            case '/' :
                res = num2 / num1;
                break;
            default :
        }
        return res;
    }
}

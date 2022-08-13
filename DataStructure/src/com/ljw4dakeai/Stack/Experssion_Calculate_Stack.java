package com.ljw4dakeai.Stack;
//中缀转后缀白表达式的计算
/*
1、初始化两个栈:运算符栈s1和储存中间结果的栈s2;
2、从左至右扫描中缀表达式;
3、遇到操作数时，将其压s2;
4、遇到运算符时，比较其与s1栈顶运算符的优先级:
	1.如果s1为空，或栈顶运算符为左括号“(”，则直接将此运算符入栈;
	2.否则，若优先级比栈顶运算符的高，也将运算符压入s1;
	3.否则，将s1栈顶的运算符弹出并压入到s2中，再次转到(4.1)与s1中新的栈顶运算符相比较;
5、遇到括号时:
	1.如果是左括号“(”，则直接压入s1
	2.如果是右括号“)”，则依次弹出s1栈顶的运算符，并压入s2,直到遇到左括号为止，此时将这一对括号丢弃
6、重复步骤2至5，直到表达式的最右边
7、将s1中剩余的运算符依次弹出并压入s2
8、依次弹出s2中的元素并输出
结果的逆即为中缀表达式对应的后缀表达式
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Experssion_Calculate_Stack {
    public static void main(String[] args) {
        //直接对字符串扫描不方便，将字符串转换成一个ArrayList
        String expersion = "1+((2+3)*4)-5";
        System.out.printf("原来的表达式:%s\n中缀表达式:%s\n后缀表达式:%s\n",expersion,toInFixexpersion(expersion),parseSuffixExperssionList(toInFixexpersion(expersion)));
        //System.out.println(parseSuffixExperssionList(toInFixexpersion(expersion)));
        System.out.printf("计算结果为:%d\n",calulate(parseSuffixExperssionList(toInFixexpersion(expersion))));


    }
    //将中缀表达转换成对应的List
    public static List<String> toInFixexpersion(String s){
        List<String> ls = new ArrayList<String>();
        int i = 0; //遍历表达式
        String str;//对多位数的拼接
        char ch; //每次遍历一个字符就放入ch中
        do{
            //如果ch不是一个数字，就需要加入到ls中
            if ((ch = s.charAt(i)) < 48 || (ch = s.charAt(i)) >57){
                ls.add(""+ch);
                i++;//i需要后移
            }else {
                //如果是一个数需要考虑多位数的问题
                //先将str置成空串
                str = "";
                while (i < s.length() && (ch = s.charAt(i)) >= 48 && (ch = s.charAt(i)) <= 57){
                    //是多位数就拼接
                    str += ch;
                    i++;
                }
                ls.add(str);

            }

        }while(i < s.length());
        return ls;
    }

    //将中缀表达式对应的list,转换为后缀表达式对应的list
    /*
    1、初始化两个栈:运算符栈s1和储存中间结果的栈s2;
    2、从左至右扫描中缀表达式;
    3、遇到操作数时，将其压s2;
    4、遇到运算符时，比较其与s1栈顶运算符的优先级:
	    1.如果s1为空，或栈顶运算符为左括号“(”，则直接将此运算符入栈;
	    2.否则，若优先级比栈顶运算符的高，也将运算符压入s1;
	    3.否则，将s1栈顶的运算符弹出并压入到s2中，再次转到(4.1)与s1中新的栈顶运算符相比较;
    5、遇到括号时:
	    1.如果是左括号“(”，则直接压入s1
	    2.如果是右括号“)”，则依次弹出s1栈顶的运算符，并压入s2,直到遇到左括号为止，此时将这一对括号丢弃
    6、重复步骤2至5，直到表达式的最右边
    7、将s1中剩余的运算符依次弹出并压入s2
    8、依次弹出s2中的元素并输出
    结果的逆即为中缀表达式对应的后缀表达式
    */
    public static List<String> parseSuffixExperssionList(List<String> ls){
        //定义两个栈,但是有一个栈从来不弹出数据，而且最后要逆序输出，所以可以用一个数组实现
        Stack<String> singalStack = new Stack<String>();
        List<String> s2 = new ArrayList<String>();
        //遍历ls
        for (String item:ls){
            //遇到操作数时，将其压s2;
            if (item.matches("\\d+")){
                s2.add(item);
            } else if (item.equals("(")) {
                singalStack.push(item);
            }else if(item.equals(")")){
                while (!singalStack.peek().equals("(")){
                    //如果是右括号“)”，则依次弹出s1栈顶的运算符，并压入s2,直到遇到左括号为止，此时将这一对括号丢弃
                    s2.add(singalStack.pop());
                }
                //将向左的小括号弹出，消除小括号
                singalStack.pop();
            }else {
                //当item的优先级小于等于栈顶运算符的优先级的时候
                //将s1栈顶的运算符弹出并压入到s2中，再次转到(4.1)与s1中新的栈顶运算符相比较
                while (singalStack.size() != 0 && Operation.Getvalue(singalStack.peek()) >= Operation.Getvalue(item)){
                    s2.add(singalStack.pop());
                }
                //最后还需要item压入栈中
                singalStack.push(item);
            }
        }
        while (singalStack.size() != 0){
            s2.add(singalStack.pop());
        }
        //因为list和栈不相同，就是逆序输出
        return s2;
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

//编写一个类，返回运算符对应的优先级
class Operation{
    private static int ADD = 1; //加
    private static int SUB = 1; //减
    private static int MUL = 2; //乘
    private static int DIV = 2; //除

    public static int Getvalue(String operation){
        int result = 0;
        switch (operation){
            case "+":
                result = ADD;
                break;
            case "-":
                result = SUB;
                break;
            case "*":
                result = MUL;
                break;
            case "/":
                result = DIV;
                break;
            default:
                //System.out.println("运算符不存在，输入错误");
                break;
        }
        return result;
    }
}

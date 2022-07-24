package com.ljw4dakeai.jichuban.Chapter07.HomeWorkCode;

/**
 * @author ZJH
 * @info
定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。

### 训练提示

1. 根据题意，方法中需要使用三个整数，所以方法参数应该是三个整数类型。
2. 方法需要有返回值，返回值的类型也是整数类型。

### 解题方案

### 操作步骤

1. 定义方法getMax()，方法的参数是三个int类型变量a,b,c，方法的返回值是int类型。
2. 在方法中使用多分支if...else...判断出最大值并返回。
3. 在主方法中调用getMax()方法并接受返回值。
4. 在主方法中打印结果。

 */
public class PracticeTwo {
    public static void main(String[] args) {
        System.out.println(getMax(40, 20, 30));

    }


    public static int getMax(int a, int b, int  c){
        return a>b && a > c ? a : (b >c ? b : c);
    }
}

package com.ljw4dakeai.Queue;

import java.util.Scanner;

//使用数组模拟对列

/*不是环形队列，数组没有取模，数组只能用一次*/
/*不是环形队列，数组没有取模，数组只能用一次*///所以这个数组只能用一次,没有达到复用的效果
/*不是环形队列，数组没有取模，数组只能用一次*/
//  优化：对数组使用算法-->改进成为一个环形队列（取模实现）

public class Array_queue {
    public static void main(String[] args) {
        //测试
        System.out.println("数组模拟环非形队列测试");
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';//接受用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop =true;
        while (loop){
            System.out.println("--------------------------");
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):推出程序");
            System.out.println("a(add):添加数据到对列中");
            System.out.println("o(out):从队列中取出数据");
            System.out.println("c(chick):查看队列的头部数据");
            System.out.println("--------------------------");
            System.out.print("请输入英文：");
            key = scanner.next().charAt(0);//接受一个字符
            switch (key){
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.print("请输入一个数：");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'o':
                    try {
                            int res = arrayQueue.outQueue();
                            System.out.printf("取出的数据为%d\n", res);
                    }catch (Exception e){
                        //TODO :handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'c':
                     try {
                            int res = arrayQueue.chickQueue();
                            System.out.printf("队列的头部数据是%d\n",res);
                     }catch (Exception e){
                         //TODO :handle exception
                         System.out.println(e.getMessage());
                     }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}
//编写一个ArrayQueue的一个类
class ArrayQueue{
    private int max_size;  //数组最大容量
    private int front; //数据的前一个位置，队列头的前一个位置，不是队列的第一个数据
    private int rear; //数据的尾部位置，队列尾部的位置，就是队列最后一个数据
    private int[] arr; //模拟队列，存放数据

    //创建队列构造器
    public ArrayQueue(int Max_size){
        max_size = Max_size;
        arr = new int[max_size];
        front = -1; //数据的前一个位置，队列头的前一个位置，不是队列的第一个数据
        rear =  -1; //数据的尾部位置，队列尾部的位置，就是队列最后一个数据

    }
    //定义一个判断为满的方法，判断队列是否为满
    public boolean isFull(){
        return rear == max_size -1;
    }
    //定义一个判断为空的方法，判断队列是否为空
    public boolean isEmpty(){
        return rear == front;
    }
    //定义一个添加数据的方法，添加数据
    public void addQueue(int n){
        //判断队列是否满
        if(isFull()){
            System.out.println("队列满，不可以加入数据");
            return;
        }
        rear++;//rearr后移
        arr[rear] = n;
    }
    //取出数据
    public int outQueue(){
        //判断是否为空
        if(isEmpty()){
            //通过抛出异常处理
            throw new RuntimeException("队列空，不可以取数据"); //throw 也会马上返回，不需要return
        }
        front++; //fron后移
        return arr[front];
    }
    //显示队列数据
    public void showQueue(){
        //遍历
        if(isEmpty()){
            System.out.println("队列为空，没有数据");
            return;
        }
        for (int i=0; i<arr.length; i++){
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }
    //显示队列的头数据，不是取数据
    public int chickQueue(){
        //判断
        if(isEmpty()){
            throw new RuntimeException("队列空;没有数据");
        }
        return arr[front+1];
    }

}
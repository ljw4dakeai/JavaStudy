//对Array
package com.ljw4dakeai.Queue;

import java.util.Scanner;

public class Circle_Array_queue {
    public static void main(String[] args) {
        System.out.println("数组模拟环形队列测试");
        //环形队列
        CircleArray Circle_arrayQueue = new CircleArray(4);//队列的有效数据为max_size-1
        char key = ' ';//接受用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("--------------------------");
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):推出程序");
            System.out.println("a(add):添加数据到对列中");
            System.out.println("o(out):从队列中取出数据");
            System.out.println("c(chick):查看队列的头部数据");
            System.out.println("--------------------------");
            System.out.print("请输入英文：");
            key = scanner.next().charAt(0);//接受一个字符
            switch (key) {
                case 's':
                    Circle_arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.print("请输入一个数：");
                    int value = scanner.nextInt();
                    Circle_arrayQueue.addQueue(value);
                    break;
                case 'o':
                    try {
                        int res = Circle_arrayQueue.outQueue();
                        System.out.printf("取出的数据为%d\n", res);
                    } catch (Exception e) {
                        //TODO :handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'c':
                    try {
                        int res = Circle_arrayQueue.chickQueue();
                        System.out.printf("队列的头部数据是%d\n", res);
                    } catch (Exception e) {
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

class CircleArray {
    private int max_size;


    private int front;
    //ArrayQueue:数据的前一个位置，队列头的前一个位置-->CircleArray:队列的第一个元素，队列的头
    private int rear;
    //ArrayQueue:数据的尾部位置，队列尾部的位置-->CircleArray:队列尾部的后一个位置，空出一个位置做约定
    private int[] arr;
    //ArrayQueue:模拟队列，存放数据-->CircleArray:无变化

    public CircleArray(int Max_size) {
        max_size = Max_size;
        arr = new int[max_size];
        front = 0; //队列的第一个元素，队列的头
        rear = 0; //队列尾部的后一个位置，空出一个位置做约定
    }

    //判断是否为满
    public boolean isFull() {
        return (rear + 1) % max_size == front;
    }

    //判断是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //添加数据
    public void addQueue(int n) {
        //判断是否为满
        if (isFull()) {
            System.out.println("队列满，不可以加入数据");
            return;
        }
        //直接加入数据
        arr[rear] = n;
        //取%，让rare到前面
        rear = (rear + 1) % max_size;
    }

    //取出数据
    public int outQueue() {
        //判断是否为空
        if (isEmpty()) {
            //通过抛出异常处理
            throw new RuntimeException("队列空，不可以取数据"); //throw 也会马上返回，不需要return
        }
        //front指向队列的第一个元素
        //1.先把front保存到一个临时变量
        int value = arr[front];
        //2.将front后移,也需要考虑越界，所以需要取%
        front = (front + 1) % max_size;
        //3.将临时保存的变量返回
        return value;
    }

    //显示数组
    public void showQueue() {
        //遍历
        if (isEmpty()) {
            System.out.println("队列为空，没有数据");
            return;
        }
        //需要从front开始遍历，取出后遍历前面的数据没有意义；(环形的，所以取%)
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % max_size, arr[i % max_size]);
        }
    }

    //当前有效数据的个数
    public int size() {
        return (rear + max_size - front) % max_size;
    }

    //显示队列的头数据，不是取数据
    public int chickQueue() {
        //判断
        if (isEmpty()) {
            throw new RuntimeException("队列空;没有数据");
        }
        return arr[front];
    }
}
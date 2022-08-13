package com.ljw4dakeai.Tree;

public class ArrayBinaryTree {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7,};
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(array);
        arrBinaryTree.preOrder();
        arrBinaryTree.infixOrder();
        arrBinaryTree.postOrder();
    }
}

class ArrBinaryTree{
    private int[] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    //重载

    public void preOrder(){
        System.out.println("先序遍历");
        preOrder(0);
        System.out.println();
    }

    public void infixOrder(){
        System.out.println("中序遍历");
        infixOrder(0);
        System.out.println();
    }

    public void postOrder(){
        System.out.println("后续遍历");
        postOrde(0);
        System.out.println();
    }

    //编写方法，实现顺序存储二叉树二前序遍历
    public void preOrder(int index){
        //index数组下标
        if (arr == null || arr.length == 0){
            System.out.println("数组为空，无法遍历");
        }
        //输出当前元素
        System.out.print(arr[index] + "\t");
        //向左递归
        //不能越界
        if ((index * 2 + 1) < arr.length){
            preOrder(2 * index + 1);
        }
        //向右递归
        if ((index * 2 + 2) < arr.length){
            preOrder(index * 2 + 2);
        }
    }

    //中序遍历
    public void infixOrder(int index){
        //index数组下标
        if (arr == null || arr.length == 0){
            System.out.println("数组为空，无法遍历");
        }
        //向左递归
        //不能越界
        if ((index * 2 + 1) < arr.length){
            infixOrder(2 * index + 1);
        }
        //输出当前元素
        System.out.print(arr[index] + "\t");
        //向右递归
        if ((index * 2 + 2) < arr.length){
            infixOrder(index * 2 + 2);
        }
    }

    //后续遍历
    public void postOrde(int index){
        //index数组下标
        if (arr == null || arr.length == 0){
            System.out.println("数组为空，无法遍历");
        }
        //向左递归
        //不能越界
        if ((index * 2 + 1) < arr.length){
            postOrde(2 * index + 1);
        }
        //向右递归
        if ((index * 2 + 2) < arr.length){
            postOrde(index * 2 + 2);
        }
        //输出当前元素
        System.out.print(arr[index] + "\t");
    }



}

package com.ljw4dakeai.Tree.HaffmanTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HaffmanTree{
    public static void main(String[] args) {
        int[] array = {13, 7, 8, 3, 29, 6, 1};

        Node root = createHuffmanTree(array);
        preOrder(root);

    }
    //前序遍历显示方法
    public static void preOrder(Node root){
        if (root != null){
            root.preOrder();
        }else {
            System.out.println("空树无法遍历");
        }
    }

    //创建构造霍夫曼树
    public static Node createHuffmanTree(int[] array){

        //1、遍历数组
        //2、将每一个元素构造成为一个Node
        //3、将Node放入到AraayList中
        List<Node> nodes = new ArrayList<Node>();
        for (int value : array){
            nodes.add(new Node(value));
        }

        while (nodes.size() > 1){
            Collections.sort(nodes);

            //取出权值最小的节点
            Node leftNode = nodes.get(0);
            //取出权值第二小的
            Node rightNode = nodes.get(1);
            //建立一个新的二叉树
            Node parent = new Node(leftNode.value + rightNode.value);

            parent.left = leftNode;
            parent.right = rightNode;

            //从arraylist中删除处理过的二叉树

            nodes.remove(leftNode);
            nodes.remove(rightNode);

            //将新构建的二叉树加入到

            nodes.add(parent);

            Collections.sort(nodes);
        }

        return nodes.get(0);

    }
}

//节点类

 class Node implements Comparable<Node> {
     int  value;
     Node left; //左子节点
     Node right; //右子节点

     public Node(int value) {
         this.value = value;
     }

     @Override
     public String toString() {
         return "Node[" +
                 "value=" + value +
                 ']';
     }

     //为了让Node支持排序，需要让Node类时间comparable接口

     @Override
     public int compareTo(Node o) {
         //从小到达排序
         return this.value - o.value;
//         从大到小排序
//         return - (this.value - o.value);
     }


     public void preOrder(){
         System.out.println(this);
         if (this.left != null){
             this.left.preOrder();
         }

         if (this.right != null){
             this.right.preOrder();
         }
     }
 }
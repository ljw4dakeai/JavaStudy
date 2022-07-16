package com.ljw4dakeai.Tree;

public class BinaryTree_node {
    public static void main(String[] args) {
        //创建树
        BinaryTree binarytree = new BinaryTree();

        HeroNode root = new HeroNode(1, "宋江");
        HeroNode node1 = new HeroNode(2, "吴用");
        HeroNode node2 = new HeroNode(3, "卢俊义");
        HeroNode node3 = new HeroNode(4, "林冲");
        HeroNode node4 = new HeroNode(5, "关胜");

        //手动创建，该二叉树
        binarytree.setRoot(root);
        root.setLeft(node1);
        root.setRight(node2);
        node2.setRight(node3);
        node2.setLeft(node4);

        //测试前序遍历
        System.out.println("前序遍历");
        binarytree.preOrder();

        System.out.println("____________________________________________________________________________________________");

        //测试中序遍历
        System.out.println("中序遍历");
        binarytree.infixOrder();

        System.out.println("____________________________________________________________________________________________");

        //测试后续遍历
        System.out.println("后续遍历");
        binarytree.postOrder();

        System.out.println("____________________________________________________________________________________________");

        HeroNode resNode = binarytree.postOrderSearch(5);
//        binarytree.infixOrderSerach(7);
//        binarytree.preOrderSearch(4);
        if (resNode != null){
            System.out.printf("success:\nno = %d ,neme = %s", resNode.getNo(), resNode.getName());
        }else {
            System.out.printf("fill:\nno = %d:", 5);
        }


        System.out.println("____________________________________________________________________________________________");

        //测试删除
        binarytree.NodeDel(4);
        System.out.println("____________________________________________________________________________________________");
        System.out.println("删除后的后续遍历");
        binarytree.postOrder();

    }
}

//定义二叉树
class BinaryTree{
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    //前序遍历，调用heronode中的
    public void preOrder(){
        if (this.root != null){
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空，为空，无法遍历");
        }
    }
    public HeroNode preOrderSearch(int no){
        if (root != null){
            return root.preOrderSearch(no);
        }else {
            return null;
        }
    }

    //中序边炉
    public void infixOrder(){
        if (this.root != null){
            this.root.infixOrder();
        }else {
            System.out.println("二叉树为空，为空，无法遍历");
        }
    }
    public HeroNode infixOrderSerach(int no){
        if (root != null){
            return root.infixOrderSearch(no);
        }else {
            return null;
        }
    }

    //后序遍历
    public void postOrder(){
        if (this.root != null){
            this.root.postOrder();
        }else {
            System.out.println("二叉树为空，为空，无法遍历");
        }
    }
    public HeroNode postOrderSearch(int no){
        if (root != null){
            return root.postOrderSearch(no);
        }else {
            return null;
        }
    }


    //删除节点
    public void NodeDel(int no){
        if (root != null){
            if (root.getNo() ==  no ){
                root = null;
            }else {
                root.NodeDel(no);
            }
        }else {
            System.out.println("二叉树为空，无法删除");
        }
    }

}



class HeroNode {
    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }


    @Override
    public String toString() {
        return "HeroNode[" +
                "no=" + no +
                ", name='" + name + '\'' +
                ']';
    }


    //前序遍历
    public void preOrder(){
        System.out.println(this);
        //递归左子树
        if (this.left != null){
            this.left.preOrder();
        }
        //递归右子树
        if (this.right != null){
            this.right.preOrder();
        }
    }
    public HeroNode preOrderSearch(int no){
        System.out.println("进入前序遍历");
        //比较当前节点是不是
        if (this.no == no){
            return this;
        }
        //判断左子节点是不是空
        //如果找到了就返回
        HeroNode resNode = null;
        if (this.left != null){
            resNode = this.left.preOrderSearch(no);
        }if (resNode != null){
            return resNode;
        }
        //判断右子节点是不是空
        if (this.right != null){
            resNode = this.right.preOrderSearch(no);
        }
        return resNode;
    }

    //中序遍历
    public void infixOrder(){
        //递归左子树中序遍历
        if (this.left != null){
            this.left.infixOrder();
        }
        //输出父节点

        System.out.println(this);

        //递归右子树
        if (this.right != null){
            this.right.infixOrder();
        }
    }
    public HeroNode infixOrderSearch(int no){
        //判断左子节点是不是空，如果不为空，递归中序查找
        HeroNode resNode = null;
        if (this.left != null){
            resNode = this.left.infixOrderSearch(no);
        }
        if (resNode != null){
            return resNode;
        }
        //找到就返回，没有找到就继续比较
        System.out.println("进入中序遍历");
        if (this.no == no){
            return this;
        }
        //进行右递归查找
        if (this.right != null){
            resNode = this.right.infixOrderSearch(no);
        }
        return resNode;
    }

    //后序遍历
    public void postOrder() {
        //递归左子树
        if (this.left != null ){
            this.left.postOrder();
        }

        //递归递归右子树
        if (this.right != null){
            this.right.postOrder();
        }

        //输出父节点
        System.out.println(this);
    }
    public HeroNode postOrderSearch(int no){
        HeroNode resNode = null;
        if (this.left != null){
            resNode = this.left.postOrderSearch(no);
        }
        if (resNode != null){
            return resNode;
        }

        //如果左子树没有找到，就右子树，递归遍历查找
        if (this.right != null){
            resNode = this.right.postOrderSearch(no);
        }
        if (resNode != null){
            return resNode;
        }

        //如果左右子树都没有找到
        System.out.println("进入后序遍历");
        if (this.no == no){
            return this;
        }
        return resNode;
    }


    //删除节点
    public void NodeDel(int no){
        //判断左子节点是不是要删除的
        if (this.left != null && this.right.no == no){
            this.left = null;
            return;
        }
        if (this.right != null && this.right.no == no){
            this.right = null;
            return;
        }
        //如果没有完成，就需要递归左子树
        if (this.left != null){
            this.left.NodeDel(no);
        }

        //左子树也没有完成，递归右子树
        if (this.right != null){
            this.right.NodeDel(no);
        }



    }
}

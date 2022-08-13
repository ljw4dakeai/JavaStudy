package com.ljw4dakeai.Tree.Threded;

public class ThreadedBinaryTree_node {
    public static void main(String[] args) {
        //测试中序线索化二叉树
        HeroNode root = new HeroNode(1,"1");
        HeroNode heroNode2 = new HeroNode(3,"3");
        HeroNode heroNode3 = new HeroNode(6,"6");
        HeroNode heroNode4 = new HeroNode(8,"8");
        HeroNode heroNode5 = new HeroNode(10,"10");
        HeroNode heroNode6 =new HeroNode(14,"14");


        root.setLeft(heroNode2);
        root.setRight(heroNode3);
        heroNode2.setLeft(heroNode4);
        heroNode2.setRight(heroNode5);
        heroNode3.setLeft(heroNode6);

        ThreadedBinaryTree threadedBinaryTree = new ThreadedBinaryTree();
        threadedBinaryTree.setRoot(root);
        threadedBinaryTree.threadedNodes();

        //以10号节点测试
        HeroNode leftNode = heroNode5.getLeft();
        System.out.println(heroNode5.getNo() + "的前驱节点是:" + leftNode);

        HeroNode rightNode = heroNode5.getRight();
        System.out.println(heroNode5.getNo() + "的后继节点是:" + rightNode);

        System.out.println("使用线索化遍历线索化二叉树");
        threadedBinaryTree.threadedListt();




    }
}



//定义二叉树
class ThreadedBinaryTree{
    private HeroNode root;
    private HeroNode pre  = null;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

/*=====================================================================================================================*/

   //重载线索化
    public void threadedNodes(){
        this.threadedNodes(root);
    }

    //编写对二叉树，进行中序线索化遍历


    //遍历线索化二叉树

    public void threadedListt(){

        HeroNode node = root;

        //找到特殊节点
        while (node != null){
            //循环找到，lt = 1的节点，后面会变化
            //当leftttype= 1的时候，说明，该节点是按照线索化处理的有效节点
            while (node.getLeftType() ==  0){
                node = node.getLeft();
            }
            System.out.println(node);

            //如果当前节点的右指针是不是指向后继节点

            while(node.getRightType() == 1){
                //获取到当前节点的后继节点
                node = node.getRight();
                System.out.println(node);
            }
            //替换遍历节点
            node = node.getRight();
        }
    }

    public void threadedNodes(HeroNode heroNode){
        if (heroNode == null){
            return;
        }

        //先线索化左子树
        //线索化当前节点
        //线索化右子树
        threadedNodes(heroNode.getLeft());
        //处理当前节点的前驱节点
        if (heroNode.getLeft() == null){
            //让当前节点的左指针指向前驱节点
            heroNode.setLeft(pre);
            heroNode.setLeftType(1);
        }
        //处理后继节点
        if (pre != null && pre.getRight() == null){
            //让前驱节点的右指针指向当前节点
            pre.setRight(heroNode);
            pre.setRightType(1);
        }
        //处理一个节点，让当前节点是下一个节点的前驱节点；不写会断掉
        pre = heroNode;
        threadedNodes(heroNode.getRight());

    }

/*=====================================================================================================================*/

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
/*=====================================================================================================================*/
    private int leftType;
    //0表示子树，1表示前驱节点，后续节点
    private int rightType;
/*=====================================================================================================================*/

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

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
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

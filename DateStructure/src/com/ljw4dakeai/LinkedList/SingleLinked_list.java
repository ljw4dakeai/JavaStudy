package com.ljw4dakeai.LinkedList;

import java.util.Stack;

public class


SingleLinked_list {
    public static void main(String[] args) {
        //测试
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江","及时雨");
        HeroNode hero2 = new HeroNode(2, "小卢","小子");
        HeroNode hero3 = new HeroNode(3, "吴用","智多星");
        HeroNode hero4 = new HeroNode(4, "公孙胜","入云龙");
        HeroNode hero5 = new HeroNode(5, "关胜","大刀");
        HeroNode hero6 = new HeroNode(6, "林冲","智多星");

        //创建一个链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        SingleLinkedList singleLinkedList_two = new SingleLinkedList();

        //加入
        //固定顺序加入
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero5);
        singleLinkedList.addByOrder(hero6);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList_two.addByOrder(hero3);
        singleLinkedList_two.addByOrder(hero4);

        //输入顺序加入
        //singleLinkedList.add(hero2);
        //singleLinkedList.add(hero1);
        //singleLinkedList.add(hero4);
        //singleLinkedList.add(hero3);

        //显示
        System.out.println("初始链表为：");
        System.out.println("初始链表一为为：");
        singleLinkedList.show();
        System.out.println("初始链表二为为：");
        singleLinkedList_two.show();

        //修改测试
        HeroNode newHeroNode = new HeroNode(2,"卢俊义", "玉麒麟");
        singleLinkedList.update(newHeroNode);
        System.out.println();
        System.out.println("修改后的链表为：");
        singleLinkedList.show();

        //测试链表的逆序输出
        System.out.println();
        System.out.println("逆序输出的链表为：");
        reverseprint(singleLinkedList.getHead());

        //测试findLastindexnode（倒数第k个节点）
        HeroNode res = findLastIndexnode(singleLinkedList.getHead(), 2);
        System.out.println();
        System.out.println("倒数第k个节点为：");
        System.out.println("res"+res);

        //测试单链表的反转
        reversList(singleLinkedList.getHead());
        System.out.println();
        System.out.println("反转后的链表为：");
        singleLinkedList.show();

        //有效节点个数显示
        System.out.println();
        System.out.println("有效节点的个数为："+getlength(singleLinkedList.getHead()));

        //删除测试
        singleLinkedList.del(1);
        singleLinkedList.del(5);
        System.out.println();
        System.out.println("删除后的链表为：");
        singleLinkedList.show();

        //测试节点个数
        System.out.println();
        System.out.println("有效节点的个数为"+getlength(singleLinkedList.getHead()));

        //链表一的显示
        System.out.println();
        System.out.println("链表一为：");
        singleLinkedList.show();

        //链表二为
        System.out.println();
        System.out.println("链表二为：");
        singleLinkedList_two.show();

        //合并链表
    }

    //获取单链表节点个数
    //带头结点的链表，需要不统计头节点
    public static int getlength(HeroNode head){
        if (head.next == null){
            return 0;
        }
        int length = 0;
        HeroNode cur = head.next;
        while (cur != null ){
            length++;
            cur = cur.next;
        }
        return length;
    }

    //查看倒数第k个节点
    //1.编写一个方法接受head节点，同时接受一个index
    //2.index，表示倒数index个节点
    //3.先遍历一下链表,得到链表总长度（getlength已经拿到了）
    //4.得到size后从头开始遍历到size-index
    //5.找到了就返回节点，没找到就返回空
    public static  HeroNode findLastIndexnode(HeroNode head ,int index){
        if (head.next == null){
            return null;
        }
        //第一次遍历，得到链表长度
        int size = getlength(head);
        //第二次遍历
        if (index<0 || index>size){
            return null;
        }
        HeroNode cur = head.next;
        for (int i=0; i<size-index; i++){
            cur = cur.next;
        }
        return cur;
    }

    //链表的反转
    public static void reversList(HeroNode head){
        //如果链表为空，或者链表只有一个节点，则不需要反转
        if (head.next == null || head.next.next == null){
            return ;
        }
        //定义一个变量，帮我们遍历原来链表
        HeroNode cur = head.next;
        //cur这个节点的下一个节点，保证原来的链表取走后不会断掉
        HeroNode next = null;
        HeroNode reversehead = new HeroNode(0,"","");
        //遍历原来的链表
        //每次遍历一个节点，就放到新链表reversenode的前面
        while (cur != null){
            next = cur.next; //先保存现在节点的下一个节点，后面需要使用
            cur.next = reversehead.next;//将一个cur下一个节点指向reversenode的最前端
            reversehead.next = cur;
            cur = next;//cur后移一次
        }
        //实现反转
        head.next = reversehead.next;//实现反转
    }

    //逆序打印单链表
    //1.对链表进行翻转，然后再遍历，虽然可以逆序打印，但是会破坏原来链表的结构，不建议
    //2.栈，各个节点压入栈中，然后利用栈的先进后出特点，实现逆序打印，不会破坏原来单链表的结构
    public static void reverseprint (HeroNode head){
        if (head.next == null){
            return;
        }
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode cur = head.next;
        //遍历把节点压入栈
        while(cur != null){
            stack.push(cur);
            cur =cur.next;
        }
        //输出栈
        while (stack.size() > 0){
            System.out.println(stack.pop());
        }
    }
}

//头节点定义一个HeroNode,对象是一个节点
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;//指向下一个节点

    //构造
    public HeroNode(int no, String name, String niickname) {
        this.no = no;
        this.name = name;
        this.nickname = niickname;
    }

    //为了显示方法，重写toString
    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

//定义一个SingleLinkedList，来管理HeroNode
class  SingleLinkedList{
    //初始化一个头节点
    private HeroNode head = new HeroNode(0, "", "");
    //返回头节点
    public HeroNode getHead() {
        return head;
    }

    //按输入顺序添加1324-->1324
    //添加节点到单向链表
    //1.找到当前链表的头节点
    //2.将最后节点的next指向下一个节点
    public void add(HeroNode heroNode) {
        //头节点不可以动，需要一个辅助变量temp
        HeroNode temp = head;
        //遍历链表，找到最后
        while (true) {
            //找到链表的最后
            if (temp.next == null) {
                break;
            }
            //没有找到就是temp后移
            temp = temp.next;
        }
        //推出while循环是，temp指向了链表的最后
        temp.next = heroNode;
    }

    //按编号顺序添加1324-->1234
    public void addByOrder(HeroNode heroNode){
        //头节点不可以动，需要一个辅助变量temp，找到添加位置
        //temp位于添加节点的前一个位置，否者加入不了
        HeroNode temp = head;
        //标记编号是否存在
        boolean flage = false;
        while(true){
            if (temp.next == null){
                break;
            }
            if (temp.next.no > heroNode.no){
                //位置找到了，就在temp后面
                break;
            }else if(temp.next.no == heroNode.no){
                flage = true;
                break;
            }
            temp = temp.next;//后移表示遍历链表
        }
        //判断flag的值
        if (flage){
            //不能添加，编号已经存在
            System.out.printf("准备插入英雄的编号 %d 已经存在，不能加入\n",heroNode.no);
        }else {
            //插入到链表中
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    //删除节点
    public void del(int no){
        //1.需要一个辅助temp，找到我们需要删除的节点的前一个位置
        HeroNode temp = head;
        //2.根据temp.next.no和删除节点的no作比较
        boolean flage = false; //帮助我们寻找要删除的节点
        while(true){
            if (temp.next == null){
                //链表循环完毕，最后了
                break;
            }
            if (temp.next.no == no){
                flage = true;
                break;
            }
            temp = temp.next;
        }
        if(flage){
            temp.next = temp.next.next;
        }
        else {
            System.out.printf("需要删除的英雄d%不存在\n",no);
        }
    }


    //显示链表
    public void show() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //因为head不可以动，通过辅助temp，来遍历
        HeroNode temp = head.next;
        while (true) {
            //判断链表是否到最后
            if (temp == null) {
                break;
            }
            //输出节点信息
            System.out.println(temp);
            //将next后移，不然为死循环
            temp = temp.next;
        }

    }

    //修改链表
    //根据newHeroNode节点no编号来修改
    public void update(HeroNode newHeroNode){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        //找到需要修改的节点no
        //定义一个辅助变量
        HeroNode temp = head.next;
        //表是不是找到了
        boolean flage = false;
        while(true){
            if (temp == null){
                //表示链表已经遍历完了
                break;
            }
            if(temp.no == newHeroNode.no){
                flage = true;
                break;
            }
            temp = temp.next;
        }
        if(flage){
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        }else {
            //没有找到节点
            System.out.printf("没有找到编号为%d的英雄\n",newHeroNode.no);
        }

    }
}

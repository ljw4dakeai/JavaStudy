package com.ljw4dakeai.LinkedList;

public class DoubleLinked_list {
    public static void main(String[] args) {
        //测试
        //先创建节点
        DoubleHeroNode hero1 = new DoubleHeroNode(1, "宋江","及时雨");
        DoubleHeroNode hero2 = new DoubleHeroNode(2, "小卢","小子");
        DoubleHeroNode hero3 = new DoubleHeroNode(3, "吴用","智多星");
        DoubleHeroNode hero4 = new DoubleHeroNode(4, "公孙胜","入云龙");
        DoubleHeroNode hero5 = new DoubleHeroNode(5, "关胜","大刀");
        DoubleHeroNode hero6 = new DoubleHeroNode(6, "林冲","智多星");

        //创建一个链表
        DoubleLinkedList doublesingleLinkedList = new DoubleLinkedList();
        DoubleLinkedList doublesingleLinkedList_two = new DoubleLinkedList();

        //添加add
        doublesingleLinkedList.addByOrder(hero1);
        doublesingleLinkedList.addByOrder(hero5);
        doublesingleLinkedList.addByOrder(hero6);
        doublesingleLinkedList.addByOrder(hero2);
        doublesingleLinkedList_two.addByOrder(hero4);
        doublesingleLinkedList_two.addByOrder(hero3);

        //显示
        System.out.println("初始链表为：");
        System.out.println("初始链表一为为：");
        doublesingleLinkedList.show();
        System.out.println("初始链表二为为：");
        doublesingleLinkedList_two.show();

        //修改
        DoubleHeroNode newHeroNode = new DoubleHeroNode(2,"卢俊义", "玉麒麟");
        doublesingleLinkedList.update(newHeroNode);
        System.out.println();
        System.out.println("修改后的链表一为：");
        doublesingleLinkedList.show();

        //删除
        doublesingleLinkedList.del(1);
        doublesingleLinkedList.del(5);
        System.out.println();
        System.out.println("删除后的链表一为：");
        doublesingleLinkedList.show();

        //删除后的显示
        //显示
        System.out.println();
        System.out.println("最后的链表为：");
        System.out.println("链表一为为：");
        doublesingleLinkedList.show();
        System.out.println("链表二为为：");
        doublesingleLinkedList_two.show();

    }
}


//头节点定义一个HeroNode,对象是一个节点
class DoubleHeroNode {
    public int no;
    public String name;
    public String nickname;
    public DoubleHeroNode next;//指向下一个节点
    public DoubleHeroNode pre;//指向前一个结点

    //构造
    public DoubleHeroNode(int no, String name, String niickname) {
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

class DoubleLinkedList{
    //初始化一个头节点
    private DoubleHeroNode head = new DoubleHeroNode(0, "", "");
    //返回头节点
    public DoubleHeroNode getHead() {
        return head;
    }

    //遍历双向链表
    public void show(){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        DoubleHeroNode temp = head.next;
        while(true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //添加，写入顺序添加
    public void add(DoubleHeroNode heroNode) {
        //头节点不可以动，需要一个辅助变量temp
        DoubleHeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
        heroNode.pre = temp;
    }

    //修改链表,双向链表的修改和单向链表修改方法一样
    //根据newHeroNode节点no编号来修改
    public void update(DoubleHeroNode newHeroNode){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        //找到需要修改的节点no
        //定义一个辅助变量
        DoubleHeroNode temp = head.next;
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

    //删除节点
    public void del(int no) {
        DoubleHeroNode temp = head;
        //对于双向链表可以直接删除节点
        //找到以后自我删除
        boolean flage = false;
        //遍历双向链表
        while (true) {
            //链表的最后
            if (temp == null){
                break;
            }
            //找到要删除的节点 把flage变成true
            if (temp.no == no){
                flage = true;
                break;
            }
            temp = temp.next;
            }
        if(flage){
            temp.pre.next = temp.next;
            //如果这是最后一个节点，就会出现错误，空指针异常
            //如果不给条件这里删除最后一个节点有问题
            if(temp.next != null){
                temp.next.pre = temp.pre;
            }
        }else {
            System.out.printf("要删除的节点%d不存在！\n",no);
        }
    }

    //按顺序添加
    public void addByOrder(DoubleHeroNode heroNode){
        DoubleHeroNode temp = head;
        //标记编号是否存在
        boolean flage = false;
        boolean flage_two = flage;
        while(true){
            if (temp.no > heroNode.no) {
                //位置找到了，就在temp前面
                break;
            }
            //找到了链表的最后
            if (temp.next == null){
                flage_two = true;
                break;
            }
            //找到了相同的
            else if(temp.no == heroNode.no){
                flage = true;
                break;
            }
            temp = temp.next;//后移表示遍历链表
        }
        //判断flag的值
        if (flage){
            //不能添加，编号已经存在
            System.out.printf("准备插入英雄的编号 %d 已经存在，不能加入\n",heroNode.no);
        }else if (flage_two){
            temp.next = heroNode;
            heroNode.pre = temp;
        }else{
            heroNode.next = temp;
            if (temp.pre != null){
                temp.pre.next = heroNode;
                heroNode.pre = temp.pre;
                temp.pre = heroNode;
            }
        }
    }
}
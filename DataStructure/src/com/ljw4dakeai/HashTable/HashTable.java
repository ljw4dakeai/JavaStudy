package com.ljw4dakeai.HashTable;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class HashTable {

    public static void main(String[] args) {
        Hash_table hashTable = new Hash_table(7);

        //制作菜单
        String key;//接受用户输入
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" add: 添加雇员");
            System.out.println("list: 显示雇员 ");
            System.out.println("exit: 退出系统");
            System.out.println("delt: 删除雇员");
            System.out.println("find: 查找雇员");
            key = scanner.next();
            switch (key) {
                case "add":
                    System.out.println("请输入ID");
                    int id = scanner.nextInt();
                    System.out.println("请输入名字");
                    String neme = scanner.next();
                    //创建雇员
                    Emply emply = new Emply(id, neme);
                    hashTable.add(emply);
                    break;
                case "list":
                    hashTable.list();
                    break;
                case "find":
                    System.out.println("请输入要查找的ID");
                    id = scanner.nextInt();
                    hashTable.findEmpluByID(id);
                    break;
                case "delt":
                    System.out.println("请输入要删除的ID");
                    id = scanner.nextInt();
                    hashTable.deletByID(id);
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

}

//hash表，管理多条链表
class Hash_table {
    private int size;//表示有多少条链；
    private EmplyLinkedList[] emplyLinkedListsArray;

    public Hash_table(int size) {
        //初始化EmplyLinkedList
        this.size = size;
        emplyLinkedListsArray = new EmplyLinkedList[size];

        //hash表，要初始化每一条连标
        for (int i = 0; i < size; i++) {
            emplyLinkedListsArray[i] = new EmplyLinkedList();

        }


    }

    //编写散列函数
    public int HashFun(int id) {
        return id % size;
    }

    //添加
    public void add(Emply emply) {
        //根据ID，判断添加到那条链表
        int emplyLinkedListNO = HashFun(emply.id);
        emplyLinkedListsArray[emplyLinkedListNO].add(emply);
    }

    //遍历所有链表的
    public void list() {
        for (int i = 0; i < size; i++) {
            emplyLinkedListsArray[i].list(i);

        }
    }

    //根据输入ID查找雇员
    public void findEmpluByID(int id) {
        int emplyLinkedListNO = HashFun(id);
        Emply emply = emplyLinkedListsArray[emplyLinkedListNO].findEmply(id);
        if (emply != null) {
            System.out.printf("在第%d条链表中找打了，雇员ID = %d\n", (emplyLinkedListNO + 1), id);

        } else {
            System.out.println("在哈希表中，没有找到该雇员");
        }
    }

    public void deletByID(int id) {
        int emplyLinkedListNO = HashFun(id);
        emplyLinkedListsArray[emplyLinkedListNO].deletByID(id);
    }

}


class Emply {
    public int id;
    public String name;
    public Emply next;

    public Emply(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}

//一条链表
class EmplyLinkedList {
    //不需要头节点，head是直接指向第一个雇员的
    private Emply head;//默认为空


    //添加
    public void add(Emply emply) {
        //1、添加雇员是自增的，ID分配总是从下到大；
        //加入数据时候，直接加入到链表的最后；

        if (head == null) {
            //添加第一个
            head = emply;
            return;
        }
        //不是添加第一个，加入到最后
        Emply curEmply = head;
        while (true) {
            if (curEmply.next == null) {
                break;
            }
            curEmply = curEmply.next;
        }
        curEmply.next = emply;
    }


    //遍历
    public void list(int no) {
        if (head == null) {
            System.out.println("第" + (no + 1) + "链表为空");
            return;
        }

        //不是空
        System.out.print("第" + (no + 1) + "链表的信息为");
        Emply curEmply = head;
        while (true) {
            System.out.printf("=> ID=%d name=%s\t", curEmply.id, curEmply.name);
            if (curEmply.next == null) {
                //到了最后
                break;
            }
            //后移遍历
            curEmply = curEmply.next;
        }
        System.out.println();
    }

    //根据ID查找，
    //找到了就返回employ，没找到就返回null
    public Emply findEmply(int id) {
        //判断链表是不是为空
        if (head == null) {
            System.out.println("链表为空");
            return null;
        }
        //辅助指针
        Emply emply = head;
        while (true) {
            if (emply.id == id) {
                //找到了
                break;//这个时候就指向了要查找的雇员
            }
            if (emply.next == null) {
                emply = null;
                break;
            }
            emply = emply.next;
        }
        return emply;
    }


    //根据ID删除
    public void deletByID(int id) {
//        Emply emply = head;
//        boolean flage = false;
//        while(true){
//            if (head == null){
//                break;
//            }
//            if (emply.id == id){
//                flage = true;
//                break;
//            }
//            emply = emply.next;
//        }
//        if (flage){
//            emply.next = emply.next.next;
//
//        }else {
//            System.out.printf("哈希表中没有ID为%d的雇员\n",id);
//        }
    }

}

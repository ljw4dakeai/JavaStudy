package com.ljw4dakeai.Stack;

//用链表实现栈

public class LinkedList_Stack {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        LinkedListStack linkedListStack = new LinkedListStack();

        //添加
        linkedListStack.resadd(node1);
        linkedListStack.resadd(node4);
        linkedListStack.resadd(node3);

        //显示
        System.out.println("栈的显示");
        linkedListStack.show();

        //删除
        linkedListStack.del(4);
        System.out.println();
        System.out.println("栈的显示");
        linkedListStack.show();

    }

}
class Node{
    public int no;
    public Node next;

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                '}';
    }

    public Node(int no){
        this.no = no;
    }


}

class LinkedListStack{
    private Node head = new Node(0);

    //添加
    public void add(Node node){
        Node temp = head;
        while (true){
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void resadd(Node node){
        if (head.next == null){
            head.next = node;
            return;
        }
        Node temp = head.next;
        head.next = node;
        node.next = temp;

    }


    //显示顺序显示链表
    public void show(){
        if(head.next == null){
            System.out.println("栈为空");
            return;
        }
        Node temp = head.next;
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //删除
    public void del(int no){
        Node temp = head;
        boolean flage = false;
        while (true){
            //栈的循环结束
            if (temp.next == null){
                break;
            }
            //找到了
            if(temp.next.no == no){
                flage = true;
                break;
            }
            temp = temp.next;
        }
        if (flage){
            temp.next = temp.next.next;
        }else {
            System.out.println("要删除的数据不存在");
        }
    }

}


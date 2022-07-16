package com.ljw4dakeai.LinkedList;
//循环链表
public class Josephu {
    public static void main(String[] args) {
        //测试
        //构建环形链表
        CycleSingleLinkedList cycleSingleLinkedList = new CycleSingleLinkedList();


        //添加
        cycleSingleLinkedList.addBoy(25);

        //显示
        System.out.println("所有的小孩为：");
        cycleSingleLinkedList.showBoy();

        //出圈
        cycleSingleLinkedList.countBoy(1,2,25);


    }
}

//创捷一个类，表示节点
class Boy{
    private int no;
    private Boy next;//指向下一个默认为null

    public Boy(int no) {
        this.no = no;
    }
    //私有的，设置set方法和get方法
    public int getNo() {
        return no;
    }
    public Boy getNext() {
        return next;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public void setNext(Boy next) {
        this.next = next;
    }

}

//创建一个环形单向链表
class CycleSingleLinkedList{
    //创建一个first节点；当前没有编号
    private Boy first = new Boy(-1);

    //添加节点，构建成环形链表
    public void addBoy(int num){
        //num表示链表有几个节点>1
        if(num <1){
            System.out.println("num的值不正确，必须大于一");
            return;
        }
        //复制指针遍历环线链表
        Boy CurBoy = null;
        //for循环创建环形链表
        for(int i = 1; i <= num; i++){
            //根据编号创建节点
            Boy  boy = new Boy(i);
            //第一个节点特别
            if (i == 1){
                first = boy;
                first.setNext(first);//构成一个环
                CurBoy = first;//让CurBoy指向第一个节点 ，后面让CurBoy构建环
            }else{
                CurBoy.setNext(boy);
                boy.setNext(first);
                CurBoy = boy;
            }
        }
    }

    //遍历当前环形链表
    public void showBoy(){
        //没有节点
        if(first == null){
            System.out.println("没有任何小孩");
            return;
        }
        //first不可以使用，建议一个辅助指针完成遍历
        Boy CurBoy = first;
        while (true){
            System.out.printf("小孩的编号为：%d\n",CurBoy.getNo());
            //遍历完成
            if(CurBoy.getNext() == first){
                break;
            }
            CurBoy = CurBoy.getNext();//完成遍历
        }
    }

    //1.创建一个辅助指针helper，帮助节点出圈，事先这个节点应该指向最后一个节点
    //2.报数之前，把first移动到处
    //3.报数时，first和辅助节点helper同时移动，移动m-1下
    //4.这个时候就可以把first指针节点出
        //first = first.next
        //helper.next = first
    //原来first节点就没有任何引用，就会被回收
    //根据用户输入，显示节点出圈顺序
    public void countBoy(int startN0, int countNum, int num){
        //startN0表示从那个节点开始数，
        //countNum表示数几下
        //num表示多少节点在圈中
        if(first == null || startN0  < 1 || startN0 > num ){
            System.out.println("参数输入有误，请重新输入");
            return;
        }
        //1.创建一个辅助指针helper，帮助节点出圈
        Boy helper = first;
        while (true){
            if (helper.getNext() == first){
                break;
            }
            helper = helper.getNext();
        }
        //报数前小孩移动到指定位置
        for(int j = 0; j < startN0 -1; j++){
            first = first.getNext();
            helper = helper.getNext();
        }
        //报数时，first和辅助节点helper同时移动，移动countNo-1下
        //这里为一个循环，知道圈中只有一个节点
        while(true){
            //此时说明圈中只有一个节点
            if (helper == first){
                break;
            }
            //first和helper同时移动counTnO-1次
            for(int j = 0; j < countNum - 1; j++){
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.printf("节点%d出圈了->",first.getNo());
            //让原先节点
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后留在圈中的节点%d\n",first.getNo());
    }


}

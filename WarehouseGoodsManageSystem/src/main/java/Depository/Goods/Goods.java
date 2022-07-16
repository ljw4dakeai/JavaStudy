package Depository.Goods;

public class Goods {
    private int No;     //编号,将编号作为唯一识别，主键
    private String Name; //名称
    private String Type; //种类，和仓库的名字连接，仓库分为不同种类的仓库
    private int Number;  //库存数量
    private double price;//价格

    //构造函数INSERT
    public Goods(int no, String name, String type, int number, double price) {
        No = no;
        Name = name;
        Type = type;
        Number = number;
        this.price = price;
    }

    //构造函数UPDATA
    public Goods(String name, String type, int number, double price) {
        Name = name;
        Type = type;
        Number = number;
        this.price = price;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}

package Depository;

import Depository.Goods.Goods;
import Depository.Goods.GoodsManage;
import Depository.Ware.Ware;
import Depository.Ware.WareManage;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Method {
    GoodsManage goodsManage = new GoodsManage();
    WareManage wareManage = new WareManage();

    //入库方法
    public void Input() throws SQLException, ClassNotFoundException {
        //输出现有编号
        List<Integer> list;
        list = goodsManage.toNoAll();
        System.out.print("现有商品编号为：");
        for (int i : list) {
            System.out.print(i + "\t");
        }

        //goodsadd和wareadd方法在入库出库类中实现了
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品编号：(商品编号唯一！！！)");
        int No = scanner.nextInt();
        System.out.println("请输入商品名称：");
        String Name = scanner.next();
        System.out.println("请输入商品种类：");
        String Type = scanner.next();
        System.out.println("请输入商品数量：");
        int Number = scanner.nextInt();
        System.out.println("请输人商品价格：");
        double Price = scanner.nextDouble();
        Goods goods = new Goods(No, Name, Type, Number, Price);
        goodsManage.goodsAdd(goods);

        if (wareManage.showExitName(Type)) {
            int Scraps = wareManage.showScrapsNum(Type) - Number;
            if (Scraps - Number <= 0) {
                System.out.println(Type + "仓库不够了！！！请加仓！！！！！");
            } else {
                wareManage.wareUpd(Type, Scraps);
            }
        } else {
            System.out.println("没有同类型仓库需要新加仓库，请输入仓库地址和容量！！");
            System.out.println("请输入最大容量！！！");
            int Maxsize = scanner.nextInt();
            System.out.println("请输入仓库地址！！！");
            String Local = scanner.next();
            wareManage.wareAdd(new Ware(wareManage.showNextNo(), Type, Maxsize, Local));

            wareManage.wareUpd(Type, Maxsize - Number);
        }
    }

    //出库方法
    public void Output() throws SQLException, ClassNotFoundException {
        //goodsdel方法在出库类中实现了
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入出库商品编号！！！");
        int No = scanner.nextInt();

        //获取出库商品的种类（为仓库名，主键唯一）
        String name = goodsManage.toTyoe(No);
        //获取出库数量
        int num = goodsManage.toNum(No);

        if (wareManage.showExitName(name)) {

            //对仓库表进行修改,因为是插入仓库，所以仓库就一定存在
            //获取对应仓库的数量
            int Updnum = wareManage.showScrapsNum(name) + num;

            //对仓库表修改
            wareManage.wareUpd(name, Updnum);

            //删除商品表
            goodsManage.goodsDel(No);
        } else {
            goodsManage.goodsDel(No);
        }
    }

    //商品的修改
    public void GoodsUpd() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        //修改商品数量名称，数量，价格，种类
        System.out.println("请输入要修改商品的编号！");
        int goodsNoUpd = scanner.nextInt();
        System.out.println("请输入修改后商品的名称！");
        String goodsNameUpd = scanner.next();
        System.out.println("请输入修改后商品的种类！");
        String goodsTypeUpd = scanner.next();
        System.out.println("请输入修改后商品的数量！");
        int goodsNumUpd = scanner.nextInt();
        System.out.println("请输入修改后商品的价格！");
        int goodsPriceUpd = scanner.nextInt();
        Goods goods = new Goods(goodsNameUpd, goodsTypeUpd, goodsNumUpd, goodsPriceUpd);
        if (wareManage.showExitName(goodsTypeUpd)) {
            //现在仓库的同类数量+以前该商品的数量-现在商品的数量
            int wareNum = wareManage.showScrapsNum(goodsTypeUpd) + goodsManage.toNum(goodsNoUpd) - goodsNumUpd;//数量;

            //更新商品
            goodsManage.goodsUpd(goodsNoUpd, goods);
            wareManage.wareUpd(goodsTypeUpd, wareNum);
        } else {
            //需要新建立一个仓库，在把仓库商品加进去
            System.out.println("没有同类型仓库需要新加仓库，请输入仓库地址和容量！！");
            //输入比商品数量大的
            System.out.println("请输入最大容量！！！");
            int Maxsize = scanner.nextInt();
            System.out.println("请输入仓库地址！！！");
            String Local = scanner.next();
            wareManage.wareAdd(new Ware(wareManage.showNextNo(), goodsTypeUpd, Maxsize, Local));
            if (Maxsize - goodsNumUpd < 0) {
                System.out.println("新仓库太小了！！！");
            } else {
                goodsManage.goodsUpd(goodsNoUpd, goods);
                wareManage.wareUpd(goodsNameUpd, Maxsize - goodsNumUpd);
            }
        }
    }

    //商品的显示
    public void GoodsShow() throws SQLException, ClassNotFoundException {
        goodsManage.goodsShow();
    }


    //仓库的更改
    public void WareUpd() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        //加仓实现
        System.out.println("请输入要修改的仓库名！");
        String wareNameAdd = scanner.next();
        System.out.println("请输入要修改仓库最大容量！");
        int wareMaxsizeAdd = scanner.nextInt();
        //获取同类型商品的总数
        int wareNumAdd = wareMaxsizeAdd - goodsManage.toTypeAll(wareNameAdd);
        wareManage.wareUpd(wareNameAdd, wareNumAdd);

    }

    //仓库的显示
    public void WareShow() throws SQLException, ClassNotFoundException {
        wareManage.show();
    }

    public void WareDel() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的仓库名！");
        String name = scanner.next();
        wareManage.wareDel(name);
    }

    //仓库的增加
    public void WareAdd() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入仓库的编号！！");
        int wareNo = scanner.nextInt();
        System.out.println("亲输入仓库名称！！！");
        String wareName = scanner.next();
        System.out.println("请输入仓库最大容量！");
        int wareMaxsize = scanner.nextInt();
        System.out.println("请输入仓库地址！！！");
        String wareLocal = scanner.next();
        wareManage.wareAdd(new Ware(wareNo, wareName, wareMaxsize, wareLocal));
    }


    //查询一个商品的总数商品
    public void GoodsAll() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查询的商品！！");
        String name = scanner.next();
        goodsManage.toNameAll(name);
    }


}

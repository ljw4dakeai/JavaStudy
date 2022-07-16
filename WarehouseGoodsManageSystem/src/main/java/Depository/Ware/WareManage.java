package Depository.Ware;

import Depository.Goods.GoodsManage;
import Depository.MysqlRecourse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WareManage extends MysqlRecourse {

    //显示仓库表
    public void show() throws SQLException, ClassNotFoundException {
        List<Ware> listwares = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM DEPOSITIRYS";
        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Ware ware = new Ware(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4));
                listwares.add(ware);
            }
        } finally {
            this.close(connection, preparedStatement, null);
        }

        for (Ware w : listwares) {
            System.out.println("编号：" + w.getNo() + "\t" + "仓库名称：" + w.getName() + "\t"
                    + "仓库最大容量：" + w.getMaxSize() + "\t" + "仓库地址：" + w.getLocal());
        }

    }

    //定义一个是否有输入的仓库
    //如果有这个仓库，就返回一个true，加入仓库中，如果没有，就返回一个false，提醒加仓库
    public boolean showExitName(String string) throws SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        boolean flage = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM DEPOSITIRYS";

        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                list.add(resultSet.getString(2));
            }
            for (String s : list) {
                if (string.equals(s)) {
                    flage = true;
                    break;
                }
            }
        } finally {
            this.close(connection, preparedStatement, resultSet);
        }
        return flage;

    }

    //返回下一个仓库的No
    public int showNextNo() throws SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM DEPOSITIRYS";
        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                list.add(resultSet.getString(2));
            }

        } finally {
            this.close(connection, preparedStatement, resultSet);
        }
        return list.size() + 1;
    }

    //返回仓库里的剩下的空闲数量
    public int showScrapsNum(String string) throws SQLException, ClassNotFoundException {
        List<Integer> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT  *  FROM DEPOSITIRYS WHERE Name = ?";

        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, string);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(resultSet.getInt(3));
            }

        } finally {
            this.close(connection, preparedStatement, resultSet);
        }
        return list.get(0);
    }


    //对仓库插入方法
    public void wareAdd(Ware ware) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO DEPOSITIRYS(NO, Name, Maxsize, Local) VALUE (?, ?, ?, ?)";

        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ware.getNo());
            preparedStatement.setString(2, ware.getName());
            preparedStatement.setInt(3, ware.getMaxSize());
            preparedStatement.setString(4, ware.getLocal());
            preparedStatement.executeUpdate();

        } finally {
            this.close(connection, preparedStatement, null);
        }
    }

    //对仓库实现删除方法
    public void wareDel(String string) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "DELETE  FROM DEPOSITIRYS WHERE Name = ?";

        //同时，商品也要删除
        GoodsManage goodsManage = new GoodsManage();
        goodsManage.goodsDelType(string);
        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, string);
            preparedStatement.executeUpdate();
        } finally {
            this.close(connection, preparedStatement, null);
        }
    }

    //对仓库实现修改
    public void wareUpd(String string, int num) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE DEPOSITIRYS SET Maxsize = ? WHERE Name = ?";
        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, num);
            preparedStatement.setString(2, string);
            preparedStatement.executeUpdate();
        } finally {
            this.close(connection, preparedStatement, null);
        }
    }


}

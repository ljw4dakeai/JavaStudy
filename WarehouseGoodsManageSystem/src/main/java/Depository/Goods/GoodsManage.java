package Depository.Goods;


import Depository.MysqlRecourse;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GoodsManage extends MysqlRecourse {

    //增加
    public void goodsAdd(Goods goods) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO GOODS(No, Name, Type, Number, Price) VALUE(?,?,?,?,?)";
        try {
            connection = this.getCon();

            preparedStatement = connection.prepareStatement(sql);


            //        PreparedStatement可以有效防止sql注入，所以生产环境上一定要使用PreparedStatement
            //        编译，返回编译后的标示，减少编译过程

            preparedStatement.setInt(1, goods.getNo());
            preparedStatement.setString(2, goods.getName());
            preparedStatement.setString(3, goods.getType());
            preparedStatement.setInt(4, goods.getNumber());
            preparedStatement.setDouble(5, goods.getPrice());
            preparedStatement.executeUpdate();


        } finally {
            this.close(connection, preparedStatement, null);
        }

    }

    //改
    public void goodsUpd(int No, Goods goods) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE GOODS SET Name = ?, Type = ?, Number = ?, Price = ?  WHERE No = ?";
        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            //设置符号对应的位置
            preparedStatement.setString(1, goods.getName());
            preparedStatement.setString(2, goods.getType());
            preparedStatement.setInt(3, goods.getNumber());
            preparedStatement.setDouble(4, goods.getPrice());
            preparedStatement.setInt(5, No);
            preparedStatement.executeUpdate();
        } finally {
            this.close(connection, preparedStatement, null);
        }

    }


    //删除
    public void goodsDel(int No) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM GOODS WHERE No = ?";
        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, No);
            preparedStatement.executeUpdate();
        } finally {
            this.close(connection, preparedStatement, null);

        }

    }

    //根据类型删除
    public void goodsDelType(String Type) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM GOODS WHERE Type = ?";
        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, Type);
            preparedStatement.executeUpdate();
        } finally {
            this.close(connection, preparedStatement, null);

        }

    }

    //商品表的显示
    public void goodsShow() throws SQLException, ClassNotFoundException {
        List<Goods> listgoods = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM GOODS";

        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Goods goods = new Goods(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getDouble(5));
                listgoods.add(goods);
            }

        } finally {
            this.close(connection, preparedStatement, resultSet);
        }
        for (Goods g : listgoods) {
            System.out.println("编号：" + g.getNo() + "\t" + "商品名称：" + g.getName() + "\t"
                    + "商品类型：" + g.getType() + "\t" + "商品数量：" + g.getNumber() + "\t" + "商品价格：" + g.getPrice());
        }
    }

    //返回同名型商品总数
    public void toNameAll(String string) throws SQLException, ClassNotFoundException {
        List<Integer> listNameAll = new ArrayList<>();
        int All = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String sql = "SELECT * FROM GOODS WHERE Name = ?";

        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, string);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                listNameAll.add(resultSet.getInt(4));
            }

        } finally {
            this.close(connection, preparedStatement, resultSet);
        }

        for (int i : listNameAll) {
            All += i;
        }
        System.out.println(string + "的总数为：" + All + "个");
    }


    //返回同类型商品总数
    public int toTypeAll(String string) throws SQLException, ClassNotFoundException {
        List<Integer> listNameAll = new ArrayList<>();
        int All = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String sql = "SELECT * FROM GOODS WHERE Name = ?";

        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, string);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                listNameAll.add(resultSet.getInt(4));
            }

        } finally {
            this.close(connection, preparedStatement, resultSet);
        }

        for (int i : listNameAll) {
            All += i;
        }
        return All;
    }


    //获取商品的类型
    public String toTyoe(int No) throws SQLException, ClassNotFoundException {
        List<String> listType = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM GOODS WHERE No = ?";

        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, No);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listType.add(resultSet.getString(3));
            }
        } finally {
            this.close(connection, preparedStatement, resultSet);
        }
        return listType.get(0);
    }


    //返回同编号对应的商品数量
    public int toNum(int No) throws SQLException, ClassNotFoundException {
        List<Integer> listType = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM GOODS WHERE No = ?";


        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, No);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listType.add(resultSet.getInt(4));
            }
        } finally {
            this.close(connection, preparedStatement, resultSet);
        }
        return listType.get(0);

    }

    //返回所有编号
    public List<Integer> toNoAll() throws SQLException, ClassNotFoundException {

        List<Integer> listType = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM GOODS";

        try {
            connection = this.getCon();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listType.add(resultSet.getInt(1));
            }
        } finally {
            this.close(connection, preparedStatement, resultSet);
        }
        return listType;
    }

}

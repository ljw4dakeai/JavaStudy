package Depository;

import java.sql.*;

public class MysqlRecourse {

    private final String url = "jdbc:mysql://127.0.0.1:3306/DEPOSITIRY";
    private final String user = "root";
    private final String password = "520000";

    //定义一个数据库的链接变量用于存放对象
    //获取资源
    public Connection getCon() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }

    //关闭资源
    public void close(Connection connection, Statement statement, ResultSet resultSet) throws ClassNotFoundException, SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}


package com.djk.jdbc;

import java.sql.*;

/**
 * 程序的耦合
 *          耦合：程序间的依赖关系
 *          包括：类之间的依赖，方法之间的依赖
 *
 *          解耦：降低程序之间的依赖关系
 *
 *          实际开发中应做到：
 *              编译时不依赖，运行时依赖
 *
 *           解耦的思路：
 *               第一步：使用反射创建对象，而不是new
 *               第二步：通过读取配置文件来获取要创建对象的全限定类名
 *
 */

public class JdbcDemo1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1 注册驱动
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Class.forName("com.mysql.cj.jdbc.Driver()");

        //2 获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coder?characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT", "root", "123456");

        //3 获取操作数据库的预处理对象
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account");

        //4 执行sql，得到结果集
        ResultSet resultSet = preparedStatement.executeQuery();

        //5 遍历结果集
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }

        //6 释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}

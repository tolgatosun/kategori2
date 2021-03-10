package com.uniyaz.core.data;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection implements Serializable {

    static  final String driverName = "com.mysql.jdbc.Driver";
    static  final String url = "jdbc:mysql://localhost:3306/testuniversal?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    static  final String userName = "root";
    static  final String password = "123qwe";
    static  Connection connection = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(driverName);
        connection = DriverManager.getConnection(url, userName, password);
        return connection;
    }
}

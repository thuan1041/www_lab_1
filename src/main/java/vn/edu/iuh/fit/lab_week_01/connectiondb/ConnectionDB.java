package vn.edu.iuh.fit.lab_week_01.connectiondb;

import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionDB {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String pw = "1234";
//    private static final Connection connection;

    public static Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Connection connection =  DriverManager.getConnection(url,username,pw);
            System.out.println("Connect success database");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return null;
    }

}

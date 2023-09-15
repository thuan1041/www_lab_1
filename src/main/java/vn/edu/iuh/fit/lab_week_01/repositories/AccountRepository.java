package vn.edu.iuh.fit.lab_week_01.repositories;

import vn.edu.iuh.fit.lab_week_01.connectiondb.ConnectionDB;
import vn.edu.iuh.fit.lab_week_01.models.Account;


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AccountRepository {
    private static Connection con = ConnectionDB.createConnection();
    public void creataAcc(Account acc)  {
        String sql = "INSER INTO account VALUES (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1,acc.getAccount_id());
            preparedStatement.setString(2,acc.getFull_name());
            preparedStatement.setString(3,acc.getPassword());
            preparedStatement.setString(4,acc.getEmail());
            preparedStatement.setString(5,acc.getPhone());
            preparedStatement.setInt(6,acc.getStatus());

            preparedStatement.executeUpdate();
        } catch (SQLException e){
            System.out.println("create account"+ e.getMessage());
        }

    }

    public List<Account> getAll() {
        String sql = "SELECT * FROM account";
        List<Account> accounts = new ArrayList<>();
        try{
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                Account account = new Account();
                account.setAccount_id(resultSet.getString("account_id"));
                account.setFull_name(resultSet.getString("full_name"));
                account.setPassword(resultSet.getString("password"));
                account.setEmail(resultSet.getString("email"));
                account.setPhone(resultSet.getString("phone"));
                account.setStatus(resultSet.getInt("phone"));
                accounts.add(account);
            }
            System.out.println("get List All");
            return accounts;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }

    }
}

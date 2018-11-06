/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class AccountDAO {
    static Connection con = DBConnection.getConnection();
    static ResultSet rs = null;
    
    public static Account LogIn(Account acc) throws SQLException
    {
        String username = acc.getUsername();
        String password = acc.getPassword();
        String sql = "SELECT * FROM Account WHERE username='"+ username+ "' AND password='"+ password+ "'";
        PreparedStatement ps = con.prepareCall(sql);
        rs = ps.executeQuery();
        boolean more = rs.next();
         if (!more) 
         {
            System.out.println("Sorry, you are not a registered user! Please sign up first");
            acc.setValid(false);
         } 
	        
         //if user exists set the isValid variable to true
         else if (more) 
         {
           System.out.println("Yes");
            acc.setValid(true);
         }
        return acc;
    }
    
    public Account getAccount(String uname) throws SQLException
    {
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM Account WHERE username='"+uname+"'";
        PreparedStatement ps = con.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Account acc = new Account();
        while(rs.next()){
            acc.setUsername(rs.getString("username"));
            acc.setPassword(rs.getString("password"));
            acc.setAddress(rs.getString("address"));
            acc.setFullname(rs.getString("fullname"));
            acc.setPhonenum(rs.getInt("phonenum"));
        }
        return acc;
    }
    
    public static void main(String[] args) throws SQLException{
        AccountDAO dao = new AccountDAO();
        System.out.println(dao.getAccount("winsuccess").getFullname());
    }
}

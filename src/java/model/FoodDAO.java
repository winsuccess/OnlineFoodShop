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
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class FoodDAO {
    public ArrayList<Food> getListFoodByRestaurant(int id) throws SQLException {
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM Food WHERE resid='"+id+"'";
        PreparedStatement ps = con.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Food> foodlist = new ArrayList<>();
        while (rs.next()) {
            Food f = new Food();
            f.setId(rs.getInt("id"));
            f.setResid(rs.getInt("resid"));
            f.setTimes(rs.getInt("times"));
            f.setName(rs.getString("name"));
            f.setPrice(rs.getInt("price"));
            f.setPic(rs.getString("pic"));
            foodlist.add(f);
        }
        return foodlist;
    }
    
    public Food getFood(long id) throws SQLException{
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM Food WHERE id='"+id+"'";
        PreparedStatement ps = con.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Food f = new Food();
        while(rs.next()){
            f.setId(rs.getInt("id"));
            f.setResid(rs.getInt("resid"));
            f.setTimes(rs.getInt("times"));
            f.setName(rs.getString("name"));
            f.setPrice(rs.getInt("price"));
            f.setPic(rs.getString("pic"));
        }
        return f;
    }
    
    public static void main (String[] args) throws SQLException
    {
        FoodDAO dao = new FoodDAO();
        for (Food f : dao.getListFoodByRestaurant(10000))
            System.out.println(f.getName());
    }

}

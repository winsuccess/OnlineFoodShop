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
import model.Restaurant;

/**
 *
 * @author ADMIN
 */
public class RestaurantDAO {
    
    public ArrayList<Restaurant> getListRestaurant() throws SQLException {
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM Restaurant";
        PreparedStatement ps = con.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Restaurant> reslist = new ArrayList<>();
        while (rs.next()) {
            Restaurant res = new Restaurant();
            res.setId(rs.getInt("id"));
            res.setName(rs.getString("name"));
            res.setAddress(rs.getString("address"));
            res.setPrice(rs.getString("price"));
            res.setType(rs.getString("type"));
            res.setDelivery(rs.getString("delivery"));
            res.setRating(rs.getFloat("rating"));
            res.setPic(rs.getString("pic"));
            res.setPrepareTime(rs.getInt("prepareTime"));
            reslist.add(res);
        }
        return reslist;
    }
    
    public Restaurant getRestaurant(int id) throws SQLException{
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM Restaurant WHERE id='"+id+"'";
        PreparedStatement ps = con.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Restaurant res= new Restaurant();
        while(rs.next()){
            res.setId(rs.getInt("id"));
            res.setName(rs.getString("name"));
            res.setAddress(rs.getString("address"));
            res.setPrice(rs.getString("price"));
            res.setType(rs.getString("type"));
            res.setDelivery(rs.getString("delivery"));
            res.setRating(rs.getFloat("rating"));
            res.setPic(rs.getString("pic"));
            res.setPrepareTime(rs.getInt("prepareTime"));
        }
        return res;
    }
       
    public void deleteRestaurant(int id) throws SQLException{
        Connection con = DBConnection.getConnection();
        String sql = "delete from Restaurant WHERE id='"+id+"'";
        PreparedStatement ps = con.prepareCall(sql);
        ps.executeUpdate();
    }
    public int addRestaurant(String filename, int res_id, String res_name, String res_address, String res_type,float res_rate,int res_prepare,String res_price,String res_deliver) throws SQLException{
        Connection con = DBConnection.getConnection();
        String sql = "insert into Restaurant(id,name,address,rating,price,type,delivery,prepareTime,pic)";
        sql += "values ("+ res_id + ",N'"+ res_name + "',N'"+ res_address + "',"+ res_rate + ",N'"+ res_price + "',N'"+ res_type + "',N'"+ res_deliver + "',"+ res_prepare + ",N'" + filename + "')";
        System.out.println(sql);
        PreparedStatement ps = con.prepareCall(sql);
        int a = ps.executeUpdate();
        return a;
    }
    
    public static void main(String[] args) throws SQLException{
            RestaurantDAO dao = new RestaurantDAO();
            System.err.println(dao.getRestaurant(10000).getName());
    }
}

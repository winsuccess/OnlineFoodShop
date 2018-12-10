/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import model.Restaurant;
import model.RestaurantDAO;

/**
 *
 * @author ADMIN
 */
public class RestaurantManager {

    public String covertStringToURL(String str) {
        try {
            String temp = Normalizer.normalize(str, Normalizer.Form.NFD);
            Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            return pattern.matcher(temp).replaceAll("").toLowerCase().replaceAll(" ", "-").replaceAll("đ", "d");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public ArrayList<Restaurant> searchByNameRestaurant(String name) throws SQLException {
        String n = name.replace("+", " ").replace("%20", " ");
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM Restaurant WHERE name COLLATE SQL_Latin1_General_CP1253_CI_AI LIKE N'%" + n + "%'";
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

    public ArrayList<Restaurant> searchByTypeRestaurant(String type) throws SQLException {
        String t = type.replace("+", " ").replace("%20", " ");
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM Restaurant WHERE type =N'" + t + "'";
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
    
    public int countRestaurant() throws SQLException
    {
        int tong=0;
        RestaurantDAO rdao = new RestaurantDAO();
        for(Restaurant r: rdao.getListRestaurant())
            tong++;
        return tong;
    }

    public static void main(String[] args) throws SQLException {
        RestaurantManager dao = new RestaurantManager();
        for (Restaurant r : dao.searchByNameRestaurant("Trà Sữa Sharetea")) {
            System.out.println(r.getPrice());
        }
    }
}

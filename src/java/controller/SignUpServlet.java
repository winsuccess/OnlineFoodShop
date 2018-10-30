/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class SignUpServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        try {
            Connection con = DBConnection.getConnection();
            request.setCharacterEncoding("UTF-8");
            String uname = request.getParameter("uname");
            String psw = request.getParameter("psw");
            String fname = request.getParameter("fname");
            int phonenum = Integer.parseInt(request.getParameter("phonenum"));
            String address = request.getParameter("address");
            String sql = "INSERT INTO Account(username,password,address,fullname,phonenum) VALUES (N'" + uname + "',N'" + psw + "',N'" + address + "',N'" + fname + "',N'" + phonenum + "')";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            PrintWriter out = response.getWriter();
            out.println("Signed up successfully!" + address + "");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

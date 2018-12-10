/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import controller.DBConnection;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.AccountDAO;

/**
 *
 * @author ADMIN
 */
public class UpdateAccount extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession(true);
            if (session.getAttribute("user") == null) {
                response.sendRedirect("index.jsp");
            } else {
                request.setCharacterEncoding("UTF-8");
                String uname = request.getParameter("uname");
                String psw = request.getParameter("psw");
                String fname = request.getParameter("fname");
                int phonenum = Integer.parseInt(request.getParameter("phonenum"));
                String address = request.getParameter("address");
                Account acc = new Account(uname, psw, fname, phonenum, address);
                AccountDAO.updateAccount(acc);
                response.sendRedirect("index.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

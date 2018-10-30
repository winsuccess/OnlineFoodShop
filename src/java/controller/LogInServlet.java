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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class LogInServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {
        String url = request.getHeader("referer");
        if(url.contains("?"))
            url = url +"&";
        else
            url = url +"?";
        try {

            Account acc = new Account();
            acc.setUsername(request.getParameter("uname"));
            acc.setPassword(request.getParameter("psw"));
            acc = AccountDAO.LogIn(acc);

            if (acc.isValid()) {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser", acc);
                response.sendRedirect("index.jsp?log=1");
            } else {
               response.sendRedirect(url+"invalid=1");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

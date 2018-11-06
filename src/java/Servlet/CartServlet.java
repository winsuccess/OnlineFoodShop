/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import controller.CartManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Food;
import model.FoodDAO;
import model.Item;

/**
 *
 * @author ADMIN
 */
public class CartServlet extends HttpServlet {

    FoodDAO fDAO = new FoodDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String cmd = request.getParameter("command");
        String id = request.getParameter("id");
        Cart cart = (Cart) session.getAttribute("cart");
        CartManager cc = new CartManager(cart);
        try
        {
            Long fid = Long.parseLong(id);
            Food f = fDAO.getFood(fid);
            switch(cmd) {
                case "add":
                    if(cart.getCartItems().containsKey(fid))
                        cc.insertToCart(fid, new Item(f,cart.getCartItems().get(id).getQuantity()));
                    else
                        cc.insertToCart(fid, new Item(f,1));
                    
            }
        }catch (Exception e){
            e.printStackTrace(); }
    }

}

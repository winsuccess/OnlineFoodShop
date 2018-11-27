/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import model.Item;
import model.Cart;

/**
 *
 * @author ADMIN
 */
public class CartManager {

    private Cart c;

    public CartManager(Cart c) {
        this.c = c;
    }

    public void insertToCart(Long key, Item item) {
        boolean bln = c.getCartItems().containsKey(key);
        if (bln) {
            int quantity_old = item.getQuantity();
            item.setQuantity(quantity_old + 1);
            c.getCartItems().put(item.getFood().getId(), item);
        } else {
            c.getCartItems().put(item.getFood().getId(), item);
        }
    }

    public void subToCart(Long key, Item item) {
        boolean check = c.getCartItems().containsKey(key);
        if (check) {
            int quantity_old = item.getQuantity();
            if (quantity_old <= 1) {
                c.getCartItems().remove(key);
            } else {
                item.setQuantity(quantity_old - 1);
                c.getCartItems().put(key, item);
            }
        }
    }

    public int countItem() {
        int count = 0;
        count = c.getCartItems().size();
        return count;
    }

    public double total() {
        int count = 0;
        for (Map.Entry<Long, Item> list : c.getCartItems().entrySet()) {
            count += list.getValue().getFood().getPrice() * list.getValue().getQuantity();
        }
        return count;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RestaurantDAO;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Deki
 */
public class addRestaurant extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addRestaurant</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addRestaurant at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private String filename;
    private String res_id;
    private String res_name;
    private String res_address;
    private String res_type;
    private String res_rate;
    private String res_prepare;
    private String res_price;
    private String res_deliver;
    private String UPLOAD_DIRECTORY = "imgsrc/resimg";

    private void initParameter() {
        filename = "";
        res_id = "";
        res_name = "";
        res_address = "";
        res_type = "";
        res_rate = "";
        res_prepare = "";
        res_price = "";
        res_deliver = "";
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getParameter(request);
        out.println(res_rate);
        RestaurantDAO dao = new RestaurantDAO();
        try {
           dao.addRestaurant(filename, Integer.parseInt(res_id), res_name, res_address, res_type, Float.parseFloat(res_rate), Integer.parseInt(res_prepare), res_price, res_deliver);
        } catch (SQLException ex) {
            Logger.getLogger(addRestaurant.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("admin.jsp");
    }

    private void getParameter(HttpServletRequest request) {
        initParameter();
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
            List<FileItem> formItems = upload.parseRequest(request);
            //nếu có dữ liệu dc gửi lên
            if (formItems != null && formItems.size() > 0) {
                for (FileItem item : formItems) {
                    //nếu là các trường text, select ...
                    if (item.isFormField()) {
                        String fieldname = item.getFieldName();
                        String fieldvalue = item.getString("UTF-8");
                        //lấy các dữ liệu ứng với fieldname
                        if (fieldname.equals("res_id")) {
                            res_id = fieldvalue;
                        } else if (fieldname.equals("res_name")) {
                            res_name = fieldvalue;
                        } else if (fieldname.equals("res_address")) {
                            res_address = fieldvalue;
                        } else if (fieldname.equals("res_type")) {
                            res_type = fieldvalue;
                        } else if (fieldname.equals("res_rate")) {
                            res_rate = fieldvalue;
                        } else if (fieldname.equals("res_prepare")) {
                            res_prepare = fieldvalue;
                        } else if (fieldname.equals("res_price")) {
                            res_price = fieldvalue;
                        } else if (fieldname.equals("res_deliver")) {
                            res_deliver = fieldvalue;
                        }
                        
                        //nếu là file	
                    } else {
                        if (item.getContentType().equals("image/jpeg") || item.getContentType().equals("image/png")) {
                            filename = new File(item.getName()).getName();
                            String filepath = getServletContext().getRealPath("") + UPLOAD_DIRECTORY + File.separator + filename;
                            
                            //save file
                            File storeFile = new File(filepath);
                            item.write(storeFile);
                        }
                    }
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

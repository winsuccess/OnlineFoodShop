<%-- 
    Document   : admin
    Created on : Nov 27, 2018, 3:06:05 AM
    Author     : Deki
--%>

<%@page import="controller.RestaurantManager"%>
<%@page import="model.Account"%>
<%@page import="model.Restaurant"%>
<%@page import="model.RestaurantDAO"%>
<%@page import="model.AccountDAO"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Category  |  Admin</title>
        <meta charset= "UTF-8" >
        <link rel="stylesheet" type="text/css" href="css/admin.css" >
        <script src="admin.js"></script>
    </head>

    <body>
        <%
            RestaurantDAO rdao = new RestaurantDAO();
            AccountDAO accDAO = new AccountDAO();
            RestaurantManager resm = new RestaurantManager();
            Account acc = new Account();
            if (request.getParameter("uname") != null) {
                String name = "";
                name = request.getParameter("uname");
                acc = accDAO.getAccount(name);
            }
        %>
        <div id="nav1">
            <a href="index.jsp"><img id="logo" src="imgsrc/logo.png" alt="STARV"> </a>
            <h1>Trang Admin</h1>
        </div>

        <div id="nav2">
            <div id="sidenav">
                <a href=""><button class="transbutton"> Quản lý tài khoản </button> </a>
                <a href=""><button class="transbutton"> Quản lý nhà hàng </button> </a>
            </div>
            <div id="body-content">
                <div id="header">
                    <p id="header-name-text">Quản lý nhà hàng</p>
                    <div id="header-name-btn">                 
                        <button id="addnew"><img src="imgsrc/add-icon.png" style="width:16px;height:16px;" alt="error"> Thêm mới</button>
                    </div>
                </div>
                <div id="table-header">
                    <span>Có tổng cộng </span> 
                    <span style="color: red"><%=resm.countRestaurant()%></span> 
                    <span>nhà hàng</span>
                </div>
                <table id="myTable" cellpadding="10">
                    <tr>
                        <th>Mã</th>
                        <th>Thông tin nhà hàng</th>
                        <th>Giá tiền</th>
                        <th>Đánh giá</th>
                        <th>Thao tác</th>
                    </tr>
                    <%
                        for (Restaurant r : rdao.getListRestaurant()) {
                    %>
                    <tr>
                        <td width="10%"><%= r.getId()%></td>
                        <td>
                            <div class="product-image">
                                <img alt="error" src="imgsrc/resimg/<%=r.getPic()%>" style="width:50px;height:50px;" />
                            </div>
                            <div class="product-text">
                                <p><%=r.getName()%></p>
                                <p><%=r.getAddress()%></p>
                            </div>
                        </td>
                        <td width="15%"><%=r.getPrice()%></td>
                        <td width="10%"><%=r.getRating()%></td>
                        <td width="15%">
                            <a href="#" title="Chỉnh sửa">
                                <img src="imgsrc/edit.png" alt="error">
                            </a>
                            <a href="##" title="Xóa" onclick="delete_confirm(event)">
                                <img src="imgsrc/icon-delete.png" alt="error">
                            </a>
                        </td>
                    </tr>
                    <% }%>
                </table>
                <div class="table-divider">
                    <span>Trước</span>
                    <span>1</span>
                    <span>2</span>
                    <span>3</span>
                    ...
                    <span>99</span>
                    <span>Sau</span>
                </div>
            </div>
        </div>
    </body>
</html>



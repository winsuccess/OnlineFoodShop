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
        <script src="js/admin.js"></script>
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
            <a href="admin.jsp"><img id="logo" src="imgsrc/logo.png" alt="STARV"> </a>
            <div id="logged">
                <a href="LogOutServlet"><button class="log">Đăng xuất</button></a>
            </div>
        </div>

        <div id="nav2">
            <div class="left-content">
                <div class="logo">
                    <img alt="error" src="imgsrc/admin-image.png">
                    <span>Xin chào, Admin!</span>
                </div>
                <div class="admin-home">
                    <img alt="error" src="imgsrc/icon/icon-homee.png">
                    <a href="#">BẢNG ĐIỀU KHIỂN</a>
                </div>
                <div class="sidebar-rows" onclick="sidebarDrop(this)">
                    <img alt="error" src="imgsrc/icon/icon-trade.png">
                    <span>QUẢN LÝ NHÀ HÀNG</span>
                </div>
                <div class="sidebar-contents">
                    <div class="sidebar-contents-row">
                        <img alt="error" src="imgsrc/icon/icon-next-sidebar.png">
                        <a href="#">Giao dịch</a>
                    </div>
                </div>
                <div class="sidebar-rows" onclick="sidebarDrop(this)">
                    <img alt="error" src="imgsrc/icon/icon-product.png">
                    <span>NHÀ HÀNG</span>
                </div>
                <div class="sidebar-contents">
                    <div class="sidebar-contents-row">
                        <img alt="error" src="imgsrc/icon/icon-next-sidebar.png">
                        <a href="#">Danh mục</a>
                    </div>
                    <div class="sidebar-contents-row">
                        <img alt="error" src="imgsrc/icon/icon-next-sidebar.png">
                        <a href="#">Quản lý nhà hàng</a>
                    </div>
                </div>
                <div class="sidebar-rows" onclick="sidebarDrop(this)">
                    <img alt="error" src="imgsrc/icon/icon-account-white.png">
                    <span>TÀI KHOẢN</span>
                </div>
                <div class="sidebar-contents">
                    <div class="sidebar-contents-row">
                        <img alt="error" src="imgsrc/icon/icon-next-sidebar.png">
                        <a href="#">Quản trị viên</a>
                    </div>
                    <div class="sidebar-contents-row">
                        <img alt="error" src="imgsrc/icon/icon-next-sidebar.png">
                        <a href="#">Khách hàng</a>
                    </div>
                </div>
            </div>
            <div class="body-content">
                <div id="header">
                    <p id="header-name-text">Quản lý nhà hàng</p>
                    <div id="header-name-btn">                 
                        <a href="res_add.jsp" target="_blank">
                            <button id="addnew"><img src="imgsrc/add-icon.png" style="width:16px;height:16px;" alt="error"> Thêm mới</button>
                        </a>
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



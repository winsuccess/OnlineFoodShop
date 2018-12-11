<%-- 
    Document   : Restaurant_add
    Created on : Dec 10, 2018, 5:43:14 PM
    Author     : Deki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Product  |  Admin</title>
        <link href="css/admin.css?v=1.0.0" rel="stylesheet">
        <script src="js/admin.js?v=1.0.0"></script>
    </head>
    <body>
        <div id="nav1">
            <a href="index.jsp"><img id="logo" src="imgsrc/logo.png" alt="STARV"> </a>
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
                    <span>QUẢN LÝ BÁN HÀNG</span>
                </div>
                <div class="sidebar-contents">
                    <div class="sidebar-contents-row">
                        <img alt="error" src="imgsrc/icon/icon-next-sidebar.png">
                        <a href="#">Giao dịch</a>
                    </div>
                </div>
                <div class="sidebar-rows" onclick="sidebarDrop(this)">
                    <img alt="error" src="imgsrc/icon/icon-product.png">
                    <span>SẢN PHẨM</span>
                </div>
                <div class="sidebar-contents">
                    <div class="sidebar-contents-row">
                        <img alt="error" src="imgsrc/icon/icon-next-sidebar.png">
                        <a href="#">Danh mục</a>
                    </div>
                    <div class="sidebar-contents-row">
                        <img alt="error" src="imgsrc/icon/icon-next-sidebar.png">
                        <a href="#">Sản phẩm</a>
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
                    <div class="header-name-text">
                        <p id="header-name-text">Thêm mới nhà hàng</p>
                    </div>
                </div>
                <div class="content-form">
                    <form action="/OnlineFoodShop/addRestaurant" method="post" enctype="multipart/form-data">
                        <div class="content-form-rows">
                            <span>Mã nhà hàng :</span>
                            <input class="rows-content-text" name="res_id" type="text">
                        </div>
                        <div class="content-form-rows">
                            <span>Tên nhà hàng :</span>
                            <input class="rows-content-text" name="res_name" type="text">
                        </div>
                        <div class="content-form-rows">
                            <span>Ảnh minh họa :</span>
                            <input class="rows-content-text" name="res_image" type="file">
                        </div>
                        <div class="content-form-rows">
                            <span>Địa chỉ :</span>
                            <input class="rows-content-text" name="res_address" type="text">
                        </div>
                        <div class="content-form-rows">
                            <span>Thể loại :</span>
                            <select name="res_type" onchange="enableGroupId(this)" class="rows-content-select">
                                <option value="Đồ ăn">Đồ ăn</option>
                                <option value="Đồ uống">Đồ uống</option>
                            </select>
                        </div>
                        <div class="content-form-rows">
                            <span>Đánh giá:</span>
                            <input class="rows-content-text" name="res_rate" type="text">
                        </div>
                        <div class="content-form-rows">
                            <span>Thời gian chuẩn bị:</span>
                            <input class="rows-content-text" name="res_prepare" type="text">
                        </div>
                        <div class="content-form-rows">
                            <span>Giá TB:</span>
                            <input class="rows-content-text" name="res_price" type="text">
                        </div>
                        <div class="content-form-rows">
                            <span>Phí giao hàng :</span>
                            <input class="rows-content-text" name="res_deliver" type="text">
                        </div>
                        <div class="content-form-btn">
                            <a href="/OnlineFoodShop/adminView/Restaurant_home.jsp">Hủy</a>
                            <input id="myButton" type="submit" value="Thêm mới" onclick="checkText(event)">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

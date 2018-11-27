<%-- 
    Document   : item
    Created on : Oct 30, 2018, 10:32:41 AM
    Author     : ThangDo
--%>

<%@page import="controller.CartManager"%>
<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.Cart"%>
<%@page import="model.FoodDAO"%>
<%@page import="model.Food"%>
<%@page import="model.Account"%>
<%@page import="model.AccountDAO"%>
<%@page import="model.Restaurant"%>
<%@page import="model.RestaurantDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title></title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- External files -->
        <link rel="stylesheet" type="text/css" href="item.css">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.2/css/all.css">
        <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet'>
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet'>
        <link href='https://fonts.googleapis.com/css?family=Rubik' rel='stylesheet'>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab' rel='stylesheet'>
    </head>

    <body>

        <%
            RestaurantDAO resDAO = new RestaurantDAO();
            FoodDAO fDAO = new FoodDAO();
            Restaurant r = new Restaurant();
            String id = "";
            if (request.getParameter("id") != null) {
                id = request.getParameter("id");
                r = resDAO.getRestaurant(Integer.parseInt(id));
            }
            AccountDAO accDAO = new AccountDAO();
            Account acc = new Account();
            String name = "";
            name = request.getParameter("uname");
            acc = accDAO.getAccount(name);

            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            CartManager cm = new CartManager(cart);
        %>

        <div class="nav1">
            <a href="index.jsp"><img id="logo" src="logo.png" alt="STARV"> </a>
            <div id="login">
                <button class="log" onclick="openForm('loginform')">Đăng nhập</button>
                <button class="log" onclick="openForm('signupform')">Đăng ký</button>
            </div>
            <div id="logged">
                <a href="LogOutServlet"><button class="log">Đăng xuất</button> </a>
            </div>
        </div>
        <div class="nav2">
            <img id="itemimg" src="imgsrc/resimg/<%=r.getPic()%>" alt="">
            <div id="detail">
                <p id="direct">Trang chủ >> Hà Nội</p>
                <p id="type"><%=r.getType()%></p>
                <p id="productname"><%=r.getName()%></p>
                <p id="adress"><%=r.getAddress()%></p>
                <p id="price"><i class="fas fa-dollar-sign"></i><%=r.getPrice()%> VND</p>

                <table class="by">
                    <tr>
                        <th>Phí dịch vụ</th>
                        <th>Phí vận chuyển</th>
                        <th>Dịch vụ bởi</th>
                        <th>Chuẩn bị</th>
                    </tr>
                    <tr>
                        <td>Free</td>
                        <td><%=r.getDelivery()%></td>
                        <td style="color: #ffd64d;">Starv</td>
                        <td><%=r.getPrepareTime()%> phút</td>
                    </tr>
                </table>
            </div>
        </div>

        <div class="nav3">
            <p id="thucdon">THỰC ĐƠN</p>
            <div class="nav31">
                <button id="itemtype"> FRUIT TEA</button> <br>
            </div>
            <div class="nav32">
                <button id="itemtype2"> FRUIT TEA</button>
                <%
                    for (Food f : fDAO.getListFoodByRestaurant(Integer.parseInt(id))) {
                %>
                <div id="food">
                    <img id="fimg" src="imgsrc/foodimg/<%=f.getPic()%>" alt="">
                    <div id="fdetail">
                        <p id="fname"><%=f.getName()%></p>
                        <p id="forder">Đã được đặt <span><%=f.getTimes()%></span> lần</p>
                        <span id="fprice"> <%=f.getPrice()%>đ</span>
                    </div>
                    <a href="CartServlet?command=add&id=<%=r.getId()%>&fid=<%=f.getId()%>"> <button id="addfood" type="button" onclick="themHang()"> +</button> </a>

                </div>                         <%}%>

            </div>
            <div class="nav33">
                <%for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {%>
                <div id="itemadded">
                    <div><a href="CartServlet?command=add&id=<%=r.getId()%>&fid=<%=list.getValue().getFood().getId()%>"><button id="add" type="button" onclick="congHang()">+</button></a>
                        <span id="fcount"><%=list.getValue().getQuantity()%></span>
                        <a href="CartServlet?command=sub&id=<%=r.getId()%>&fid=<%=list.getValue().getFood().getId()%>"><button id="subtract"type="button" onclick="truHang()">-</button></a>
                        <span id="fname2"><%=list.getValue().getFood().getName()%></span> </div>
                    <p id="fprice2"><%=list.getValue().getFood().getPrice()%></p>
                </div>
                <% }%>
                <div id="billrow">
                    <p id="billtext1"> Tổng: </p>
                    <p id="billtext2"><%=cm.total()%></p>
                </div>
                <div id="billrow">
                    <p id="billtext1"> Phí vận chuyển: </p>
                    <p id="billtext2"><%=r.getDelivery()%>  </p>
                </div>
                <button id="buy" type="button" onclick="muaHang()">Mua Hàng</button>
            </div>
        </div>

        <div class="footer">
            <div class="insidefooter" id="f1">
                <img id="logo" src="logo.png" alt="STARV">
            </div>

            <div class="insidefooter" id="f2">
                <table class="list">
                    <tr>
                        <th>About Starv</th>
                        <th>For Foodies</th>
                        <th>For Restaurants</th>
                    </tr>
                    <tr>
                        <td>About Us</td>
                        <td>Code of Conduct</td>
                        <td>Business App</td>
                        <td>Advertisement</td>
                    </tr>
                    <tr>
                        <td>Culture</td>
                        <td>Community</td>
                        <td>Products for Businesses</td>
                        <td>Order</td>
                    </tr>
                    <tr>
                        <td>Blog</td>
                        <td>Verified Users</td>
                        <td>Code of Conduct</td>
                        <td>Book</td>
                    </tr>
                    <tr>
                        <td>Jobs</td>
                        <td>Developers</td>
                        <td>Claim your Listing</td>
                        <td>Trace</td>
                    </tr>
                    <tr>
                        <td>Contact Us</td>
                        <td>Mobile Apps</td>
                        <td>More Restaurants</td>
                    </tr>
                    <tr>
                        <td>

                        </td>
                        <td>

                        </td>
                        <td>
                            Restaurant Widgets
                        </td>
                    </tr>
                </table>
            </div>
            <div class="insidefooter" id="f3">
                <table class="list">
                    <tr>
                        <th>Popular Cities</th>
                        <th>Popular Restaurants</th>
                        <th>Top Brands</th>
                    </tr>
                    <tr>
                        <td>Hanoi</td>
                        <td>French Grill</td>
                        <td>KFC</td>
                    </tr>
                    <tr>
                        <td>Ho Chi Minh City</td>
                        <td>Crystal Jade Palace</td>
                        <td>Highlands Coffee</td>
                    </tr>
                    <tr>
                        <td>Hoi An</td>
                        <td>Noir.</td>
                        <td>Lotteria</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Da Nang</td>
                        <td>Home Finest Saigon</td>
                        <td>Starbuck</td>
                    </tr>
                    <tr>
                        <td>Dalat</td>
                        <td>Nhan's Kitchen</td>
                        <td>McDonald’s</td>
                    </tr>
                    <tr>
                        <td>Hue</td>
                        <td>MIX Restaurant</td>
                        <td>Pizza Hut</td>
                    </tr>
                </table>
            </div>
            <div class="insidefooter" id="f4">
                <p id="git">Get in touch</p>
                <img class="socialmedialogo" src="imgsrc/facebook.png" alt="facebook">
                <img class="socialmedialogo" src="imgsrc/twitter.png" alt="facebook">
                <img class="socialmedialogo" src="imgsrc/instagram.png" alt="facebook">
                <img class="socialmedialogo" src="imgsrc/google-plus.png" alt="facebook">
                <img class="socialmedialogo" src="imgsrc/linkedin.png" alt="facebook">
            </div>
            <div class="insidefooter" id="f5">
                <p> Terms and Conditions • Privacy Policy © Copyright 2018 Starv is a registered trademark • Starv Vietnam
                </p>
            </div>
        </div>

        <div class="form-popup" id="loginform">
            <form action="LogInServlet" method="post" class="form-container">
                <p id="logintitle">Đăng nhập vào Starv</p>
                <label class="detail" for="uname">Tên tài khoản</label>
                <input class="inf" name="uname" required>
                <label class="detail" for="psw">Mật khẩu</label>
                <input type ="password" class="inf" name="psw" required>
                <label for="save" class="save">Lưu đăng nhập
                    <input type="checkbox" id="save" onclick="myFunction()"> <span class="checkmark"></span>
                </label> <br>
                <p id="invalid">Bạn đã điền sai tên đăng nhập hoặc mật khẩu<p>
                    <input class="btnDang" type="submit" onclick="mybtnDangNhap()" value="Đăng nhập">
                    <label for="dk">Chưa có tài khoản? <button type="button" id="dk" onclick="closeForm('loginform'), openForm('signupform')">Đăng
                            ký</button></label>
            </form>
        </div>

        <div class="form-popup" id="signupform">
            <form action="SignUpServlet" method="post" class="form-container">
                <p id="logintitle">Đăng ký tài khoản tại Starv</p>
                <label class="detail" for="fname">Họ tên</label>
                <input class="inf" name="fname" required>
                <label class="detail" for="phonenum">Số điện thoại</label>
                <input class="inf" name="phonenum" required>
                <label class="detail" for="address">Địa chỉ</label>
                <input class="inf" name="address" required>
                <label class="detail" for="uname">Tên tài khoản</label>
                <input class="inf" name="uname" required>
                <label class="detail" for="psw">Mật khẩu</label>
                <input type ="password" class="inf" name="psw" required>
                <button class="btnDang" type="submit" onclick="mybtnDangKy()">Đăng Ký</button>
            </form>
        </div>

        <script>
            var form;
            function showInvalid(show) {
                document.getElementById("invalid").style.display = show;
            }
            function openForm(form) {
                document.getElementById(form).style.display = "block";
                showInvalid("none");
            }

            function closeForm(form) {
                document.getElementById(form).style.display = "none";
                showInvalid("none");
            }

            var modal1 = document.getElementById('loginform');
            var modal2 = document.getElementById('signupform');
            window.onclick = function (event) {
                if (event.target === modal1) {
                    modal1.style.display = "none";
                }
                if (event.target === modal2) {
                    modal2.style.display = "none";
                }
            };
            <%
                String inv;
                if ((inv = request.getParameter("invalid")) != null) {%>
            showInvalid("block");
            document.getElementById("loginform").style.display = "block";
            <%}
                if (session != null) {
                    if (session.getAttribute("user") != null) {%>
            document.getElementById("login").style.display = "none";
            document.getElementById("logged").style.display = "block";
            <%}
                }%>
        </script>
    </body>

</html>

<%-- 
    Document   : index
    Created on : Oct 28, 2018, 7:48:05 PM
    Author     : ThangDo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="controller.RestaurantManager"%>
<%@page import="model.AccountDAO"%>
<%@page import="model.Account"%>
<%@page import="model.Restaurant"%>
<%@page import="model.RestaurantDAO"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Starv - Đồ ăn trực tuyến</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- External files -->
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet'>
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet'>
        <link href='https://fonts.googleapis.com/css?family=Rubik' rel='stylesheet'>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab' rel='stylesheet'>
    </head>

    <body>

        <%
            RestaurantDAO rdao = new RestaurantDAO();
            RestaurantManager resm = new RestaurantManager();
            AccountDAO accDAO = new AccountDAO();
            Account acc = new Account();
             if (session.getAttribute("user") != null)
            acc =(Account) session.getAttribute("user");
            if (request.getParameter("uname") != null) {
                String name = "";
                name = request.getParameter("uname");
                acc = accDAO.getAccount(name);
            }
        %>

        <div class="nav1">
            <a href="index.jsp"><img id="logo" src="logo.png" alt="STARV"> </a>
            <div id="login">
                <button class="log" onclick="openForm('loginform')">Đăng nhập</button>
                <button class="log" onclick="openForm('signupform')">Đăng ký</button>
            </div>
            <div id="logged">
                <button class="log2" onclick="openForm('updateform')">Thông tin cá nhân</button>
                <a href="LogOutServlet"><button class="log">Đăng xuất</button></a>
            </div>
        </div>

        <div class="nav2">
            <form method="post" name="frm" action="SearchServlet">
                <input type="text" name="searchtext" id="searchbar" value="" placeholder="Nhập đồ ăn" /><button id="searchbutton" type="submit">TÌM KIẾM</button>
            </form>
        </div>

        <div class="main">
            <div class="sidebar">
                <p> Ẩm thực </p>
                <a href="index.jsp"> <button class="transbutton"> Tất cả </button> </a>
                <a href="index.jsp?type=Đồ+uống"> <button class="transbutton" > Đồ uống </button></a>
                <a href="index.jsp?type=Đồ+ăn"> <button class="transbutton"> Đồ ăn </button> </a>
                <a href="index.jsp?type=Tráng miệng"> <button class="transbutton"> Tráng miệng </button> </a>
                <!--                <button type="extra" onclick="more()">Hơn nữa <i class="arrow down"></i></button>-->
                <p> Nhận xét </p>
                <div class="wbutton">
                    <fieldset class="rating">
                        <input type="radio" id="star5" name="rating" value="5" /><label class="full" for="star5" title="Awesome - 5 stars"></label>
                        <input type="radio" id="star4half" name="rating" value="4 and a half" /><label class="half" for="star4half"
                                                                                                       title="Pretty good - 4.5 stars"></label>
                        <input type="radio" id="star4" name="rating" value="4" /><label class="full" for="star4" title="Pretty good - 4 stars"></label>
                        <input type="radio" id="star3half" name="rating" value="3 and a half" /><label class="half" for="star3half"
                                                                                                       title="Meh - 3.5 stars"></label>
                        <input type="radio" id="star3" name="rating" value="3" /><label class="full" for="star3" title="Meh - 3 stars"></label>
                        <input type="radio" id="star2half" name="rating" value="2 and a half" /><label class="half" for="star2half"
                                                                                                       title="Kinda bad - 2.5 stars"></label>
                        <input type="radio" id="star2" name="rating" value="2" /><label class="full" for="star2" title="Kinda bad - 2 stars"></label>
                        <input type="radio" id="star1half" name="rating" value="1 and a half" /><label class="half" for="star1half"
                                                                                                       title="Meh - 1.5 stars"></label>
                        <input type="radio" id="star1" name="rating" value="1" /><label class="full" for="star1" title="Sucks big time - 1 star"></label>
                        <input type="radio" id="starhalf" name="rating" value="half" /><label class="half" for="starhalf"
                                                                                              title="Sucks big time - 0.5 stars"></label>
                    </fieldset>
                </div>
                <p> Mức giá </p>
                <p> Khuyến mại </p>
            </div>

            <div class="items">
                <%
                    String type = "";
                    if (request.getParameter("type") == null && request.getAttribute("searchlist") == null) {
                        for (Restaurant r : rdao.getListRestaurant()) {
                %>
                <a href="item.jsp?id=<%=r.getId()%>">
                    <div class="item">
                        <img id="itemimg" src="imgsrc/resimg/<%=r.getPic()%>" alt="">
                        <div id="itemdetail">
                            <p id="itemname"><%=r.getName()%></p>
                            <p id="itemlocation"><%=r.getAddress()%></p>
                            <p id="itemprice"><%=r.getPrice()%> VND</p>
                        </div>
                        <span id="itemrank"><%=r.getRating()%></span>
                    </div>
                </a>
                <%
                    }
                } else if (request.getParameter("type") != null) {
                    type = request.getParameter("type");
                    for (Restaurant r : resm.searchByTypeRestaurant(type)) {
                %>
                <a  href ="item.jsp?id=<%=r.getId()%>">
                    <div class="item">
                        <img id="itemimg" src="imgsrc/resimg/<%=r.getPic()%>" alt="">
                        <div id="itemdetail">
                            <p id="itemname"><%=r.getName()%></p>
                            <p id="itemlocation"><%=r.getAddress()%></p>
                            <p id="itemprice"><%=r.getPrice()%> VND</p>
                        </div>
                        <span id="itemrank"><%=r.getRating()%></span>
                    </div>
                </a>
                <%
                    }
                } else if (request.getAttribute("searchlist") != null) {
                    ArrayList<Restaurant> rlist = (ArrayList<Restaurant>) request.getAttribute("searchlist");
                    for (Restaurant r : rlist) {
                %>
                <a  href ="item.jsp?id=<%=r.getId()%>">
                    <div class="item">
                        <img id="itemimg" src="imgsrc/resimg/<%=r.getPic()%>" alt="">
                        <div id="itemdetail">
                            <p id="itemname"><%=r.getName()%></p>
                            <p id="itemlocation"><%=r.getAddress()%></p>
                            <p id="itemprice"><%=r.getPrice()%> VND</p>
                        </div>
                        <span id="itemrank"><%=r.getRating()%></span>
                    </div>
                </a>
                <%
                        }
                    }
                %>
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

        <div class="form-popup" id="updateform">
            <form action="UpdateAccount" method="post" class="form-container">
                <p id="logintitle">Thay đổi thông tin cá nhân</p>
                <label class="detail" for="fname">Họ tên</label>
                <input class="inf" name="fname" required>
                <label class="detail" for="phonenum">Số điện thoại</label>
                <input class="inf" name="phonenum" required>
                <label class="detail" for="address">Địa chỉ</label>
                <input class="inf" name="address" required>
                <label class="detail" for="uname">Tên tài khoản</label>
                <input class="inf" name="uname"value="<%=acc.getUsername()%>" readonly> 
                <label class="detail" for="psw">Mật khẩu</label>
                <input type ="password" class="inf" name="psw" required>
                <button class="btnDang" type="submit">Cập nhật thông tin</button>
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
            var modal3 = document.getElementById('updateform');
            window.onclick = function (event) {
                if (event.target === modal1) {
                    modal1.style.display = "none";
                }
                if (event.target === modal2) {
                    modal2.style.display = "none";
                }
                if (event.target === modal3) {
                    modal3.style.display = "none";
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
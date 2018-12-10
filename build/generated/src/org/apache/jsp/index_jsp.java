package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import controller.RestaurantManager;
import model.AccountDAO;
import model.Account;
import model.Restaurant;
import model.RestaurantDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Starv - Đồ ăn trực tuyến</title>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- External files -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Rubik' rel='stylesheet'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab' rel='stylesheet'>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"nav1\">\n");
      out.write("            <a href=\"index.jsp\"><img id=\"logo\" src=\"logo.png\" alt=\"STARV\"> </a>\n");
      out.write("            <div id=\"login\">\n");
      out.write("                <button class=\"log\" onclick=\"openForm('loginform')\">Đăng nhập</button>\n");
      out.write("                <button class=\"log\" onclick=\"openForm('signupform')\">Đăng ký</button>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"logged\">\n");
      out.write("                <button class=\"log2\" onclick=\"openForm('updateform')\">Thông tin cá nhân</button>\n");
      out.write("                <a href=\"LogOutServlet\"><button class=\"log\">Đăng xuất</button></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"nav2\">\n");
      out.write("            <form method=\"post\" name=\"frm\" action=\"SearchServlet\">\n");
      out.write("                <input type=\"text\" name=\"searchtext\" id=\"searchbar\" value=\"\" placeholder=\"Nhập đồ ăn\" /><button id=\"searchbutton\" type=\"submit\">TÌM KIẾM</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <p> Ẩm thực </p>\n");
      out.write("                <a href=\"index.jsp\"> <button class=\"transbutton\"> Tất cả </button> </a>\n");
      out.write("                <a href=\"index.jsp?type=Đồ+uống\"> <button class=\"transbutton\" > Đồ uống </button></a>\n");
      out.write("                <a href=\"index.jsp?type=Đồ+ăn\"> <button class=\"transbutton\"> Đồ ăn </button> </a>\n");
      out.write("                <a href=\"index.jsp?type=Tráng miệng\"> <button class=\"transbutton\"> Tráng miệng </button> </a>\n");
      out.write("                <!--                <button type=\"extra\" onclick=\"more()\">Hơn nữa <i class=\"arrow down\"></i></button>-->\n");
      out.write("                <p> Nhận xét </p>\n");
      out.write("                <div class=\"wbutton\">\n");
      out.write("                    <fieldset class=\"rating\">\n");
      out.write("                        <input type=\"radio\" id=\"star5\" name=\"rating\" value=\"5\" /><label class=\"full\" for=\"star5\" title=\"Awesome - 5 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star4half\" name=\"rating\" value=\"4 and a half\" /><label class=\"half\" for=\"star4half\"\n");
      out.write("                                                                                                       title=\"Pretty good - 4.5 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star4\" name=\"rating\" value=\"4\" /><label class=\"full\" for=\"star4\" title=\"Pretty good - 4 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star3half\" name=\"rating\" value=\"3 and a half\" /><label class=\"half\" for=\"star3half\"\n");
      out.write("                                                                                                       title=\"Meh - 3.5 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star3\" name=\"rating\" value=\"3\" /><label class=\"full\" for=\"star3\" title=\"Meh - 3 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star2half\" name=\"rating\" value=\"2 and a half\" /><label class=\"half\" for=\"star2half\"\n");
      out.write("                                                                                                       title=\"Kinda bad - 2.5 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star2\" name=\"rating\" value=\"2\" /><label class=\"full\" for=\"star2\" title=\"Kinda bad - 2 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star1half\" name=\"rating\" value=\"1 and a half\" /><label class=\"half\" for=\"star1half\"\n");
      out.write("                                                                                                       title=\"Meh - 1.5 stars\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"star1\" name=\"rating\" value=\"1\" /><label class=\"full\" for=\"star1\" title=\"Sucks big time - 1 star\"></label>\n");
      out.write("                        <input type=\"radio\" id=\"starhalf\" name=\"rating\" value=\"half\" /><label class=\"half\" for=\"starhalf\"\n");
      out.write("                                                                                              title=\"Sucks big time - 0.5 stars\"></label>\n");
      out.write("                    </fieldset>\n");
      out.write("                </div>\n");
      out.write("                <p> Mức giá </p>\n");
      out.write("                <p> Khuyến mại </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"items\">\n");
      out.write("                ");

                    String type = "";
                    if (request.getParameter("type") == null && request.getAttribute("searchlist") == null) {
                        for (Restaurant r : rdao.getListRestaurant()) {
                
      out.write("\n");
      out.write("                <a href=\"item.jsp?id=");
      out.print(r.getId());
      out.write("\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img id=\"itemimg\" src=\"imgsrc/resimg/");
      out.print(r.getPic());
      out.write("\" alt=\"\">\n");
      out.write("                        <div id=\"itemdetail\">\n");
      out.write("                            <p id=\"itemname\">");
      out.print(r.getName());
      out.write("</p>\n");
      out.write("                            <p id=\"itemlocation\">");
      out.print(r.getAddress());
      out.write("</p>\n");
      out.write("                            <p id=\"itemprice\">");
      out.print(r.getPrice());
      out.write(" VND</p>\n");
      out.write("                        </div>\n");
      out.write("                        <span id=\"itemrank\">");
      out.print(r.getRating());
      out.write("</span>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                ");

                    }
                } else if (request.getParameter("type") != null) {
                    type = request.getParameter("type");
                    for (Restaurant r : resm.searchByTypeRestaurant(type)) {
                
      out.write("\n");
      out.write("                <a  href =\"item.jsp?id=");
      out.print(r.getId());
      out.write("\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img id=\"itemimg\" src=\"imgsrc/resimg/");
      out.print(r.getPic());
      out.write("\" alt=\"\">\n");
      out.write("                        <div id=\"itemdetail\">\n");
      out.write("                            <p id=\"itemname\">");
      out.print(r.getName());
      out.write("</p>\n");
      out.write("                            <p id=\"itemlocation\">");
      out.print(r.getAddress());
      out.write("</p>\n");
      out.write("                            <p id=\"itemprice\">");
      out.print(r.getPrice());
      out.write(" VND</p>\n");
      out.write("                        </div>\n");
      out.write("                        <span id=\"itemrank\">");
      out.print(r.getRating());
      out.write("</span>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                ");

                    }
                } else if (request.getAttribute("searchlist") != null) {
                    ArrayList<Restaurant> rlist = (ArrayList<Restaurant>) request.getAttribute("searchlist");
                    for (Restaurant r : rlist) {
                
      out.write("\n");
      out.write("                <a  href =\"item.jsp?id=");
      out.print(r.getId());
      out.write("\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img id=\"itemimg\" src=\"imgsrc/resimg/");
      out.print(r.getPic());
      out.write("\" alt=\"\">\n");
      out.write("                        <div id=\"itemdetail\">\n");
      out.write("                            <p id=\"itemname\">");
      out.print(r.getName());
      out.write("</p>\n");
      out.write("                            <p id=\"itemlocation\">");
      out.print(r.getAddress());
      out.write("</p>\n");
      out.write("                            <p id=\"itemprice\">");
      out.print(r.getPrice());
      out.write(" VND</p>\n");
      out.write("                        </div>\n");
      out.write("                        <span id=\"itemrank\">");
      out.print(r.getRating());
      out.write("</span>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"insidefooter\" id=\"f1\">\n");
      out.write("                <img id=\"logo\" src=\"logo.png\" alt=\"STARV\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"insidefooter\" id=\"f2\">\n");
      out.write("                <table class=\"list\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>About Starv</th>\n");
      out.write("                        <th>For Foodies</th>\n");
      out.write("                        <th>For Restaurants</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>About Us</td>\n");
      out.write("                        <td>Code of Conduct</td>\n");
      out.write("                        <td>Business App</td>\n");
      out.write("                        <td>Advertisement</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Culture</td>\n");
      out.write("                        <td>Community</td>\n");
      out.write("                        <td>Products for Businesses</td>\n");
      out.write("                        <td>Order</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Blog</td>\n");
      out.write("                        <td>Verified Users</td>\n");
      out.write("                        <td>Code of Conduct</td>\n");
      out.write("                        <td>Book</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Jobs</td>\n");
      out.write("                        <td>Developers</td>\n");
      out.write("                        <td>Claim your Listing</td>\n");
      out.write("                        <td>Trace</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Contact Us</td>\n");
      out.write("                        <td>Mobile Apps</td>\n");
      out.write("                        <td>More Restaurants</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            Restaurant Widgets\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"insidefooter\" id=\"f3\">\n");
      out.write("                <table class=\"list\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Popular Cities</th>\n");
      out.write("                        <th>Popular Restaurants</th>\n");
      out.write("                        <th>Top Brands</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Hanoi</td>\n");
      out.write("                        <td>French Grill</td>\n");
      out.write("                        <td>KFC</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Ho Chi Minh City</td>\n");
      out.write("                        <td>Crystal Jade Palace</td>\n");
      out.write("                        <td>Highlands Coffee</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Hoi An</td>\n");
      out.write("                        <td>Noir.</td>\n");
      out.write("                        <td>Lotteria</td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Da Nang</td>\n");
      out.write("                        <td>Home Finest Saigon</td>\n");
      out.write("                        <td>Starbuck</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Dalat</td>\n");
      out.write("                        <td>Nhan's Kitchen</td>\n");
      out.write("                        <td>McDonald’s</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Hue</td>\n");
      out.write("                        <td>MIX Restaurant</td>\n");
      out.write("                        <td>Pizza Hut</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"insidefooter\" id=\"f4\">\n");
      out.write("                <p id=\"git\">Get in touch</p>\n");
      out.write("                <img class=\"socialmedialogo\" src=\"imgsrc/facebook.png\" alt=\"facebook\">\n");
      out.write("                <img class=\"socialmedialogo\" src=\"imgsrc/twitter.png\" alt=\"facebook\">\n");
      out.write("                <img class=\"socialmedialogo\" src=\"imgsrc/instagram.png\" alt=\"facebook\">\n");
      out.write("                <img class=\"socialmedialogo\" src=\"imgsrc/google-plus.png\" alt=\"facebook\">\n");
      out.write("                <img class=\"socialmedialogo\" src=\"imgsrc/linkedin.png\" alt=\"facebook\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"insidefooter\" id=\"f5\">\n");
      out.write("                <p> Terms and Conditions • Privacy Policy © Copyright 2018 Starv is a registered trademark • Starv Vietnam\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-popup\" id=\"loginform\">\n");
      out.write("            <form action=\"LogInServlet\" method=\"post\" class=\"form-container\">\n");
      out.write("                <p id=\"logintitle\">Đăng nhập vào Starv</p>\n");
      out.write("                <label class=\"detail\" for=\"uname\">Tên tài khoản</label>\n");
      out.write("                <input class=\"inf\" name=\"uname\" required>\n");
      out.write("                <label class=\"detail\" for=\"psw\">Mật khẩu</label>\n");
      out.write("                <input type =\"password\" class=\"inf\" name=\"psw\" required>\n");
      out.write("                <label for=\"save\" class=\"save\">Lưu đăng nhập\n");
      out.write("                    <input type=\"checkbox\" id=\"save\" onclick=\"myFunction()\"> <span class=\"checkmark\"></span>\n");
      out.write("                </label> <br>\n");
      out.write("                <p id=\"invalid\">Bạn đã điền sai tên đăng nhập hoặc mật khẩu<p>\n");
      out.write("                    <input class=\"btnDang\" type=\"submit\" onclick=\"mybtnDangNhap()\" value=\"Đăng nhập\">\n");
      out.write("                    <label for=\"dk\">Chưa có tài khoản? <button type=\"button\" id=\"dk\" onclick=\"closeForm('loginform'), openForm('signupform')\">Đăng\n");
      out.write("                            ký</button></label>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-popup\" id=\"signupform\">\n");
      out.write("            <form action=\"SignUpServlet\" method=\"post\" class=\"form-container\">\n");
      out.write("                <p id=\"logintitle\">Đăng ký tài khoản tại Starv</p>\n");
      out.write("                <label class=\"detail\" for=\"fname\">Họ tên</label>\n");
      out.write("                <input class=\"inf\" name=\"fname\" required>\n");
      out.write("                <label class=\"detail\" for=\"phonenum\">Số điện thoại</label>\n");
      out.write("                <input class=\"inf\" name=\"phonenum\" required>\n");
      out.write("                <label class=\"detail\" for=\"address\">Địa chỉ</label>\n");
      out.write("                <input class=\"inf\" name=\"address\" required>\n");
      out.write("                <label class=\"detail\" for=\"uname\">Tên tài khoản</label>\n");
      out.write("                <input class=\"inf\" name=\"uname\" required>\n");
      out.write("                <label class=\"detail\" for=\"psw\">Mật khẩu</label>\n");
      out.write("                <input type =\"password\" class=\"inf\" name=\"psw\" required>\n");
      out.write("                <button class=\"btnDang\" type=\"submit\" onclick=\"mybtnDangKy()\">Đăng Ký</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-popup\" id=\"updateform\">\n");
      out.write("            <form action=\"UpdateAccount\" method=\"post\" class=\"form-container\">\n");
      out.write("                <p id=\"logintitle\">Thay đổi thông tin cá nhân</p>\n");
      out.write("                <label class=\"detail\" for=\"fname\">Họ tên</label>\n");
      out.write("                <input class=\"inf\" name=\"fname\" required>\n");
      out.write("                <label class=\"detail\" for=\"phonenum\">Số điện thoại</label>\n");
      out.write("                <input class=\"inf\" name=\"phonenum\" required>\n");
      out.write("                <label class=\"detail\" for=\"address\">Địa chỉ</label>\n");
      out.write("                <input class=\"inf\" name=\"address\" required>\n");
      out.write("                <label class=\"detail\" for=\"uname\">Tên tài khoản</label>\n");
      out.write("                <label class=\"inf\" name=\"uname\"> ");
      out.print(acc.getUsername());
      out.write(" </label>\n");
      out.write("                <label class=\"detail\" for=\"psw\">Mật khẩu</label>\n");
      out.write("                <input type =\"password\" class=\"inf\" name=\"psw\" required>\n");
      out.write("                <button class=\"btnDang\" type=\"submit\">Cập nhật thông tin</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var form;\n");
      out.write("            function showInvalid(show) {\n");
      out.write("                document.getElementById(\"invalid\").style.display = show;\n");
      out.write("            }\n");
      out.write("            function openForm(form) {\n");
      out.write("                document.getElementById(form).style.display = \"block\";\n");
      out.write("                showInvalid(\"none\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function closeForm(form) {\n");
      out.write("                document.getElementById(form).style.display = \"none\";\n");
      out.write("                showInvalid(\"none\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            var modal1 = document.getElementById('loginform');\n");
      out.write("            var modal2 = document.getElementById('signupform');\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (event.target === modal1) {\n");
      out.write("                    modal1.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                if (event.target === modal2) {\n");
      out.write("                    modal2.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            ");

                String inv;
                if ((inv = request.getParameter("invalid")) != null) {
      out.write("\n");
      out.write("            showInvalid(\"block\");\n");
      out.write("            document.getElementById(\"loginform\").style.display = \"block\";\n");
      out.write("            ");
}
                if (session != null) {
                    if (session.getAttribute("user") != null) {
      out.write("\n");
      out.write("            document.getElementById(\"login\").style.display = \"none\";\n");
      out.write("            document.getElementById(\"logged\").style.display = \"block\";\n");
      out.write("            ");
}
                }
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

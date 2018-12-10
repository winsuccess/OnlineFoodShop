package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.CartManager;
import java.util.Map;
import model.Item;
import model.Cart;
import model.FoodDAO;
import model.Food;
import model.Account;
import model.AccountDAO;
import model.Restaurant;
import model.RestaurantDAO;

public final class item_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- External files -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/item.css\">\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.2/css/all.css\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Rubik' rel='stylesheet'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab' rel='stylesheet'>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"nav1\">\n");
      out.write("            <a href=\"index.jsp\"><img id=\"logo\" src=\"logo.png\" alt=\"STARV\"> </a>\n");
      out.write("            <div id=\"login\">\n");
      out.write("                <button class=\"log\" onclick=\"openForm('loginform')\">Đăng nhập</button>\n");
      out.write("                <button class=\"log\" onclick=\"openForm('signupform')\">Đăng ký</button>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"logged\">\n");
      out.write("                <a href=\"LogOutServlet\"><button class=\"log\">Đăng xuất</button> </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"nav2\">\n");
      out.write("            <img id=\"itemimg\" src=\"imgsrc/resimg/");
      out.print(r.getPic());
      out.write("\" alt=\"\">\n");
      out.write("            <div id=\"detail\">\n");
      out.write("                <p id=\"direct\">Trang chủ >> Hà Nội</p>\n");
      out.write("                <p id=\"type\">");
      out.print(r.getType());
      out.write("</p>\n");
      out.write("                <p id=\"productname\">");
      out.print(r.getName());
      out.write("</p>\n");
      out.write("                <p id=\"adress\">");
      out.print(r.getAddress());
      out.write("</p>\n");
      out.write("                <p id=\"price\"><i class=\"fas fa-dollar-sign\"></i>");
      out.print(r.getPrice());
      out.write(" VND</p>\n");
      out.write("\n");
      out.write("                <table class=\"by\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Phí dịch vụ</th>\n");
      out.write("                        <th>Phí vận chuyển</th>\n");
      out.write("                        <th>Dịch vụ bởi</th>\n");
      out.write("                        <th>Chuẩn bị</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Free</td>\n");
      out.write("                        <td>");
      out.print(r.getDelivery());
      out.write("</td>\n");
      out.write("                        <td style=\"color: #ffd64d;\">Starv</td>\n");
      out.write("                        <td>");
      out.print(r.getPrepareTime());
      out.write(" phút</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"nav3\">\n");
      out.write("            <p id=\"thucdon\">THỰC ĐƠN</p>\n");
      out.write("            <div class=\"nav31\">\n");
      out.write("                <button id=\"itemtype\"> FRUIT TEA</button> <br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav32\">\n");
      out.write("                <button id=\"itemtype2\"> FRUIT TEA</button>\n");
      out.write("                ");

                    for (Food f : fDAO.getListFoodByRestaurant(Integer.parseInt(id))) {
                
      out.write("\n");
      out.write("                <div id=\"food\">\n");
      out.write("                    <img id=\"fimg\" src=\"imgsrc/foodimg/");
      out.print(f.getPic());
      out.write("\" alt=\"\">\n");
      out.write("                    <div id=\"fdetail\">\n");
      out.write("                        <p id=\"fname\">");
      out.print(f.getName());
      out.write("</p>\n");
      out.write("                        <p id=\"forder\">Đã được đặt <span>");
      out.print(f.getTimes());
      out.write("</span> lần</p>\n");
      out.write("                        <span id=\"fprice\"> ");
      out.print(f.getPrice());
      out.write("đ</span>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"CartServlet?command=add&id=");
      out.print(r.getId());
      out.write("&fid=");
      out.print(f.getId());
      out.write("\"> <button id=\"addfood\" type=\"button\" onclick=\"themHang()\"> +</button> </a>\n");
      out.write("\n");
      out.write("                </div>                         ");
}
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav33\">\n");
      out.write("                ");
for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
      out.write("\n");
      out.write("                <div id=\"itemadded\">\n");
      out.write("                    <div><a href=\"CartServlet?command=add&id=");
      out.print(r.getId());
      out.write("&fid=");
      out.print(list.getValue().getFood().getId());
      out.write("\"><button id=\"add\" type=\"button\" onclick=\"congHang()\">+</button></a>\n");
      out.write("                        <span id=\"fcount\">");
      out.print(list.getValue().getQuantity());
      out.write("</span>\n");
      out.write("                        <a href=\"CartServlet?command=sub&id=");
      out.print(r.getId());
      out.write("&fid=");
      out.print(list.getValue().getFood().getId());
      out.write("\"><button id=\"subtract\"type=\"button\" onclick=\"truHang()\">-</button></a>\n");
      out.write("                        <span id=\"fname2\">");
      out.print(list.getValue().getFood().getName());
      out.write("</span> </div>\n");
      out.write("                    <p id=\"fprice2\">");
      out.print(list.getValue().getFood().getPrice());
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                <div id=\"billrow\">\n");
      out.write("                    <p id=\"billtext1\"> Tổng: </p>\n");
      out.write("                    <p id=\"billtext2\">");
      out.print(cm.total());
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"billrow\">\n");
      out.write("                    <p id=\"billtext1\"> Phí vận chuyển: </p>\n");
      out.write("                    <p id=\"billtext2\">");
      out.print(r.getDelivery());
      out.write("  </p>\n");
      out.write("                </div>\n");
      out.write("                <button id=\"buy\" type=\"button\" onclick=\"muaHang()\">Mua Hàng</button>\n");
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
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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

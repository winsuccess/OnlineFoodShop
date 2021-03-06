package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.RestaurantManager;
import model.Account;
import model.Restaurant;
import model.RestaurantDAO;
import model.AccountDAO;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Category  |  Admin</title>\n");
      out.write("        <meta charset= \"UTF-8\" >\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/admin.css\" >\n");
      out.write("        <script src=\"js/admin.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            RestaurantDAO rdao = new RestaurantDAO();
            AccountDAO accDAO = new AccountDAO();
            RestaurantManager resm = new RestaurantManager();
            Account acc = new Account();
            if (request.getParameter("uname") != null) {
                String name = "";
                name = request.getParameter("uname");
                acc = accDAO.getAccount(name);
            }
        
      out.write("\n");
      out.write("        <div id=\"nav1\">\n");
      out.write("            <a href=\"index.jsp\"><img id=\"logo\" src=\"imgsrc/logo.png\" alt=\"STARV\"> </a>\n");
      out.write("            <div id=\"logged\">\n");
      out.write("                <a href=\"LogOutServlet\"><button class=\"log\">Đăng xuất</button></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"nav2\">\n");
      out.write("            <div class=\"left-content\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img alt=\"error\" src=\"imgsrc/admin-image.png\">\n");
      out.write("                    <span>Xin chào, Admin!</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"admin-home\">\n");
      out.write("                    <img alt=\"error\" src=\"imgsrc/icon/icon-homee.png\">\n");
      out.write("                    <a href=\"#\">BẢNG ĐIỀU KHIỂN</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-rows\" onclick=\"sidebarDrop(this)\">\n");
      out.write("                    <img alt=\"error\" src=\"imgsrc/icon/icon-trade.png\">\n");
      out.write("                    <span>QUẢN LÝ NHÀ HÀNG</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-contents\">\n");
      out.write("                    <div class=\"sidebar-contents-row\">\n");
      out.write("                        <img alt=\"error\" src=\"imgsrc/icon/icon-next-sidebar.png\">\n");
      out.write("                        <a href=\"#\">Giao dịch</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-rows\" onclick=\"sidebarDrop(this)\">\n");
      out.write("                    <img alt=\"error\" src=\"imgsrc/icon/icon-product.png\">\n");
      out.write("                    <span>NHÀ HÀNG</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-contents\">\n");
      out.write("                    <div class=\"sidebar-contents-row\">\n");
      out.write("                        <img alt=\"error\" src=\"imgsrc/icon/icon-next-sidebar.png\">\n");
      out.write("                        <a href=\"#\">Danh mục</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar-contents-row\">\n");
      out.write("                        <img alt=\"error\" src=\"imgsrc/icon/icon-next-sidebar.png\">\n");
      out.write("                        <a href=\"#\">Quản lý nhà hàng</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-rows\" onclick=\"sidebarDrop(this)\">\n");
      out.write("                    <img alt=\"error\" src=\"imgsrc/icon/icon-account-white.png\">\n");
      out.write("                    <span>TÀI KHOẢN</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-contents\">\n");
      out.write("                    <div class=\"sidebar-contents-row\">\n");
      out.write("                        <img alt=\"error\" src=\"imgsrc/icon/icon-next-sidebar.png\">\n");
      out.write("                        <a href=\"#\">Quản trị viên</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar-contents-row\">\n");
      out.write("                        <img alt=\"error\" src=\"imgsrc/icon/icon-next-sidebar.png\">\n");
      out.write("                        <a href=\"#\">Khách hàng</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body-content\">\n");
      out.write("                <div id=\"header\">\n");
      out.write("                    <p id=\"header-name-text\">Quản lý nhà hàng</p>\n");
      out.write("                    <div id=\"header-name-btn\">                 \n");
      out.write("                        <a href=\"res_add.jsp\" target=\"_blank\">\n");
      out.write("                            <button id=\"addnew\"><img src=\"imgsrc/add-icon.png\" style=\"width:16px;height:16px;\" alt=\"error\"> Thêm mới</button>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"table-header\">\n");
      out.write("                    <span>Có tổng cộng </span> \n");
      out.write("                    <span style=\"color: red\">");
      out.print(resm.countRestaurant());
      out.write("</span> \n");
      out.write("                    <span>nhà hàng</span>\n");
      out.write("                </div>\n");
      out.write("                <table id=\"myTable\" cellpadding=\"10\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Mã</th>\n");
      out.write("                        <th>Thông tin nhà hàng</th>\n");
      out.write("                        <th>Giá tiền</th>\n");
      out.write("                        <th>Đánh giá</th>\n");
      out.write("                        <th>Thao tác</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        for (Restaurant r : rdao.getListRestaurant()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"10%\">");
      out.print( r.getId());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <div class=\"product-image\">\n");
      out.write("                                <img alt=\"error\" src=\"imgsrc/resimg/");
      out.print(r.getPic());
      out.write("\" style=\"width:50px;height:50px;\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"product-text\">\n");
      out.write("                                <p>");
      out.print(r.getName());
      out.write("</p>\n");
      out.write("                                <p>");
      out.print(r.getAddress());
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td width=\"15%\">");
      out.print(r.getPrice());
      out.write("</td>\n");
      out.write("                        <td width=\"10%\">");
      out.print(r.getRating());
      out.write("</td>\n");
      out.write("                        <td width=\"15%\">\n");
      out.write("                            <a href=\"#\" title=\"Chỉnh sửa\">\n");
      out.write("                                <img src=\"imgsrc/edit.png\" alt=\"error\">\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"##\" title=\"Xóa\" onclick=\"delete_confirm(event)\">\n");
      out.write("                                <img src=\"imgsrc/icon-delete.png\" alt=\"error\">\n");
      out.write("                            </a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <div class=\"table-divider\">\n");
      out.write("                    <span>Trước</span>\n");
      out.write("                    <span>1</span>\n");
      out.write("                    <span>2</span>\n");
      out.write("                    <span>3</span>\n");
      out.write("                    ...\n");
      out.write("                    <span>99</span>\n");
      out.write("                    <span>Sau</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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

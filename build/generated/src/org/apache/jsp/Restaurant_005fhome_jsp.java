package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Restaurant;
import model.RestaurantDAO;

public final class Restaurant_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Category  |  Admin</title>\n");
      out.write("    <link href=\"/OnlineFoodShop/css/admin_1.css?v=1.0.0\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"/OnlineFoodShop/js/admin.js?v=1.0.1\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"left-content\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/text-logo.jpg\" width=\"100px\" height=\"166px\" >\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/admin-image.png\">\n");
      out.write("            <span>Xin chào, Admin!</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"admin-home\">\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-homee.png\">\n");
      out.write("            <a href=\"#\">BẢNG ĐIỀU KHIỂN</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-rows\" onclick=\"sidebarDrop(this)\">\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-trade.png\">\n");
      out.write("            <span>QUẢN LÝ NHÀ HÀNG</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-contents\">\n");
      out.write("            <div class=\"sidebar-contents-row\">\n");
      out.write("                <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-next-sidebar.png\">\n");
      out.write("                <a href=\"#\">Giao dịch</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-rows\" onclick=\"sidebarDrop(this)\">\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-product.png\">\n");
      out.write("            <span>NHÀ HÀNG</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-contents\">\n");
      out.write("            <div class=\"sidebar-contents-row\">\n");
      out.write("                <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-next-sidebar.png\">\n");
      out.write("                <a href=\"#\">Danh mục</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar-contents-row\">\n");
      out.write("                <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-next-sidebar.png\">\n");
      out.write("                <a href=\"#\">Quản lý nhà hàng</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-rows\" onclick=\"sidebarDrop(this)\">\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-account-white.png\">\n");
      out.write("            <span>TÀI KHOẢN</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-contents\">\n");
      out.write("            <div class=\"sidebar-contents-row\">\n");
      out.write("                <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-next-sidebar.png\">\n");
      out.write("                <a href=\"#\">Quản trị viên</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar-contents-row\">\n");
      out.write("                <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-next-sidebar.png\">\n");
      out.write("                <a href=\"#\">Khách hàng</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"right-content\">\n");
      out.write("        <div class=\"main-header\">\n");
      out.write("            <div class=\"btn-logout\">\n");
      out.write("                <img alt=\"errror\" src=\"/OnlineFoodShop/images/icon/icon-logout1.png\">\n");
      out.write("                <a href=\"#\">Đăng xuất</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header-name\">\n");
      out.write("            <div class=\"header-name-text\">\n");
      out.write("                <h1>Nhà Hàng</h1>\n");
      out.write("                <h4>Quản lý nhà hàng</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-name-btn\">\n");
      out.write("                <img src=\"/OnlineFoodShop/images/icon/plus.png\" alt=\"error\">\n");
      out.write("                <a href=\"/OnlineFoodShop/adminView/Restaurant_add.jsp\">Thêm mới</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"admin-message\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"table-header\">\n");
      out.write("            <span>Có</span>\n");
      out.write("            <span>5</span>\n");
      out.write("            <span>nhà hàng</span>\n");
      out.write("        </div>\n");
      out.write("        ");

            RestaurantDAO dao = new RestaurantDAO();
            ArrayList<Restaurant> list = dao.getListRestaurant();
        
      out.write("\n");
      out.write("        <table id=\"myTable\" cellpadding=\"10\">\n");
      out.write("            <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <th>Mã</th>\n");
      out.write("                <th>Thông tin nhà hàng</th>\n");
      out.write("                <th>Đánh giá</th>\n");
      out.write("                <th>Chuẩn bị</th>\n");
      out.write("                <th>Phí vận chuyển</th>\n");
      out.write("                <th>Thao tác</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 for(Restaurant r: list) { 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( r.getId() );
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"product-image\">\n");
      out.write("                        <img alt=\"error\" src=\"/OnlineFoodShop/images/product/");
      out.print( r.getPic() );
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product-text\">\n");
      out.write("                        <p>Tên:");
      out.print( r.getName() );
      out.write("</p>\n");
      out.write("                        <p>Giá TB:");
      out.print( r.getPrice() );
      out.write("</p>\n");
      out.write("                        <p>Địa chỉ: ");
      out.print( r.getAddress() );
      out.write("</p>\n");
      out.write("                        <p>Loại: ");
      out.print( r.getType() );
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("                <td>");
      out.print( r.getRating() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( r.getPrepareTime() );
      out.write(" phút</td>\n");
      out.write("                <td>");
      out.print( r.getDelivery() );
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"#\" title=\"Chỉnh sửa\">\n");
      out.write("                        <img src=\"/OnlineFoodShop/images/icon/edit.png\" alt=\"error\">\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"/OnlineFoodShop/deleteRestaurant?id=");
      out.print( r.getId() );
      out.write("\" title=\"Xóa\" onclick=\"delete_confirm(event)\">\n");
      out.write("                        <img src=\"/OnlineFoodShop/images/icon/icon-delete.png\" alt=\"error\">\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </tbody></table>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("    \n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Restaurant_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Product  |  Admin</title>\n");
      out.write("    <link href=\"/OnlineFoodShop/css/admin.css?v=1.0.0\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"/OnlineFoodShop/js/admin.js?v=1.0.0\"></script>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"left-content\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/text-logo.png\">\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/admin-image.png\">\n");
      out.write("            <span>Xin chào, Admin!</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"admin-home\">\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-homee.png\">\n");
      out.write("            <a href=\"#\">BẢNG ĐIỀU KHIỂN</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-rows\" onclick=\"sidebarDrop(this)\">\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-trade.png\">\n");
      out.write("            <span>QUẢN LÝ BÁN HÀNG</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-contents\">\n");
      out.write("            <div class=\"sidebar-contents-row\">\n");
      out.write("                <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-next-sidebar.png\">\n");
      out.write("                <a href=\"#\">Giao dịch</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-rows\" onclick=\"sidebarDrop(this)\">\n");
      out.write("            <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-product.png\">\n");
      out.write("            <span>SẢN PHẨM</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-contents\">\n");
      out.write("            <div class=\"sidebar-contents-row\">\n");
      out.write("                <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-next-sidebar.png\">\n");
      out.write("                <a href=\"#\">Danh mục</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar-contents-row\">\n");
      out.write("                <img alt=\"error\" src=\"/OnlineFoodShop/images/icon/icon-next-sidebar.png\">\n");
      out.write("                <a href=\"#\">Sản phẩm</a>\n");
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
      out.write("                <h1>Nhà hàng</h1>\n");
      out.write("                <h4>Thêm mới nhà hàng</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content-form\">\n");
      out.write("            <form action=\"/OnlineFoodShop/addRestaurant\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                <div class=\"content-form-rows\">\n");
      out.write("                    <span>Mã nhà hàng :</span>\n");
      out.write("                    <input class=\"rows-content-text\" name=\"res_id\" type=\"text\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-form-rows\">\n");
      out.write("                    <span>Tên nhà hàng :</span>\n");
      out.write("                    <input class=\"rows-content-text\" name=\"res_name\" type=\"text\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-form-rows\">\n");
      out.write("                    <span>Ảnh minh họa :</span>\n");
      out.write("                    <input class=\"rows-content-text\" name=\"res_image\" type=\"file\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-form-rows\">\n");
      out.write("                    <span>Địa chỉ :</span>\n");
      out.write("                    <input class=\"rows-content-text\" name=\"res_address\" type=\"text\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-form-rows\">\n");
      out.write("                    <span>Thể loại :</span>\n");
      out.write("                    <select name=\"res_type\" onchange=\"enableGroupId(this)\" class=\"rows-content-select\">\n");
      out.write("                        <option value=\"Đồ ăn\">Đồ ăn</option>\n");
      out.write("                        <option value=\"Đồ uống\">Đồ uống</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-form-rows\">\n");
      out.write("                    <span>Đánh giá:</span>\n");
      out.write("                    <input class=\"rows-content-text\" name=\"res_rate\" type=\"text\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-form-rows\">\n");
      out.write("                    <span>Thời gian chuẩn bị:</span>\n");
      out.write("                    <input class=\"rows-content-text\" name=\"res_prepare\" type=\"text\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-form-rows\">\n");
      out.write("                    <span>Giá TB:</span>\n");
      out.write("                    <input class=\"rows-content-text\" name=\"res_price\" type=\"text\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-form-rows\">\n");
      out.write("                    <span>Phí giao hàng :</span>\n");
      out.write("                    <input class=\"rows-content-text\" name=\"res_deliver\" type=\"text\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-form-btn\">\n");
      out.write("                    <a href=\"/OnlineFoodShop/adminView/Restaurant_home.jsp\">Hủy</a>\n");
      out.write("                    <input id=\"myButton\" type=\"submit\" value=\"Thêm mới\" onclick=\"checkText(event)\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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

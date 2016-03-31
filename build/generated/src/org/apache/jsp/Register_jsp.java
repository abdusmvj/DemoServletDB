package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            form{\n");
      out.write(" padding: 5px;\n");
      out.write("}\n");
      out.write(".form-element{\n");
      out.write("\tpadding: 5px;\t\n");
      out.write("}\n");
      out.write(".form-element input{\n");
      out.write("\tborder-radius: 3px;\n");
      out.write("\tborder: 1px solid #ccc;\n");
      out.write("\tpadding: 5px;\n");
      out.write("}\n");
      out.write(".form-element label{\n");
      out.write("\tdisplay: block;\n");
      out.write("\tpadding: 5px;\t\n");
      out.write("}\n");
      out.write(".form-element input:hover, .form-element input:focus{\n");
      out.write("\tbackground-color: #F2F2F2;\n");
      out.write("\tborder: 1px solid #000;\n");
      out.write("}\n");
      out.write(".button{\n");
      out.write("\tmargin: 5px;\n");
      out.write("\tpadding: 8px;\n");
      out.write("\tcolor: #000;\n");
      out.write("\tborder-radius: 4px;\t\n");
      out.write("\tbackground-color: #fff;\n");
      out.write("\tborder: 1px solid #ccc;\n");
      out.write("}\n");
      out.write(".button:hover{\n");
      out.write("\tbackground-color: #ccc;\t\n");
      out.write("\tborder: #000 solid 1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navigation ul{\n");
      out.write("\tlist-style-type: none;\n");
      out.write("}\n");
      out.write(".navigation ul li{\n");
      out.write("\tborder: 1px solid black;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tpadding: 10px;\n");
      out.write("}\n");
      out.write(".navigation ul li:hover{\n");
      out.write("\tbackground-color: #ccc;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: aqua;\">\n");
      out.write("\n");
      out.write("\t<div class=\"navigation\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"home.html\">Home</a></li><li>\n");
      out.write("\t\t\t<a href=\"new_entry.html\">New Entry</a></li><li>\n");
      out.write("\t\t\t<a href=\"datalists\">View Entries</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<h1>Phonebook Application</h1>\n");
      out.write("\t<div>\n");
      out.write("\t<h3>Create new Entry</h3>\n");
      out.write("\t<form  action=\"RegisterAction\" method=\"post\">\n");
      out.write("\t\t<div class=\"form-element\">\n");
      out.write("\t\t\t<label>Name:</label>\n");
      out.write("\t\t\t<input type=\"text\" name=\"name\">\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t\t<div class=\"form-element\">\n");
      out.write("\t\t\t<label>Phone no:</label>\n");
      out.write("\t\t\t<input type=\"number\" name=\"phone\">\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t\t<div class=\"form-element\">\n");
      out.write("\t\t\t<label>Location:</label>\n");
      out.write("\t\t\t<input type=\"text\" name=\"location\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div><input type=\"submit\" value=\"Submit\"></div>\n");
      out.write("\t\t\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
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

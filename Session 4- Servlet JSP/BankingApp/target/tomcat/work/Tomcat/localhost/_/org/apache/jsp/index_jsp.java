/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-29 15:49:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Welcome to ADHDFC bank! </title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>AHDFC Bank</h1>\n");
      out.write("<h2> Create new account </h2>\n");
      out.write("<form>\n");
      out.write("    <div>\n");
      out.write("        <h1>Register</h1>\n");
      out.write("        <p>Please fill in this form to create an account.</p>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <label for=\"name\"><b>Name</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Name\" name=\"name\" id=\"name\" required>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <label for=\"name\"><b>Account Number</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Account Number\" name=\"accountNumber\" id=\"accountNumber\" required>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <label for=\"name\"><b>Pin</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Pin\" name=\"pin\" id=\"pin\" required>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <label for=\"name\"><b>Initial Balance</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Initial Balance\" name=\"currentBalance\" id=\"currentBalance\" required>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <label for=\"accountType\">Choose account type :</label>\n");
      out.write("        <select id=\"accountType\">\n");
      out.write("            <option value=\"SavingsAccount\">Savings Account</option>\n");
      out.write("            <option value=\"CurrentAccount\">Current Account</option>\n");
      out.write("        </select>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <label for=\"email\"><b>Email</b></label>\n");
      out.write("        <input type=\"email\"  placeholder=\"Enter Email\" name=\"email\" id=\"email\" required>\n");
      out.write("\n");
      out.write("        <label for=\"psw\"><b>Password</b></label>\n");
      out.write("        <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" id=\"psw\" required>\n");
      out.write("\n");
      out.write("        <label for=\"psw-repeat\"><b>Repeat Password</b></label>\n");
      out.write("        <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" id=\"psw-repeat\" required>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <p>By creating an account you agree to our <a href=\"servlet\">Terms & Privacy</a>.</p>\n");
      out.write("        <button type=\"submit\" >Register</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <p>Already have an account? <a href=\"#\">Sign in</a>.</p>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        ");

            int a = 3;
            int b = 4;
            int c = a + b;
            out.println("c = " + c);
            session.setAttribute("user", "sandeep");
            out.println(session.getAttribute("user"));
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

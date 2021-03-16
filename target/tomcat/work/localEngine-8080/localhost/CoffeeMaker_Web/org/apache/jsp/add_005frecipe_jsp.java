package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.ncsu.csc326.coffeemaker.*;
import edu.ncsu.csc326.coffeemaker.exceptions.*;

public final class add_005frecipe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/head.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>CoffeeMaker - Add Recipe</title>\n");
      out.write("<style>\n");
      out.write("h1{\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("}\n");
      out.write("h3{\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("\tfont-size: 14pt;\n");
      out.write("}\n");
      out.write(".font1{\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("\tfont-size: 14pt;\n");
      out.write("}\n");
      out.write(".font_success{\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("\tfont-size: 14pt;\n");
      out.write("\tcolor: green;\n");
      out.write("}\n");
      out.write(".font_failure{\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("\tfont-size: 14pt;\n");
      out.write("\tcolor: red;\n");
      out.write("}\n");
      out.write("</style>");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div align=center class=\"font1\">\n");
      out.write("<h1>CoffeeMaker</h1>\n");
      out.write("<h3>Add a Recipe</h3>\n");

	String name = request.getParameter("name");
	String price = request.getParameter("price");
	String amtCoffee = request.getParameter("amtCoffee");
	String amtMilk = request.getParameter("amtMilk");
	String amtSugar = request.getParameter("amtSugar");
	String amtChocolate = request.getParameter("amtChocolate");
	
	CoffeeMaker cm = (CoffeeMaker)session.getAttribute("cm");
	
	if (name != null && !"null".equals(name)) {
	
		Recipe r = new Recipe();
		try {
			r.setName(name);
			r.setPrice(price);
			r.setAmtCoffee(amtCoffee);
			r.setAmtMilk(amtMilk);
			r.setAmtSugar(amtSugar);
			r.setAmtChocolate(amtChocolate);
							
			if (cm.addRecipe(r)) {
				
      out.write("\n");
      out.write("\t\t\t\t<span class=\"font_success\">");
      out.print(name + " successfully added." );
      out.write(" </span><br>\n");
      out.write("\t\t\t\t");

			} else {
				out.println("<span class=\"font_failure\">" + name + " could not be added.</span><br>");
			}
		} catch (RecipeException e) {
			out.println("<span class=\"font_failure\">" + e.getMessage() + "<br>");
		}
	}


      out.write("\n");
      out.write("<br>\n");
      out.write("<form method=\"post\" action=\"add_recipe.jsp\">\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"name\"></td><td><span class=\"font1\">Recipe Name</span></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"price\"></td><td><span class=\"font1\">Recipe Price (integer)</span></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"amtCoffee\"></td><td><span class=\"font1\">Units Coffee</span></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"amtMilk\"></td><td><span class=\"font1\">Units Milk</span></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"amtSugar\"></td><td><span class=\"font1\">Units Sugar</span></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"amtChocolate\"></td><td><span class=\"font1\">Units Chocolate</span></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"Add Recipe!\">\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<a href=\"index.jsp\"><span class=\"font1\">Back to CoffeeMaker Menu</span></a>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

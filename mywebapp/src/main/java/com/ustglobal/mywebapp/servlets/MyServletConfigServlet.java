package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletConfigServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String nameVal = config.getInitParameter("name");

		ServletContext context = getServletContext();
		String myParamVal = context.getInitParameter("myParam");

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		out.println("</body>");
		out.println("</html>");
		out.println("<h2> My config Param value is - " + nameVal + "</h2>");
		out.println("<h2> My context param value is -  " + myParamVal + "</h2>");
		out.println("</body>");
		out.println("</html>");

	}

}

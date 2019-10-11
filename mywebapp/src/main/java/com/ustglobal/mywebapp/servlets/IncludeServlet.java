package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		RequestDispatcher dispatcher = req.getRequestDispatcher("/Welcome.html");
		dispatcher.include(req, resp);

		resp.setContentType("text/html");

		out.println("</body>");
		out.println("</html>");
		out.println("<h3>it is include servlet - </h3>");
		out.println("<h3>line 2 - </h3>");
		out.println("</body>");
		out.println("</html>");

	}

}

package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myFirstServlet")
public class MyFirstServlets extends HttpServlet {
 public MyFirstServlets() {
	 System.out.println("initialisation");
 }
	
	@Override
		public void init() throws ServletException {
			System.out.println("init");
		}
	
	@Override
		public void destroy() {
			System.out.println("destroy");
		}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
		System.out.println("changes");
		System.out.println("chnage1");
		
		Date date = new Date();

		resp.setContentType("text/html");
		//resp.setHeader("refresh", "1");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta http-equi=\"refresh\" content = \"1\">");		
//		out.println("</head>");
		out.println("<h2> Current System Date & Time </br>");
		out.println(date);
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");

	}// End of doGet()

}// End of class

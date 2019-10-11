package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      Cookie[] cookies =req.getCookies();
      PrintWriter out = resp.getWriter();
      resp.setContentType("text/html");
      
      out.print("<head>");
      out.print("<body>");
      
      if(cookies != null) {
       for (Cookie cookie : cookies) {
		out.print("<h2>Cookie name = " +cookie.getName()+ "</h2>");
		out.print("<h2>Cookie value = " +cookie.getValue()+ "</h2>");
    	   }
      }else {
    	  out.print("<h2>cookie is not present</h2>");
      }
       out.print("</head>");
       out.print("</body>");
	}
	

}

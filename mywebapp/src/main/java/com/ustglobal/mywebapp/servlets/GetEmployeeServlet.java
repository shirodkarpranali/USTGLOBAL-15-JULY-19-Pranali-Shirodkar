package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getEmp")
public class GetEmployeeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		if (empId == 101) {
			out.println("<h2> Employee details for empId" + empId + "- </h2>");
			out.println("Id = 101</br>");
			out.println("Name = Pranali</br>");
			out.println("age = 20 </br>");
			out.println("salary = 50459</br>");
			out.println("phone = 56165146316533 </br>");
		} else {
			out.println("<h2 style=\"color : red\">Record not found for empid" + empId + "</h2>");
		}
		out.println("</body>");
		out.println("</html>");

	}

}

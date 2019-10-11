package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAO;
import com.ustglobal.mywebapp.dao.EmployeeDaoJpaImpl;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/addEmp")
public class AddEmployeeServlet extends HttpServlet {

	EmployeeDAO dao = new EmployeeDaoJpaImpl();

	EmployeeInfoBean eib = new EmployeeInfoBean();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session != null) {

			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);
			eib.setEmpId(empId);

			String empNameVal = req.getParameter("empName");
			eib.setEmpName(empNameVal);

			String ageVal = req.getParameter("age");
			int age = Integer.parseInt(ageVal);
			eib.setAge(age);

			String salVal = req.getParameter("salary");
			double salary = Double.parseDouble(salVal);
			eib.setSalary(salary);

			String designVal = req.getParameter("designation");
			eib.setDesignation(designVal);

			boolean add = dao.addEmployee(eib);

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");

			if (add) {
				out.println("<h2> Employee add successfully </h2>");
			} else {
				out.println("<h2> Employee not add </h2>");
			}
			out.println("</body>");
			out.println("</html>");
		}
	}
}

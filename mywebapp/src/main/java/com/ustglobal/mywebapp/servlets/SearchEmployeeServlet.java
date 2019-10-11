package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.mywebapp.dao.EmployeeDAO;
import com.ustglobal.mywebapp.dao.EmployeeDaoJpaImpl;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/searchEmp")
public class SearchEmployeeServlet extends HttpServlet {

	EmployeeDAO dao = new EmployeeDaoJpaImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session != null) {

			// Get the form data
			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);

			EmployeeInfoBean employeeInfoBean = dao.searchEmployee(empId);

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (employeeInfoBean != null) {
				out.println("<h3>Employee Data for employee Id" + empId + "</h3>");
				out.println("Employee Id :" + employeeInfoBean.getEmpId());
				out.println("</br> Employee Name :" + employeeInfoBean.getEmpName());
				out.println("</br> Employee Age : " + employeeInfoBean.getAge());
				out.println("</br> Employee Salary : " + employeeInfoBean.getSalary());
				out.println("</br> Designation " + employeeInfoBean.getDesignation());
			} else {
				out.println("<h2>Employee record for id" + empId + "not found!!! </h2>");
			}
			out.println("</html>");
			out.println("</body>");
		} else {
			resp.sendRedirect("./loginForm.html");
		}

	}// end of doGet

}

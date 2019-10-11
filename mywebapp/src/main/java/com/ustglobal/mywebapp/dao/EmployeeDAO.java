package com.ustglobal.mywebapp.dao;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

public interface EmployeeDAO {

	public EmployeeInfoBean searchEmployee(int id);

	public boolean addEmployee(EmployeeInfoBean employee);

	public EmployeeInfoBean login(int empId, String password);

	public void deleteEmployee(int id);

	public boolean updateEmployee(EmployeeInfoBean employee);

}// end of EmployeeDAO

package com.ustglobal.ust.ty.springrest.dao;

import java.util.List;

import com.ustglobal.ust.ty.springrest.dto.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee employee);

	public boolean removeEmployee(int id);

	public boolean modifyEmployee(Employee employee);

	public Employee getEmployee(int id);

	public List<Employee> getAllEmployees();
}

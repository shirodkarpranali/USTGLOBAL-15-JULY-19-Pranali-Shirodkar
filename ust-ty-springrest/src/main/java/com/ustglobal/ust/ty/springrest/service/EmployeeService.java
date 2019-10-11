package com.ustglobal.ust.ty.springrest.service;

import java.util.List;

import com.ustglobal.ust.ty.springrest.dto.Employee;
import com.ustglobal.ust.ty.springrest.dto.EmployeeResponse;

public interface EmployeeService {

	public boolean addEmployee(Employee employee);

	public boolean removeEmployee(int id);

	public boolean modifyEmployee(Employee employee);

	public Employee getEmployee(int id);

	public List<Employee> getAllEmployees();
}
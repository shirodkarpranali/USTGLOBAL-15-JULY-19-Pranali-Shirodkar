package com.dev.assesment;

public interface Employeee {

	public boolean insertion(String k,Employee e);
	
	public boolean searching(int id);
	
	public boolean delete(int id);
	
	public boolean update(String k,Employee email);
	
	public double totaltax(double salary);
	
	public void salaryGrade(String s, Employee e);
	
	public void netSalary(String s , Employee e);
	
	
	
}

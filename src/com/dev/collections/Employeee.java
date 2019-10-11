package com.dev.collections;

public interface Employeee {

	public boolean addEmployeee(String k, Employee e);

	Employee retrieve(String k);

	public Employee update(String key, Employee e);

	public boolean delete(String k);

	public void getAllEmployee();

	public boolean containsValue(String value);
}

package com.dev.assesment;

import java.util.HashMap;

public class Display implements Employeee {

	HashMap<String , Employee> ha=new HashMap<String , Employee>();

	public static void main(String[] args) {


	}

	@Override
	public boolean insertion(String k, Employee e) {
		ha.put(k, e);
		return true;
	}

	@Override
	public boolean searching(int id) {
		ha.containsKey(id);
		return true;
	}

	@Override
	public boolean delete(int id) {
		ha.remove(id);
		return true;
	}



	@Override
	public boolean update(String k, Employee email) {
		ha.put(k, email);
		return false;
	}

	@Override
	public double totaltax(double salary) {
		if(salary > 1000000) {
			double a=((9.35+5619)/100)*salary; 
			System.out.println(a);
		}
		else if((salary > 860000) && (salary <= 1000000) ) {
			double b=((8.87+4876)/100)*salary; 
			System.out.println(b);

		}
		else if((salary > 540000) && (salary <= 860000)) {
			double c=((8.19+4321)/100)*salary; 
			System.out.println(c);
		}
		else if((salary > 580000) && (salary <= 540000)) {
			double d=((7.34+3765)/100)*salary; 
			System.out.println(d);
		}
		else if((salary > 160000) && (salary <= 380000)) {
			double e=((5.4+3189)/100)*salary; 
			System.out.println(e);
		}else
		{
			System.out.println("enter proper salary");
		}

		return 0;
	}

	private boolean salary(int i, int j, int k) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void salaryGrade(String s, Employee e) {
		double salary = e.getSalary();
		if(salary > 1000000) {
			System.out.println("SALGRADE : AA" );
		}
		else if((salary > 860000) && (salary <= 1000000) ) {
			System.out.println("SALGRADE : A" );

		}
		else if((salary > 540000) && (salary <= 860000)) {
			System.out.println("SALGRADE : B" );
		}
		else if((salary > 580000) && (salary <= 540000)) {
			System.out.println("SALGRADE : C" );
		}
		else if((salary > 160000) && (salary <= 380000)) {
			System.out.println("SALGRADE : D" );
		}else
		{
			System.out.println("enter proper salary");
		}

	}

	@Override
	public void netSalary(String s, Employee e) {
		double salary =  e.getSalary();

		if(salary > 1000000) {
			double a=((9.35+5619)/100)*salary; 
			double a1 = salary - a;
			System.out.println(a1);
		}
		else if((salary > 860000) && (salary <= 1000000) ) {
			double b=((8.87+4876)/100)*salary; 
			double b1 = salary - b;
			System.out.println(b1);

		}
		else if((salary > 540000) && (salary <= 860000)) {
			double c=((8.19+4321)/100)*salary; 
			double c1 = salary - c;
			System.out.println(c1);
		}
		else if((salary > 580000) && (salary <= 540000)) {
			double d=((7.34+3765)/100)*salary; 
			double d1 = salary - d;
			System.out.println(d1);
		}
		else if((salary > 160000) && (salary <= 380000)) {
			double e2 =((5.4+3189)/100)*salary; 
			double e3 = salary - e2;

			System.out.println(e3);
		}else
		{
			System.out.println("enter proper salary");
		}

	}



}

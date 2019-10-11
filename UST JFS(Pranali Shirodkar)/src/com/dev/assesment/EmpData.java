package com.dev.assesment;

public class EmpData {

	public static void main(String[] args) {
	Display d=new Display();
		
		Employee e=new Employee();
		e.setEmpid(12);
		e.setEname("pranali");
		e.setEmail("shirodkar@gmail.com");
		e.setPassword("pra");
		e.setSalary(200000);
		
		Employee e1=new Employee();
		e1.setEmpid(2);
		e1.setEname("ashwini");
		e1.setEmail("pardeshi@gmail.com");
		e1.setPassword("ashu");
		e1.setSalary(300000);
		

		System.out.println(d.insertion("1", e));
		System.out.println(d.insertion("2", e1));
		
		System.out.println(d.searching(12));
		
	
		System.out.println(d.delete(2));
		
		System.out.println(d.update("pardeshi@gmail.com", e));
		d.totaltax(3000000);
		
		d.salaryGrade("1", e);
		d.netSalary("1", e);
		
		
		
		
		
		
		
		
		
		

	}

}

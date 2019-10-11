package com.dev.collections;

public class EmployeeData {

	public static void main(String[] args) {
		DisplayEmployee ps = new DisplayEmployee();

		Employee e = new Employee();
		e.setAge(15);
		e.setEmail("shir@gmail.com");
		e.setId(5);
		e.setName("Pranali");

		Employee e1 = new Employee();
		e1.setAge(20);
		e1.setEmail("shirod@gmail.com");
		e1.setId(1);
		e1.setName("pranav");

		Employee e2 = new Employee();
		e2.setAge(25);
		e2.setEmail("pardeshi@gmail.com");
		e2.setId(6);
		e2.setName("ashu");

		Employee e3 = new Employee();
		e3.setAge(28);
		e3.setEmail("parab@gmail.com");
		e3.setId(9);
		e3.setName("neha");

		System.out.println(ps.addEmployeee("1", e));
		System.out.println(ps.addEmployeee("2", e1));
		System.out.println(ps.addEmployeee("3", e2));
		System.out.println(ps.addEmployeee("4", e3));

		System.out.println(ps.retrieve("1"));
		System.out.println(ps.retrieve("2"));
		System.out.println(ps.retrieve("3"));
		System.out.println(ps.retrieve("4"));

		// Employee a1 = ps.retrieve("1");
		// System.out.println(a1);
		// Employee a2 = ps.retrieve("2");
		// System.out.println(a2);
		// Employee a3 = ps.retrieve("3");
		// System.out.println(a3);
		// Employee a4 = ps.retrieve("4");
		// System.out.println(a4);

		System.out.println(ps.update("1", e3));
		System.out.println(ps.retrieve("1"));

		System.out.println(ps.delete("3"));

		ps.getAllEmployee();

		boolean b1 = ps.containsValue("neha");
		System.out.println(b1);

	}

}

package com.dev.collections;

public class C2data {

	public static void main(String[] args) {
		C2 c = new C2();
		c.setEmail("pranali@gmail.com");
		c.setId(1);
		c.setName("pranali");

		C2 d = new C2();
		d.setEmail("ashwini@gmail.com");
		d.setId(2);
		d.setName("ashwini");

		C2 e = new C2();
		c.setEmail("jenny@gmail.com");
		c.setId(3);
		c.setName("jenny");

		C2 f = new C2();
		f.setEmail("palak@gmail.com");
		f.setId(4);
		f.setName("palak");

		System.out.println("name: " + c.getName());
		System.out.println("id: " + c.getId());
		System.out.println("name: " + c.getName());
		System.out.println("****************************");

	}

}

package com.dev.collections;

import java.util.HashSet;

public class C2 implements Comparable<C2> {
	private String name;
	private int id;
	private String email;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public static void main(String[] args) {
		HashSet<C2> ha = new HashSet<C2>();
		C2 c = new C2();
		c.setEmail("pranali@gmail.com");
		c.setId(1);
		c.setName("pranali");

		C2 d = new C2();
		d.setEmail("neha@gmail.com");
		d.setId(2);
		d.setName("neha");

		boolean a = ha.add(c);
		boolean b = ha.add(d);
		System.out.println("add" + a + " " + b);
		System.out.println(ha);

		c.setEmail("shirodkar@gmail");
		System.out.println(ha);

	}

	@Override
	public String toString() {
		return "C2 [name=" + name + ", id=" + id + ", email=" + email + ", password=" + password + ", getName()="
				+ getName() + ", getId()=" + getId() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int compareTo(C2 o) {

		return (this.id - o.id);
	}

}

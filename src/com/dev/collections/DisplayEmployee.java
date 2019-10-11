package com.dev.collections;

import java.util.HashMap;
import java.util.Iterator;

public class DisplayEmployee implements Employeee {

	HashMap<String, Employee> hm = new HashMap<String, Employee>();

	public static void main(String[] args) {

	}

	@Override
	public boolean addEmployeee(String k, Employee e) {
		hm.put(k, e);
		return true;

	}

	@Override
	public Employee retrieve(String k) {

		return hm.get(k);
	}

	@Override
	public Employee update(String key, Employee e) {

		return hm.put(key, e);
	}

	@Override
	public boolean delete(String k) {

		// if(hm != null) {
		hm.remove(k);
		return true;
		// }
		// return false;
	}

	@Override
	public void getAllEmployee() {
		// Iterator<String> a = hm.keySet().iterator();
		// while(a.hasNext()) {
		// Employee g = hm.get(a.next());
		System.out.println(hm);
	}

	@Override
	public boolean containsValue(String value) {
		hm.containsValue(value);
		return true;
	}

}

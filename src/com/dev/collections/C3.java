package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Dog;

public class C3 {

	public static void main(String[] args) {
		HashMap<String, Dog> hm = new HashMap<String, Dog>();

		Dog d = new Dog();
		d.setAge(1);
		d.setBreed("D M");
		d.setColor("black");
		d.setName("shiro");

		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setBreed("Dalmation");
		d1.setColor("black & white");
		d1.setName("Ronnie");

		Dog d2 = new Dog();
		d2.setAge(2);
		d2.setBreed("Dalmation");
		d2.setColor("black & white");
		d2.setName("wikkie");

		Dog d3 = new Dog();
		d3.setAge(2);
		d3.setBreed("Dalion");
		d3.setColor("black & white");
		d3.setName("wie");

		hm.put("1", d);
		// Dog b = hm.put("1", d1);
		// System.out.println(b);
		hm.put("2", d1);
		hm.put("3", d2);
		// System.out.println(hm);
		hm.put("4", d3);

		Dog f = hm.remove("2");
		System.out.println(f);
		System.out.println(hm);

		System.out.println("output of ContainsKey(): " + hm.containsKey("8"));

		System.out.println("output of ContainsValue(): " + hm.containsValue(d2));

	}

}

package com.ustg.usttyspringcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustg.usttyspringcore.beans.Animal;
import com.ustg.usttyspringcore.beans.HelloWorld;

public class XmlConfigApp {
	public static void main(String[] args) {
		HelloWorld obj1 = new HelloWorld();
		obj1.setMsg("hello world!!!!");
		System.out.println(obj1.getMsg());

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("beans.xml");//ApplicationContext helps to
		// create object
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj2 = context.getBean(HelloWorld.class);
		System.out.println(obj2.getMsg());
		System.out.println(obj2.getCount());

		obj2.getAnimal().makeSound();
		System.out.println(obj2.getMap());

		System.out.println("**********************************");
		// Animal animal= context.getBean(Animal.class);
		// animal.makeSound();

		Animal animal = (Animal) context.getBean("dog");
		animal.makeSound();

		System.out.println("**********************************");

		/*
		 * Pet pet=context.getBean(Pet.class); System.out.println(pet.getName());
		 * pet.getAnimal().makeSound();
		 */

	}
}

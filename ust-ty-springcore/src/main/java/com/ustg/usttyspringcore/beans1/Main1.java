package com.ustg.usttyspringcore.beans1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

		Author author = context.getBean(Author.class);
		System.out.println(author.getName());

		author.getWriter().write();
		System.out.println("****************");
	}

}

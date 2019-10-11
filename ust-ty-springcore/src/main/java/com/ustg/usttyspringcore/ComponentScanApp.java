package com.ustg.usttyspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustg.usttyspringcore.beans.HelloWorld;
import com.ustg.usttyspringcore.config.SpringConfig;

public class ComponentScanApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.getAnimal().makeSound();
	}

}

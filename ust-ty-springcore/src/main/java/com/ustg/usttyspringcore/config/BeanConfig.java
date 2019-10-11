package com.ustg.usttyspringcore.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustg.usttyspringcore.beans.Animal;
import com.ustg.usttyspringcore.beans.Dog;
import com.ustg.usttyspringcore.beans.HelloWorld;
import com.ustg.usttyspringcore.beans.Human;

@Configuration
public class BeanConfig {
	@Bean(name = "obj") // ,autowire = Autowire.BY_TYPE
	public HelloWorld getHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMsg("Hello World!!!!!!");
		helloWorld.setCount(100);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 890);
		helloWorld.setMap(map);
		// Animal animal = getDog();
		// helloWorld.setAnimal(animal);
		// helloWorld.setAnimal(getDog());
		return helloWorld;
	}

	@Bean(name = "dog")
	@Scope("prototype") // scope is prototype therefore it is not have destroy phase.it will handled by
						// garbage collector
	public Dog getDog() {
		return new Dog();
	}

	@Bean(name = "human")
	public Human getHuman() {
		return new Human();
	}

}

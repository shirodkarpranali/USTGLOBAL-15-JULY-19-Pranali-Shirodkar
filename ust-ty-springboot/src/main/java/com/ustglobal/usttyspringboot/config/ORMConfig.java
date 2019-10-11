package com.ustglobal.usttyspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

//  @Configuration // to make the class as configuration class
public class ORMConfig {

	// @Bean // it is used to configure entity manager factory and create the object
	// of
	// entity manager factory.
	public LocalEntityManagerFactoryBean ormConfiguration() { // LocalEntityManagerFactoryBean this is same as
		// EntityManagerFactory.
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("employee-unit");
		return bean;
	}

}

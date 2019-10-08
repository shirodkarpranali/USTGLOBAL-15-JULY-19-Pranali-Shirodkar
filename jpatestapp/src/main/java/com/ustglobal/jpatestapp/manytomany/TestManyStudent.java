package com.ustglobal.jpatestapp.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyStudent {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;

		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();

		Course course = em.find(Course.class, 10);
		List<Student> student = course.getStudent();
		for (Student student2 : student) {
			System.out.println(student2.getSid());
			System.out.println(student2.getSname());
		}

	}

}

package com.ustglobal.jpatestapp.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMany {

	public static void main(String[] args) {
		Course course = new Course();
		course.setCid(10);
		course.setCname("java");

		Course course1 = new Course();
		course1.setCid(11);
		course1.setCname("sql");

		ArrayList<Course> arrayList = new ArrayList<Course>();
		arrayList.add(course);
		arrayList.add(course1);

		Student student = new Student();
		student.setSid(101);
		student.setSname("rahul");
		student.setCourse(arrayList);

		Student student1 = new Student();
		student1.setSid(102);
		student1.setSname("vikas");
		student1.setCourse(arrayList);

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			System.out.println("unidirectional");
			em.persist(student);
			em.persist(student1);
			System.out.println("saved");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

}

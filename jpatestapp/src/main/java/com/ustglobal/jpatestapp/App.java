package com.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.dto.Movie;

public class App {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setId(103);
		movie.setName("Uri");
		movie.setRating("awesome movie");

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		// it will load all the necessary information present in persistence.xml
		// EntityManagerFactory is an interface.it is created only once.
		// EntityManagerFactory is also used to create object of entity manager.
		// it is used to create object of persistence
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			// EntityManager is used to connect with the database
			entityManager = entityManagerFactory.createEntityManager();
			// to make it permanently storage we used Entity transaction.
			transaction = entityManager.getTransaction();

			transaction.begin();
			// persist method is used to insert data
			entityManager.persist(movie);
			System.out.println("saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}
}

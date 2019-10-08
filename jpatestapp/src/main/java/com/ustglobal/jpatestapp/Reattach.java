package com.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.dto.Movie;

public class Reattach {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			transaction.begin();
			Movie movie = entityManager.find(Movie.class, 101);
			System.out.println(movie.getClass());
			System.out.println(movie.getId());
			System.out.println(movie.getName());
			System.out.println(movie.getRating());

			System.out.println(entityManager.contains(movie));

			entityManager.detach(movie);
			System.out.println(entityManager.contains(movie));
			movie.setRating("bad");
			entityManager.merge(movie);
			System.out.println(entityManager.contains(movie));
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}

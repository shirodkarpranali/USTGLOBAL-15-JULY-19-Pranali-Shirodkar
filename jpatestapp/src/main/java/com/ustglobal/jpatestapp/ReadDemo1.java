package com.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.dto.Movie;

public class ReadDemo1 {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			// Movie movie = entityManager.find(Movie.class, 1111);

			Movie movie = entityManager.getReference(Movie.class, 1111);
			// System.out.println(movie.getClass());

			System.out.println(movie.getId());
			System.out.println(movie.getName());
			System.out.println(movie.getRating());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}

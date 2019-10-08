package com.ustglobal.jpqa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpatestapp.dto.Movie;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "Delete from Movie where id='102' ";

			Query query = entityManager.createQuery(jpql);
			int count = query.executeUpdate();
			if (count > 0) {
				System.out.println("data is deleted");
			} else {
				System.out.println("data is not deleted");
			}

			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

}

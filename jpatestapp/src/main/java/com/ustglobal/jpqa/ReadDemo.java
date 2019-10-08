package com.ustglobal.jpqa;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpatestapp.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			String jpql = "from Movie";

			Query query = entityManager.createQuery(jpql);
			List<Movie> resultList = query.getResultList();
			for (Movie movie : resultList) {
				System.out.println(movie.getId());
				System.out.println(movie.getName());
				System.out.println(movie.getRating());
				System.out.println("***************************");
			}

			String jpql1 = "select name from Movie";

			Query query1 = entityManager.createQuery(jpql1);
			List<String> resultList1 = query1.getResultList();
			for (String string : resultList1) {
				System.out.println(string);
			}

			transaction.begin();
			String jpql2 = "update Movie set name='Dhoom2' where id=101 ";
			Query query2 = entityManager.createQuery(jpql2);
			int count = query2.executeUpdate();
			transaction.commit();
			if (count > 0) {
				System.out.println("data is updated");
			} else {
				System.out.println("data is not updated");
			}

			transaction.begin();
			String jpql3 = "update Movie set name= :nm where id= : id ";
			Query query3 = entityManager.createQuery(jpql3);
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the movie name");
			String mName = sc.nextLine();
			System.out.println("enter the movie id to update");
			int mId = Integer.parseInt(sc.nextLine());

			query3.setParameter("nm", mName);
			query3.setParameter("id", mId);
			int count1 = query3.executeUpdate();
			transaction.commit();
			if (count1 > 0) {
				System.out.println("data is updated....");
			} else {
				System.out.println("data is not updated...");
			}

			transaction.begin();
			String jpql4 = "Delete from Movie where id= : id ";
			Query query4 = entityManager.createQuery(jpql4);
			query4.setParameter("id", 103);

			int count2 = query4.executeUpdate();
			if (count2 > 0) {
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

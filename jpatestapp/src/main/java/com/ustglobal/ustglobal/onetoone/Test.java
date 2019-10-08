package com.ustglobal.ustglobal.onetoone;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter person id");
		int id = Integer.parseInt(sc.nextLine());
		person.setId(id);
		System.out.println("enter person name");
		String name = sc.nextLine();
		person.setName(name);
		VoterCard vc = new VoterCard();
		System.out.println("enter voter id");
		int vid = Integer.parseInt(sc.nextLine());
		vc.setVid(vid);
		System.out.println("enter voter name");
		String vname = sc.nextLine();
		vc.setName(vname);
		person.setVotercard(vc);
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			em.persist(person);
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

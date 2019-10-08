package com.ustglobal.ustglobal.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		// EntityTransaction tx = null;

		// try {
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		// tx = em.getTransaction();

		// tx.begin();

		VoterCard vc = em.find(VoterCard.class, 8);
		vc.getPerson().getId();
		vc.getPerson().getName();
		System.out.println("saved");
		System.out.println("***********************");

		// VoterCard vo=new VoterCard();
		// vo.setVid(1);
		// vo.setName("bbbb");
		// Person p=new Person();
		// p.setId(10);
		// p.setName("jenny");
		// vo.setPerson(p);
		// System.out.println("code successfully inserted");
		// tx.commit();
		//
		// } catch (Exception e) {
		// tx.rollback();
		// e.printStackTrace();
		// }finally {
		// em.close();
		// }

	}

}

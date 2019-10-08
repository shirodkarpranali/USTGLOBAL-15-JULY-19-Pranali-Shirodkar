package com.ustglobal.jpatestapp.onetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToMany {

	public static void main(String[] args) {
		Pencils p = new Pencils();
		p.setPid(1);
		p.setPname("pooja");

		Pencils p1 = new Pencils();
		p1.setPid(34);
		p1.setPname("shrutika");

		ArrayList<Pencils> penc = new ArrayList<Pencils>();
		penc.add(p);
		penc.add(p1);

		PencilBox box = new PencilBox();
		box.setBoxid(90);
		box.setBname("apsara");
		box.setPencils(penc);

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			System.out.println("unidirectionall");
			em.persist(box);
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

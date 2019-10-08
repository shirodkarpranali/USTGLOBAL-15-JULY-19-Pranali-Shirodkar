package com.ustglobal.jpatestapp.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOneToManyRead {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;

		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();

		PencilBox Box = em.find(PencilBox.class, 90);
		List<Pencils> pencil = Box.getPencils();
		for (Pencils pencils : pencil) {
			System.out.println(pencils.getPid());
			System.out.println(pencils.getPname());
		}

	}

}

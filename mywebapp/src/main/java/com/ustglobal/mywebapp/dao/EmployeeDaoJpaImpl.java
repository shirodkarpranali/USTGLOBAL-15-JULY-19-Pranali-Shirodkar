package com.ustglobal.mywebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

public class EmployeeDaoJpaImpl implements EmployeeDAO {
	EmployeeInfoBean eib = new EmployeeInfoBean();
	EntityManagerFactory emf = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;

	@Override
	public EmployeeInfoBean searchEmployee(int id) {
		emf = Persistence.createEntityManagerFactory("employee");
		manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = null;

		try {
			employeeInfoBean = manager.find(EmployeeInfoBean.class, id);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return employeeInfoBean;
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employee) {
		emf = Persistence.createEntityManagerFactory("employee");
		manager = emf.createEntityManager();
		transaction = manager.getTransaction();

		try {

			transaction.begin();

			manager.persist(employee);

			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return true;
	}

	@Override
	public EmployeeInfoBean login(int empId, String password) {
		emf = Persistence.createEntityManagerFactory("employee");
		manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = null;

		String jpaQuery = "from EmployeeInfoBean where empId = :id and password = :pwd";
		Query query = manager.createQuery(jpaQuery);
		query.setParameter("id", empId);
		query.setParameter("pwd", password);

		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;
	}

	@Override
	public void deleteEmployee(int id) {
		emf = Persistence.createEntityManagerFactory("employee");
		manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = null;
		transaction = manager.getTransaction();

		try {
			transaction.begin();
			employeeInfoBean = manager.find(EmployeeInfoBean.class, id);
			manager.remove(employeeInfoBean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employee) {
		emf = Persistence.createEntityManagerFactory("employee");
		manager = emf.createEntityManager();
		transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}

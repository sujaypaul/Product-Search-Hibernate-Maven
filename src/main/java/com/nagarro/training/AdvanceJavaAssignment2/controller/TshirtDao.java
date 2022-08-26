package com.nagarro.training.AdvanceJavaAssignment2.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nagarro.training.AdvanceJavaAssignment2.model.Tshirt;

public class TshirtDao {

	public static void saveTshirt(Tshirt tshirt) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// save the student object
			session.save(tshirt);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
//	            e.printStackTrace();
		}
	}

	


	public List<Tshirt> getStudents() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Student", Tshirt.class).list();
		}
	}

}

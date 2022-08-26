package com.nagarro.training.AdvanceJavaAssignment2.utility;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import com.nagarro.training.AdvanceJavaAssignment2.comparator.*;
import com.nagarro.training.AdvanceJavaAssignment2.controller.HibernateUtil;
import com.nagarro.training.AdvanceJavaAssignment2.model.Tshirt;

public class TshirtSearchOp {


	Scanner scn;

	public List<Tshirt> getMatchingTshirts(TshirtSearchIp tshirtsSerachIp) throws FileNotFoundException {

		String output = tshirtsSerachIp.getOutputPreference().name();


		Session session = HibernateUtil.getSessionFactory().openSession();
		String query = "from Tshirt where color=:color and gender=:gender and size=:size";

		Query q = session.createQuery(query);
		
		q.setParameter("color", tshirtsSerachIp.getColor());
		q.setParameter("gender", tshirtsSerachIp.getGender());
		q.setParameter("size", tshirtsSerachIp.getSize());

		List<Tshirt> matchedTshirts = q.list();
		
		System.out.println("\n\nYour choice of Output Preference is : ");

		if (output.equalsIgnoreCase("Price")) {

			Collections.sort(matchedTshirts, new PriceComparator());
			System.out.println(output);

		} else if (output.equalsIgnoreCase("Rating")) {

			Collections.sort(matchedTshirts, new RatingComparator());
			System.out.println(output);

		} else {

			Collections.sort(matchedTshirts, new PriceComparator());
			Collections.sort(matchedTshirts, new RatingComparator());
			System.out.println(output);

		}

		System.out.println("\n\n");

		return matchedTshirts;
	}

}

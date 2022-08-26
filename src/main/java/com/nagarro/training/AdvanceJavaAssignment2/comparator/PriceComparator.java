package com.nagarro.training.AdvanceJavaAssignment2.comparator;

import java.util.Comparator;

import com.nagarro.training.AdvanceJavaAssignment2.model.Tshirt;

public class PriceComparator implements Comparator<Tshirt> {
	
public int compare(Tshirt tshirt1,Tshirt tshirt2) {
		
		return (int)(tshirt1.getPrice()-tshirt2.getPrice());
	}

}

package com.nagarro.training.AdvanceJavaAssignment2.model;

import java.util.HashSet;

import com.nagarro.training.AdvanceJavaAssignment2.controller.TshirtCsvFileReader;

public class Data {
	
	public static HashSet<Tshirt>allTshirtData;
	
	public static void fetchData() {
//		allTshirtData = TshirtCsvFileReader.getAllTshirts();
		TshirtCsvFileReader.getAllTshirts();
	}

}

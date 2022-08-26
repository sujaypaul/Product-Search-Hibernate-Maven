package com.nagarro.training.AdvanceJavaAssignment2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nagarro.training.AdvanceJavaAssignment2.controller.Track;
import com.nagarro.training.AdvanceJavaAssignment2.model.Data;
import com.nagarro.training.AdvanceJavaAssignment2.model.Tshirt;
import com.nagarro.training.AdvanceJavaAssignment2.utility.TshirtSearchIp;
import com.nagarro.training.AdvanceJavaAssignment2.utility.TshirtSearchOp;
import com.nagarro.training.AdvanceJavaAssignment2.views.*;



public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException {
		String another = "N";
		Scanner sc = new Scanner(System.in);
		
		//thread to track modifications
		Track obj1 = new Track();
		Thread t = new Thread(obj1);
		t.start();
		
		//fetch data from CSV
		try {
			Data.fetchData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		do {
			
			Input input = new Input();
			TshirtSearchIp tshirtSearchIp = input.getInput();

			TshirtSearchOp tshirtSearchOp = new TshirtSearchOp();
			List<Tshirt> matchedTShirts = tshirtSearchOp.getMatchingTshirts(tshirtSearchIp);

			Output output = new Output();
			output.displayOutput(matchedTShirts);

			System.out.println("Search again ? y/n");
			another = sc.nextLine();
			
		} while (another.equalsIgnoreCase("y"));
		
		sc.close();
		t.stop();
		System.out.println("-------------closed------------");
	}
}

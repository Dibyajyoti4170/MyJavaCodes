package com.arraylistprograms;

import java.util.ArrayList;

public class HetroAl {
	
	public static void main(String[] args) {
		ArrayList hetro = new ArrayList();
		hetro.add(new Bike("Red",60));
		hetro.add(new Employee("Vishnu",1));
		hetro.add(new Movie("KGF",8.9));
		hetro.add(10);
		System.out.println(hetro);
	}

}

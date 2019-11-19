package com.arraylistprograms;

public class Bike {
	
	String colour;
	double milege;
	
	Bike()
	{
		
	}

	public Bike(String colour, double milege) {
		this.colour = colour;
		this.milege = milege;
	}

	@Override
	public String toString() {
		
		return ("[" +colour+ "," +milege+"]");
	}
	
	
	
	
	

	

}

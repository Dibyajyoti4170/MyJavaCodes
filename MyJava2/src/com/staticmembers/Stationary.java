package com.staticmembers;

class Stationary {
	static int price;
	static String colour;
	
	static void writing()
	{
		System.out.println(" marker of colour " + colour + " is writing ");
	}
	public static void main(String[]args)
	{
		System.out.println(Stationary.price);
		System.out.println(Stationary.colour);
		Stationary.price=100;
		Stationary.colour="Black";
		System.out.println(" marker colour " + Stationary.colour + " Marker price is "+Stationary.price);
		Stationary.price=80;
		Stationary.colour="Blue";
		System.out.println(" marker colour " + Stationary.colour + " Marker price is "+Stationary.price);	
		Stationary.writing();
	}
	

}

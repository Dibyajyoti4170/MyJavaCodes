package com.polymorphism;

//using a method to display
public class Main4 {
	static void display(Bank bank)
	{
		System.out.println(bank.roi());
		
		
	}

	public static void main(String[] args) {
		Bank b1;
		b1=new ICICI();
		display(b1);
		b1=new CanaraBank();
		display(b1);
		b1=new SBI();
		display(b1);
		b1=new SBIInTouch();
		display(b1);
		// TODO Auto-generated method stub

	}

}
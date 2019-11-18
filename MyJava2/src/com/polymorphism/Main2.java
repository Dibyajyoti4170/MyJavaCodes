package com.polymorphism;

public class Main2 {

	public static void main(String[] args) {
		
		Bank bank;
		bank=new SBI();
		System.out.println(bank.roi());
		bank=new CanaraBank();
		double b=bank.roi();
		System.out.println(b);
		bank=new ICICI();
		System.out.println(bank.roi());
		bank=new SBIInTouch();
		System.out.println(bank.roi());

	}

}

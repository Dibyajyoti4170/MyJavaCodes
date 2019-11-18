package com.polymorphism;

public class Main3 {

	public static void main(String[] args) {
		
		Bank b []=new Bank[4];
		b[0]=new SBI();
		b[1]=new ICICI();
		b[2]=new SBIInTouch();
		b[3]=new CanaraBank();
		
		for( Bank bank:b)
		{
			System.out.println(bank.roi());
		}
		
	}
}
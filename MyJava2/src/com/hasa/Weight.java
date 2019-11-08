package com.hasa;

public class Weight {
	 double kg;
	 Weight(double kg)
	 {
		 this.kg=kg; 
	 }
}
 class Coin{
	 
	 Weight w1 = new Weight(2.1);
	 String colour;
	 Coin(String colour)
	 {
		 this.colour = colour;
	 }
 public static void main(String[] args)
 {
	Coin c1 = new Coin("Golden");
	System.out.println(c1.w1.kg);
	System.out.println(c1.colour);
 }
 }
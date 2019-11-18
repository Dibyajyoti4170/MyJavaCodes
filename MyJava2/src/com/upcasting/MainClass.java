package com.upcasting;

public class MainClass {

	public static void main(String[] args) {
		
		A ob1 = new B();//upcasting
		
		System.out.println(ob1.i);
		
		//System.out.println(ob1.j);//cte: here using reference var. of parent type we cannot access the members of child type. 

        B ob2 = new B();//upcasting
		
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		
		A ob3 = ob2;//upcasting
		System.out.println(ob3.i);
		
		//System.out.println(ob3.j);//cte: here using reference var. of parent type we cannot access the members of child type. 
	}

}

package com.Final;

public class Demo1 {
   
	public static void main(String[] args) {
		
		final int i = 30;
		System.out.println(i);
		System.out.println("--------------");
		//System.out.println(i++);//
		System.out.println("--------------");
		//System.out.println(i+=1);//
		System.out.println("--------------");
		System.out.println(i+1);
		System.out.println("--------------");
		
	}

}
//OUTPUT BEFORE USING FINAL KEYWORD.
//30
//--------------
//30
//--------------
//32
//--------------
//33
//--------------

//OUTPUT AFTER USING FINAL KEYWORD.
//30
//--------------
//--------------
//--------------
//31
//--------------

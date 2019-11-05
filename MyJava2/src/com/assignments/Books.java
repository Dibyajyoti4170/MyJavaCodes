package com.assignments;

public class Books {
	
	String name;
	int price;
	int isbn;
	Books(String name,int price, int isbn)
	{
		this.name=name;
		this.isbn=isbn;
		this.price=price;
	}
		void genre()
		{
			System.out.println(name+" THIS BOOK IS OF THRILLER");
		}
		
	}


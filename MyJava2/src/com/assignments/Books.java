package com.assignments;

public class Books {
	
	String name;
	int price;
	int isbn;
	
	void genre(String genre)
	{
		System.out.println(genre+" is the genre ");
	}
	Books()
	{
		
	}
	Books(String name,int price, int isbn)
	{
		this.name=name;
		this.isbn=isbn;
		this.price=price;
	}
		
	}


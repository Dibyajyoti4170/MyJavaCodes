package com.assignment_03;

public class MovieCls {

	public static void main(String[] args) 
	{
		Movie m1 = new Movie("Bharate", 2019, 4.8);
	    Movie m2 = new Movie("3 idots", 2009,4.5);
	    Movie m3 = new Movie("oh my friend",2011,3.9);
	    System.out.println("Movie name : "+m1.name);
	    System.out.println("Year Of Release : "+ m1.yearOfRelease);
	    System.out.println("Ratings : "+ m1.ratings);
	    
	    System.out.println("Movie name : "+m2.name);
	    System.out.println("Year Of Release : "+ m2.yearOfRelease);
	    System.out.println("Ratings : "+ m2.ratings);

	    System.out.println("Movie name : "+m3.name);
	    System.out.println("Year Of Release : "+ m3.yearOfRelease);
	    System.out.println("Ratings : "+ m3.ratings);


	}

}

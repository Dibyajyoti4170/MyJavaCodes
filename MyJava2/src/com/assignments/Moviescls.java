package com.assignments;

public class Moviescls {
	
	public static void main(String[] args) 
	{
		Movies m1 = new Movies("war", 2019, 6.8);
	    Movies m2 = new Movies("chichore", 2019,8.5);
	    Movies m3 = new Movies("joker",2019,8.8);
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


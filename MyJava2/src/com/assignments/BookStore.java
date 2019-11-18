package com.assignments;

public class BookStore {
	
	public static void main(String[]args) 
	{
	  Books[]shelf = {new Books( "THE SILENT PATIENT", 1450 , 1),new Books(" THE WIFE BETWEEN US ", 1550 , 2)
			  ,new Books(" THE GIRL ON THE TRAIN ", 1650 , 3),new Books(" BEFORE I GO TO SLEEP ", 1750 , 4)
			  ,new Books(" WOMAN IN THE WINDOW ", 1850 , 5)};	
	  for (int n=0;n<shelf.length;n++)
	  {
		  System.out.println(shelf[n].name + "  " + shelf[n].price + "   " + shelf[n].isbn);
		  shelf[n].genre("thriller");
	  }
	  
	}

}

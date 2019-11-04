package com.assignments;

public class songscls {

	public static void main(String[] args) 
	{
		songs sng1 = new songs("dilbar", "neha kakkar");
        songs sng2 = new songs("saki saki" , "neha kakkar") ;	
        System.out.println("Song : "+sng1.name);
        System.out.println("Singer : "+sng1.singer);
        System.out.println("Song : "+sng2.name);
        System.out.println("Singer : "+sng2.singer);
	}
}




package com.assignment_03;

public class SongCls
{

	public static void main(String[] args) 
	{
		Song sng1 = new Song("kanada kadalige", "c Ashwath");
        Song sng2 = new Song("jai hoo" , "vijay prakash") ;	
        System.out.println("Song : "+sng1.name);
        System.out.println("Singer : "+sng1.singer);
        System.out.println("Song : "+sng2.name);
        System.out.println("Singer : "+sng2.singer);
	}
}

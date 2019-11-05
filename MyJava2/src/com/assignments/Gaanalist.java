package com.assignments;

public class Gaanalist {

	public static void main(String[] args) {
	
		Gaana[] Gaanalist = new Gaana[5];
		Gaanalist[0] =  new Gaana("ABC","abc",123);
		Gaanalist[1] =  new Gaana("DEF","def",124);
		Gaanalist[2] =  new Gaana("GHI","ghi",125);
		Gaanalist[3] =  new Gaana("JKL","jkl",126);
		Gaanalist[4] =  new Gaana("MNO","mno",127);
		
		for(Gaana ob : Gaanalist)
		{
			System.out.println("name: "+ob.name);
			System.out.println("singer: "+ob.singer);
			System.out.println("likes: "+ob.likes);
			
		}

	}

}

package exceptionhandling;

public class E14 {
	
	static void m1() throws ClassNotFoundException
	{
		System.out.println("from m1()");
		Class.forName("java.util.Scanner");
		System.out.println("m1 done");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("from main");
		m1();
		System.out.println("main ends");
	}
	}
//output
//from main
//from m1()
//m1 done
//main ends


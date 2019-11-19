package exceptionhandling;

public class E10 {
	
	static void m3()
	{
		System.out.println("from m3()");
		int [] a = {1,2,3,4,5,6,7};
		System.out.println(a[8]);
		System.out.println("m3() ends");
	}
	static void m2()
	{
		System.out.println("from m2()");
		m3();
		System.out.println("m2() ends");
	}
	static void m1()
	{
		System.out.println("from m1()");
		m2();
		System.out.println("m1() ends");
	}
				public static void main(String[] args) {
					System.out.println("from main");
					m1();
					System.out.println("main ends");
				}
				
	}
//output
/*from main
from m1()
from m2()
from m3()
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
	at exceptionhandling.E10.m3(E10.java:9)
	at exceptionhandling.E10.m2(E10.java:15)
	at exceptionhandling.E10.m1(E10.java:21)
	at exceptionhandling.E10.main(E10.java:26)//*/



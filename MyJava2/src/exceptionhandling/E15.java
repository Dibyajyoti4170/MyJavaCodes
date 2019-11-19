package exceptionhandling;

public class E15 {
	
	static void m1() throws ClassNotFoundException
	{
		System.out.println("from m1()");
		Class.forName("java.util.Scanner");
		System.out.println("m1 done");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		try
		{
			m1();
		}
		catch(ClassNotFoundException c)
		{
			c.printStackTrace();
		}
		System.out.println("main ends");
	}

}

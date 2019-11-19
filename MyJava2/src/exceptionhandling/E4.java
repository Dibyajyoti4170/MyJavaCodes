package exceptionhandling;

public class E4 {

	public static void main(String[] args) {
		System.out.println("ARITHMETIC EXCEPTION WITH TRY AND CATCH");
		System.out.println("main starts");
		System.out.println("***********");
		int a = 10;
		int b = 0;
		
		try
		{
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception has occurred and is caught");
		}
		System.out.println("main ends");

	}
}
//output
//ARITHMETIC EXCEPTION WITH TRY AND CATCH
//main starts
//***********
//exception has occurred and is caught
//main ends


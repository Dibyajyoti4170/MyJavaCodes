package exceptionhandling;

public class E7 {

	public static void main(String[] args) {
		System.out.println("ARITHMETIC EXCEPTION WITH TRY AND MULTIPLE CATCH");
		System.out.println("main starts");
		System.out.println("***********");
		double a = 10.0;
		double b = 0;
		System.out.println("***********");
		int  [] x = {10,20,30,40,50,60,70,80,90,100};
		System.out.println(x[2]);
		System.out.println(x[5]);
		System.out.println(x[8]);
		System.out.println(x[3]);
		
		try
		{
			double c = a/b;
			System.out.println(c);
			
			System.out.println(x[11]);
			System.out.println("+++++++++++++++++++++++");
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception has occurred and is caught");
		}
		
		catch(ArrayIndexOutOfBoundsException b1)
		{
			System.out.println("exception has occurred and is caught ");
		}

	}

}

package exceptionhandling;

public class E8 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		System.out.println("main starts");
		try
		{
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception has occurred and is caught");
		}
		finally
		{
			System.out.println("statements executed successfully");
		}
	}

}
//OUTPUT 
//main starts
//exception has occurred and is caught
//statements executed successfully

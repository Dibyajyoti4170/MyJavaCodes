package exceptionhandling;

public class E9 {

	public static void main(String[] args) {
		
		try
		{
			main(null);
		}
		catch(StackOverflowError e)
		{
			System.out.println("caught");
		}
		System.out.println("main ends");

	}

}

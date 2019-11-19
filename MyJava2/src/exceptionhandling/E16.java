package exceptionhandling;

public class E16 {

	public static void main(String[] args) {
		{
			System.out.println("from main");
			try
			{
				System.out.println("from try");
			}
			catch(ClassNotFoundException c)
			{
				System.out.println("caught");
			}
		}

	}

}

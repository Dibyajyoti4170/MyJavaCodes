package exceptionhandling;

public class E12 {

	public static void main(String[] args) {
		
		System.out.println("main started");
		try {
			Class.forName("java.util.Scanner");
			System.out.println("exception not occured");
		}
		catch(ClassNotFoundException c)
		{
			c.printStackTrace();
		}
		System.out.println("main ends");

	}

}

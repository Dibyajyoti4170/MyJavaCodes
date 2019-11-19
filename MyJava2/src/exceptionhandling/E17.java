package exceptionhandling;

public class E17 {
	
	static void test()
	{
		try {
			Class.forName("java.util.Scanner");
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("caught");
		}
	}
	public static void main(String[] args) {
		try
		{
			test();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("caught");
		}
	}

}

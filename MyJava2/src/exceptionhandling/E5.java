package exceptionhandling;

public class E5 {
	
	int i;

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(1);
		System.out.println("**********");
		E5 ob = new E5();
		E5 ob1 = null;
		System.out.println("***********");
		try {
			System.out.println(ob1.i);
			System.out.println("***********");
		}
		catch(NullPointerException n)
		{
			System.out.println("exception has occurred and is caught ");
		}
		
	}

}
//output
//main starts
//1
//**********
//***********
//exception has occurred and is caught
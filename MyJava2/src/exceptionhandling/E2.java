package exceptionhandling;

public class E2 {
	
	int i;
	
	public static void main(String[] args) {
		
		
		System.out.println("main starts");
		System.out.println(1);
		System.out.println("**********");
		E2 ob = new E2();
		E2 ob1 = null;
		System.out.println("***********");
		System.out.println(ob1.i);
		System.out.println("***********");
		
		
		
	}
}

//output
//Exception in thread "main" java.lang.NullPointerException
//at exceptionhandling.E2.main(E2.java:16)
//main starts
//1
//**********
//***********

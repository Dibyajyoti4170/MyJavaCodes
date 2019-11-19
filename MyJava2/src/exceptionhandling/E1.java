package exceptionhandling;

public class E1 {

	public static void main(String[] args) {
	
		System.out.println("main starts");
		int a = 10;
		//int b = 0;
		int b = 10;
		int c = a/b;
		System.out.println(c);
		System.out.println("*********");
        System.out.println("main ends");
	}

}
//if b=0; output is-
//main starts
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at exceptionhandling.ArithmeticException.main(ArithmeticException.java:10)

// if b=1, output is-
//main starts
//1
//*********
//main ends

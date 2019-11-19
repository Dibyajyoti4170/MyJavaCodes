package exceptionhandling;

public class E13 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println("main started");
		Class.forName("java.util.Scanner");
		System.out.println("main ends");
	}

}
//OUTPUT
//main started
//main ends
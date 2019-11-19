package exceptionhandling;

public class E3 {

	public static void main(String[] args) {
		
		System.out.println("main starts");
		System.out.println("***********");
		int [] a = {10,20,30,40,50,60,70,80,90,100};
		System.out.println(a[2]);
		System.out.println(a[5]);
		System.out.println(a[8]);
		System.out.println(a[3]);
		System.out.println(a[11]);
        
	}

}
//output
//main starts
//***********
//30
//60
//90
//40
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 11
	//at exceptionhandling.E3.main(E3.java:14)


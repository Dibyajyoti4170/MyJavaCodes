package exceptionhandling;

public class E6 {

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println("***********");
		int [] a = {10,20,30,40,50,60,70,80,90,100};
		System.out.println(a[2]);
		System.out.println(a[5]);
		System.out.println(a[8]);
		System.out.println(a[3]);
		try {
			System.out.println(a[11]);
			System.out.println("+++++++++++++++++++++++");
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("exception has occurred and is caught ");
		}
		

	}

}
//OUTPUT BEFORE USING EXCEPTION MECHANISM
//main starts
//***********
//30
//60
//90
//40
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 11
	//at exceptionhandling.E3.main(E3.java:14)
//*********************************************************************************************************************************
//OUTPUT AFTER EXCEPTION HANDLING MECHANISM
//main starts
//***********
//30
//60
//90
//40
//exception has occurred and is caught 


package exceptionhandling;

public class E11 { 
	static void m3()
	{
		System.out.println("from m3()");
		int [] a = {1,2,3,4,5,6,7};
        try
        {
        	System.out.println(a[8]);
        }
        catch(NullPointerException n)
        {
        	System.out.println("caught"+n);
        	n.printStackTrace();
        }
        System.out.println("m3()ends");
	}
	static void m2()
	{
		System.out.println("from m2()");
		try
		{
			m3();
			System.out.println("m2() ends");
				
		}
		catch(RuntimeException r)
		{
			System.out.println("caught"+r);
        	r.printStackTrace();
		}
		
		static void m1()
		{
			System.out.println("from m1()");
			try
			{
				m2();
				System.out.println("m1() ends");
					
			}
			finally
			{
				System.out.println("finally executed");
			}

			public static void main()
			{
				System.out.println("main starts");
				m1();
				System.out.println("main ends");
			}
			
			
}
}
}

	

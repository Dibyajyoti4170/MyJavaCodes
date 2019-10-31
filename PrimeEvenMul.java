class PrimeEvenMul
{
	public static void main(String[] args) 
	{
		int n1=200;
		int n2=300;

		for (int i=n1;i<=n2;i++)
		{
			if(isPrime(i))
				System.out.println(i+" is Prime number");
			
			if(isEven(i))
				System.out.println(i+" is Even number");

			if(mulOf3(i))
				System.out.println(i+" is multiple of 3");
		}
	}


	public static boolean isPrime(int a)
	{
		int CountOfFactors=2;
		for (int i=2;i<=a/2;i++)
		{
			if(a%i==0)
				CountOfFactors++;
		}
		return CountOfFactors==2;
	}

	public static boolean isEven(int a)
	{	
		return a%2==0;
	}

	public static boolean mulOf3(int a)
	{
		return a%3==0;
	}
}

       










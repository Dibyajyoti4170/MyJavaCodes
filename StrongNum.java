class StrongNum 
{
	public static void main(String[] args) 
	{
		int n = 145;
		int num = n;
		while(num>0)
		{
			num = num / 10;
			count++ ;
		}
		
		
		int num2 = n;
		int sum = 0;
		for (int i=count; i>0; i--)
		{
			int fact = 1;
			int digit = num2 % 10;
			for (int j=digit; j>0; j--)
			{
				fact = fact * j;
			}

			sum = sum + fact;
			num2 = num2 / 10;
		}


		if(sum == n)
			System.out.println(n+" is a Strong number");
		else
			System.out.println(n+" is not a Strong number");
	}
}

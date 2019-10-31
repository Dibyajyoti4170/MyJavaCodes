class factorial 
{
	public static void main(String[] args) 
	{
		long factorial = 1;
		int n = 8;
		for (int i=1;i<=n;i++)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}
}


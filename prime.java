class prime 
{
	public static void main(String[] args) 
	{
		int num=30;
			//to iterate the numbers from 2 to 30.
		for (int x=2;x<=num;x++)
		{
			int count=2;
			// counting factors of n.
			for (int i=2;i<=x/2;i++)
			{
				if (x%i==0)
					count++;
			}
				if (count==2)
					System.out.println(x);
		}
	}
}

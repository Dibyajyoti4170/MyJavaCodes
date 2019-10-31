class multiple 
{
	public static void main(String[]args) 
	{
		int num=36;
        if (num%3==0 && num%5==0)
        {
			System.out.println(num+ " is a multiple of 3 and 5");
        }
		else if (num%5==0 )
			System.out.println(num+"is a multiple of 5");
			else if (num%3==0)
				{
				System.out.println(num+"is a multiple of 3");
				}
			else
				System.out.println("user should be good in mathematics");
	}
}
//num=70,o/p----->is a multiple of 5.
//num=48,o/p----->is a multiple of 3.
//num=37,o/p----->user should be good at mathematics.
//num=105,o/p---->is a multiple of 5.
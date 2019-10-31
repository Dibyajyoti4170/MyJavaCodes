import java.util.Scanner;
class factors 
{
	public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter the no.- ");
	int num = reader.nextInt();
	//int count = 0;
	for (int i=1;i<=num;i++)
	{
		if (num%i==0)
			count++;
			System.out.println(i);
	}
	//System.out.println(count);
	}
}

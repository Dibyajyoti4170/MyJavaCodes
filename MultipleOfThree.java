import java.util.Scanner;
class MultipleOfThree
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter the range till which you want to check- ");
		int num = reader.nextInt();
		int sum = 0;
		for (int i=1;i<=num;i++)
		{
			if (i%3==0)
				sum = sum+i;
		}
		System.out.println(sum);
	}
}

import java.util.Scanner;
class numbers 
{
	public static void numbersToPrint(int n)
	{
		for (int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("enter a number- ");
		int n = reader.nextInt();
		numbersToPrint(n);
	}
}

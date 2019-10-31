import java.util.Scanner;
class multiTable 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number you want to check for:- ");
		int n = reader.nextInt();
		System.out.print("please enter the stop limit- ");
        int limit = reader.nextInt();
		for (int i=1;i<=limit;i++)
		{
			System.out.println(n+"*"+i+"=" +n*i);
		}
		
	}
}

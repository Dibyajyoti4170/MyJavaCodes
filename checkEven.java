import java.util.Scanner;
class checkEven
{
	public static boolean isEven(int n)
	{
		return(n%2==0);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.");
		int n=sc.nextInt();
			System.out.println(isEven(n));
	}
}

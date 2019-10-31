 import java.util.Scanner;
class amstrong 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
	    System.out.print("enter a no. you want to check for- ");
		int num = reader.nextInt();
		int reminder, result = 0, originalno;
		originalno = num;
		while (originalno!=0)
		{
			reminder = originalno % 10;
			result = result + (num*num*num);
			num = num/10;
		}
		if (originalno == num)
		System.out.println(num+ " is a amstrong");
		else
			System.out.println(num+ " is not a amstrong");
	}
}

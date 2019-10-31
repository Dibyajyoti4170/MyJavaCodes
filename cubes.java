import java.util.Scanner;
class cubes 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter the range");
		int range = reader.nextInt();
		for (int i=1;i<=range;i++)
		{
			System.out.println(i+"*"+i+"*"+i+"="+i*i*i);
		}
	}
}

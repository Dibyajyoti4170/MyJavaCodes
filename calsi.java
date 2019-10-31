import java.util.Scanner;
class calsi 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
        
		System.out.println("please enter your choice");
		int i=reader.nextInt();
		int a=120;
		int b=40;
		switch (i)
		{
		case 1 :System.out.println(a+b);
		        break;
	    case 2 :System.out.println(a-b);
		        break;
	    case 3 :System.out.println(a*b);
		        break;
	    case 4 :System.out.println(a/b);
		        break;
	    case 5 :System.out.println(a%b);
		        break;
        default:System.out.println("undefined input");       
		
		}
	}
}

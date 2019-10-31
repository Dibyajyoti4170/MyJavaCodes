class  sum
{
	public static int summation(int a,int b)//in place of void we have written a return type.
	{
		int sum=a+b;//used to store the value of the sum of a and b.
		return sum;// used to display the sum at the end.
	}
	public static void main(String[] args)//this is executed first because JVM understand the main method.
	{
		int sum = summation(10,29);//here we declare the values of a and b 
		if (sum%2==0)//checks whether the number is even or odd.
		System.out.println(sum+" is even");
		else
			System.out.println(sum+" is odd");
	}
}
